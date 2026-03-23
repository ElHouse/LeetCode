package com.leetcode;

public class _1920_Build_Array_from_Permutation {


    public int[] buildArray(int[] nums) {
        recursive(nums, 0);
        return nums;
    }


    public void recursive(int[] nums, int i) {

        if (i >= nums.length) {
            return;
        }

        int newValue = nums[nums[i]];
        recursive(nums, i + 1);
        nums[i] = newValue;
    }

}
