package com.leetcode;

public class _3498_Reverse_Degree_of_a_String {


    public int reverseDegree(String s) {

        int response = 0;
        int mult = 1;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int value = 26 - (letter - 'a');
            response += value * mult++;
        }

        return response;
    }

}
