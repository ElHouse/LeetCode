package com.leetcode;

public class _303_Range_Sum_Query_Immutable {


    private int[] nums;
    private int[] prefix;

    public _303_Range_Sum_Query_Immutable(int[] nums) {

        if(nums.length  == 0) return ;

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        this.prefix = prefix;
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        return prefix[right] - prefix[left] + nums[left];
    }


}
