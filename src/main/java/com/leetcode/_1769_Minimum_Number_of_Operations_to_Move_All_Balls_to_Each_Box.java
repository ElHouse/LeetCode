package com.leetcode;

public class _1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {


    public int[] minOperations(String boxes) {

        if (boxes == null || boxes.isBlank()) return null;

        int[] response = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {

            int sum = 0;
            for (int j = 0; j < boxes.length(); j++) {

                if (i == j) continue;

                if (boxes.charAt(j) == '1') {
                    sum += Math.abs(i - j);
                }

            }
            response[i] = sum;
        }

        return response;
    }


}
