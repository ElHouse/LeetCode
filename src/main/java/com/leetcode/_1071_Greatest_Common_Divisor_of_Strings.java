package com.leetcode;

public class _1071_Greatest_Common_Divisor_of_Strings {

    /*

    For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:

    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:

    Input: str1 = "LEET", str2 = "CODE"
    Output: ""
     */

    public String gcdOfStrings(String str1, String str2) {

        String response = "";

        if (str1.length() < str2.length()) {
            String aux = str1;
            str1 = str2;
            str2 = aux;
        }

        for (int i = 0; i < str2.length(); i++) {

            String prefix = str2.substring(0, str2.length() - i);
            int countA = process(str1, prefix);
            int countB = process(str2, prefix);

            if (countA == 0) continue;
            if (countB == 0) continue;

            return prefix;
        }

        return response;
    }


    private int process(String str1, String prefix) {

        int count = 0;

        for (int j = 0; j < str1.length(); j += prefix.length()) {

            if (j + prefix.length() > str1.length()) {
                count = 0;
                break;
            }
            String prefixB = str1.substring(j, j + prefix.length());
            if (prefix.equals(prefixB)) {
                count++;
            } else {
                count = 0;
                break;
            }
        }

        return count;
    }

}
