package com.leetcode;

public class _1684_Count_the_Number_of_Consistent_Strings {


    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (String word : words) {

            boolean allMatch = true;

            for (int i = 0; i < word.length(); i++) {
                if (!allowed.contains(word.charAt(i)+"")) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                count++;
            }
        }

        return count;
    }
}
