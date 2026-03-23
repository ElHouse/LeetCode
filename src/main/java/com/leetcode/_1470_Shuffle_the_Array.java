package com.leetcode;

public class _1470_Shuffle_the_Array {


    public int[] shuffle(int[] nums, int n) {

        int[] response = new int[n * 2];
        int pos = 0;

        for (int i = 0, j = n; i < n; i++, j++) {
            response[pos++] = nums[i];
            response[pos++] = nums[j];
        }


        return response;
    }
}
