package com.leetcode;


import java.util.Arrays;

/*

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */
public class _209_Minimum_Size_Subarray_Sum {


    public int minSubArrayLen(int target, int[] nums) {

        if (nums.length < 1)
            return 0;

        int left = 0;
        int suma = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            suma += nums[i];

            while (suma >= target) {

                suma -= nums[left];
                min = Math.min(min, i - left + 1);
                left++;
            }
        }

        return min == Integer.MAX_VALUE?0:min;
    }


}
