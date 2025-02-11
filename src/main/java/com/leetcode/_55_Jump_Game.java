package com.leetcode;

public class _55_Jump_Game {

    public boolean canJump(int[] nums) {

        return  process2(nums);
    }

    private boolean process2(int[] nums) {


        int meta = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] >=  meta - i) {
                meta = i;
            }

        }

        return meta == 0;
    }




}
