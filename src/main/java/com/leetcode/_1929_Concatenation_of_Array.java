package com.leetcode;

import java.sql.PreparedStatement;

public class _1929_Concatenation_of_Array {


    public int[] getConcatenation(int[] nums) {

        int[] response = new int[nums.length * 2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            response[i] = nums[i];
            response[i + n] = nums[i];
        }


        return response;
    }
}
