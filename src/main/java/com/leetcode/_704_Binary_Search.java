package com.leetcode;

public class _704_Binary_Search {


    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
//	Memory Usage: 39 MB, less than 100.00% of Java online submissions for Binary Search.
    public int search(int[] nums, int target) {

        int x = 0;
        int y = nums.length - 1;
        int m = y / 2 + (y % 2);

//    	System.out.println("yy->"+y);
        if (y == 0) {
            return nums[0] == target ? 0 : -1;
        }

        while (y != (x + 1)) {

            System.out.println("------->" + nums[m]);

            if (nums[m] < target) {
                x = m;
            } else if (nums[m] > target) {
                y = m;
            } else {
                return m;
            }

            m = ((y + x) / 2) + ((y + x) % 2);
            System.out.println("x>" + x);
            System.out.println("y>" + y);
            System.out.println("m>" + m);


        }

        if (nums[x] == target) {
            return x;
        } else if (nums[y] == target) {
            return y;
        } else {
            return -1;
        }


    }


}
