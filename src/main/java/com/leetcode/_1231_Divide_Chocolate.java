package com.leetcode;

/*
You have one chocolate bar that consists of some chunks. Each chunk has its own sweetness given by the array sweetness.

You want to share the chocolate with your k friends so you start cutting the chocolate bar into k + 1 pieces using k cuts, each piece consists of some consecutive chunks.

Being generous, you will eat the piece with the minimum total sweetness and give the other pieces to your friends.

Find the maximum total sweetness of the piece you can get by cutting the chocolate bar optimally.
 */
public class _1231_Divide_Chocolate {

    public int maximizeSweetness(int[] sweetness, int k) {

        int left = 1;
        int right = sweetness.length;

        for (int i = 0; i < sweetness.length; i++) {
            right = Math.max(right, sweetness[i]);
        }


        while (left < right) {

            //       int mid = left + (right - left) / 2;
            int mid = (left + right + 1) / 2;
            System.out.println("left>" + left);
            System.out.println("right>" + right);
            System.out.println(mid);

            if (check(sweetness, mid, k)) {

                left = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println();


        return right;
    }


    private boolean check(int[] sweetness, int mid, int k) {

        int countGroups = 0;
        int suma = 0;

        for (int i = 0; i < sweetness.length; i++) {

            suma +=  sweetness[i];

            if (suma >= mid) {
                countGroups += 1;
                suma = 0;
            }
        }

        System.out.print(countGroups == k + 1);
        return countGroups >= k + 1;
    }


}
