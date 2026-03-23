package com.leetcode;


/*
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.



Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15
 */
public class _930_Binary_Subarrays_With_Sum {


    public int numSubarraysWithSum(int[] nums, int goal) {


        int r = 0;
        int l = 0;
        int count = 0;
        int suma = 0;

        for (; r < nums.length; r++) {
            suma += nums[r];

            if (goal == suma) {
                count++;
            }


            while (goal < suma) {
                suma -= nums[l];
                l++;
            }
        }

        for (; l < nums.length; l++) {
            suma += nums[l];

            if (goal == suma) {
                count++;
            }


            while (goal < suma) {
                suma -= nums[l];
                l++;
            }
        }

        if (goal == suma) {
            count++;
        }

        return count;
    }

}
