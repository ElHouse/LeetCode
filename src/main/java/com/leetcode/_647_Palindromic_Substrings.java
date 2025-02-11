package com.leetcode;

public class _647_Palindromic_Substrings {

    //	Runtime: 285 ms, faster than 5.03% of Java online submissions for Palindromic Substrings.
//	Memory Usage: 36.7 MB, less than 44.30% of Java online submissions for Palindromic Substrings.
    public int countSubstrings(String s) {

        int count = 0;
        if (s == null || s.isEmpty()) return count;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) count++;
            }
        }

        return count;
    }


    public boolean isPalindrome(String a) {


        StringBuilder sb = new StringBuilder(a);
        sb.reverse();

        return sb.toString().equals(a);
    }


}
