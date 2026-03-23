package com.leetcode;

public class _32_Longest_Valid_Parentheses {


    public int longestValidParentheses(String s) {

        int response = 0;
        int size = s.length();

        while (size > 0) {

            for (int i = 0; i + size < s.length(); i++) {

                if ((size + 1) % 2 != 0) {
                    continue;
                }

                String subString = s.substring(i, i + size + 1);

                if (isValid(subString)) {
                    return subString.length();
                }
            }
            size--;
        }

        return response;
    }

    private boolean isValid(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
                if (count < 0) return false;
            }
        }

        return count == 0;
    }


}
