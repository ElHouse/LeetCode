package com.leetcode;

public class _154_Find_Minimum_in_Rotated_Sorted_Array_II {


    public int findMin(int[] nums) {

        if (nums == null || nums.length == 0)
            return -1;

        int n = findPivot(nums);

        return nums[n == -1 ? 0 : n];
    }

    public int findPivot(int[] nums) {

        int x = 0;
        int y = nums.length - 1;

        while (y > x) {

            int mid = (y + x) / 2 + (y + x) % 2;

            System.out.println("x>" + x);
            System.out.println("y>" + y);
            System.out.println("mid>" + mid);
            if (mid == 0) {
                System.out.println("return  | >");
                return nums.length;
            }
            if (nums[mid - 1] > nums[mid]) {
                System.out.println("return  || >");
                return mid;
            } else {
                if (nums[mid] > nums[x]) {
                    x = mid;
                } else if (nums[mid] < nums[x]) {
                    y = mid;
                } else {
                    y--;
                }
            }

        }

        return -1;
    }


}
