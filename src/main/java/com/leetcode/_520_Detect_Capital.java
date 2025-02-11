package com.leetcode;

public class _520_Detect_Capital {


    //	Runtime: 1 ms, faster than 100.00% of Java online submissions for Detect Capital.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Detect Capital.
    public boolean detectCapitalUse(String word) {

        int count = 0;

        if (word == null || word.isEmpty()) return false;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            if (65 <= c && c <= 90) {
                count++;
            }
        }

        if (count == word.length()) return true;
        else if (count == 1) {
            char c = word.charAt(0);
            if (65 <= c && c <= 90) {
                return true;
            } else {
                return false;
            }
        } else if (count > 1) {
            return false;
        }

        return true;
    }


}