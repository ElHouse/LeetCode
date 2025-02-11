package com.leetcode;

public class _1768_Merge_Strings_Alternately {

    private StringBuilder sb = null;

    public String mergeAlternately(String word1, String word2) {
        sb = new StringBuilder();

        int max = Math.max(word1.length(), word2.length());

        for (int i = 0; i < max; i++) {
            getLetter(word1, word2, i);
        }

        return sb.toString();
    }


    private String getLetter(String word1, String word2, int i) {

        if (i < word1.length()) {
            sb.append(word1.charAt(i));
        }

        if (i < word2.length()) {
            sb.append(word2.charAt(i));
        }

        return sb.toString();
    }


}
