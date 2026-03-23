package com.hackerRank;

public class _16_alternating_characters {


    public int alternatingCharacters(String s) {

        int count = 0;
        char prev = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                prev = s.charAt(i);
            }else {
                count++;
            }
        }

        return count;

    }

}
