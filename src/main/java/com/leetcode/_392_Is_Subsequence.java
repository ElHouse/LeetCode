package com.leetcode;

public class _392_Is_Subsequence {

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
*/

    public boolean isSubsequence(String s, String t) {

        if (s == null || t == null) return false;
        if (s.isEmpty()) return true;

        int ii = 0;
        int jj = s.length() - 1;
        int count = 0;
        int i = 0;
        int j = t.length() - 1;

        while (i <= j && ii <= jj) {

            if (t.charAt(i) == s.charAt(ii) && t.charAt(j) == s.charAt(jj) && ii == jj) {
                count++;
                ii++;
                jj--;
                if (count == s.length()) {
                    return true;
                }
            }

            if (t.charAt(i) == s.charAt(ii)) {
                count++;
                ii++;
                if (count == s.length()) {
                    return true;
                }
            }

            if (t.charAt(j) == s.charAt(jj)  && i != j ) {
                count++;
                jj--;
                if (count == s.length()) {
                    return true;
                }
            }

            i++;
            j--;
        }


        return false;
    }


}
