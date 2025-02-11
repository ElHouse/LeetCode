package com.leetcode;

public class _383_Ransom_Note {

    //	Runtime: 5 ms, faster than 48.04% of Java online submissions for Ransom Note.
//	Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Ransom Note.
    public boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote == null) return false;
        if (magazine == null) return false;

        int[] lettersM = new int[26];
        int[] lettersR = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            lettersM[magazine.charAt(i) - 97]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            lettersR[ransomNote.charAt(i) - 97]++;
        }

        for (int i = 0; i < lettersR.length; i++) {
            if (lettersM[i] < lettersR[i]) {
                return false;
            }
        }

        return true;
    }

}
