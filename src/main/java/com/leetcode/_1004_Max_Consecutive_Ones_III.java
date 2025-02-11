package com.leetcode;

public class _1004_Max_Consecutive_Ones_III {


/*

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

*/

    public int longestOnes2(int[] nums, int k) {

        int max = 0;

        int sum = 0;
        int countZero = 0;

        int i = 0;
        int j = 0;

        for (; j < nums.length; j++) {

            int zero = nums[j];

            if (zero == 0) {
                countZero++;

                if (countZero > k) {
                    break;
                }
                zero++;
            }

            sum = sum + zero;
        }

        if (max < sum) {
            max = sum;
        }

        j++;

        for (int l = i + 1; l < nums.length; l++) {

            int prev = nums[l - 1];

            if (prev == 0) {
                countZero--;

            }

            sum--;

            for (; j < nums.length; ) {

                int next = nums[j];

                if (next == 0) {
                    countZero++;
                    j++;
                }else {
                    j++;
                    sum++;
                }

                if (countZero > k) {
                    break;
                }
            }


            if (sum > max) {
                max = sum;
            }

        }


        if (sum > max) {
            max = sum;
        }


        return max;
    }

    //Runtime
    // 2442ms            Beats 5.00%
    public int longestOnes(int[] nums, int k) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int countZero = 0;

            for (int j = i; j < nums.length; j++) {

                int zero = nums[j];

                if (zero == 0) {
                    countZero++;

                    if (countZero > k) {
                        break;
                    }
                    zero++;
                }

                sum = sum + zero;
            }

            if (sum > max) {
                max = sum;
            }

        }


        return max;
    }
}
