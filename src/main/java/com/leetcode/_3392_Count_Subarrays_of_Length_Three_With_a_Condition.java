package com.leetcode;

public class _3392_Count_Subarrays_of_Length_Three_With_a_Condition {


    public int countSubarrays(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int borders = nums[i] + nums[i + 2];
            double half = ((double) nums[i+1]) / 2.0;

            result = half == borders ? result + 1 : result;
        }

        return result;
    }

}
