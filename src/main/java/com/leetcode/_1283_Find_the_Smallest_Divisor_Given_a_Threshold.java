package com.leetcode;

/*
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.
 */
public class _1283_Find_the_Smallest_Divisor_Given_a_Threshold {

    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (check(nums, mid, threshold)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;//min
    }


    private boolean check(int[] nums, int divisor, int threshold) {

        int suma = 0;

        for (int i = 0; i < nums.length; i++) {

            double resultado = (double) nums[i] / divisor;
            suma += (int) Math.ceil(resultado);
        }

        return threshold >= suma;
    }


}
