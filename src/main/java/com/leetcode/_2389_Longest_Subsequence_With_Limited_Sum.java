package com.leetcode;

import java.util.Arrays;

/*
You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 */
public class _2389_Longest_Subsequence_With_Limited_Sum {


    public int[] answerQueries(int[] nums, int[] queries) {

        int[] response = new int[queries.length];
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {

            int numberToSearch = queries[i];

            int left = 0;
            int right = nums.length;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (mid >= nums.length) break;

                if (nums[mid] > numberToSearch) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (right >= nums.length) {
                response[i] = nums.length;
            } else {
                response[i] = right + 1;
            }

        }

        return response;
    }


}
