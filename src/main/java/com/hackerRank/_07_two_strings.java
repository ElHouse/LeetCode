package com.hackerRank;

import java.util.HashSet;

/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.
 */
public class _07_two_strings {


    public String twoStrings(String s1, String s2) {

         HashSet<Object> set = new HashSet<>();


        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }


}
