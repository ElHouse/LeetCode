package com.leetcode;

public class _283_Move_Zeroes {

    public void moveZeroes(int[] nums) {

        if (nums == null) return;
        if (nums.length <= 1) return;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {

                        nums[i] = nums[j];
                        nums[j] = 0;
                        j = nums.length;

                    }
                }
            }
        }
    }

}
