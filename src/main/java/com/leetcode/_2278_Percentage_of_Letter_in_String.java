package com.leetcode;

public class _2278_Percentage_of_Letter_in_String {


    public int percentageLetter(String s, char letter) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }


        if (count == 0) return 0;


        return (int) (((double) count / (double) s.length()) * 100);
    }
}
