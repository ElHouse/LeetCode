package com.leetcode;

public class _643_Maximum_Average_Subarray_I {
/*

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
*/

    //3 ms Beats 78.26%
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int j = k - 1;
        double max;
        int sum = 0;

        for (int l = i; l <= j; l++) {
            sum += nums[l];
        }

        max = sum;

        i++;
        j++;

        for (; j < nums.length; i++, j++) {

            sum = sum + nums[j] - nums[i - 1];
            if (max < sum) {
                max = sum;
            }
        }

        return max / k;
    }


    //2607ms           Beats   5.00%
    public double findMaxAverage2(int[] nums, int k) {


        int i = 0;
        int j = k - 1;
        double max = Integer.MIN_VALUE;

        for (; j < nums.length; i++, j++) {

            int sum = 0;
            for (int l = i; l <= j; l++) {
                sum += nums[l];
            }

            max = Math.max(max, (double) sum / k);

        }


        return max;
    }
}
