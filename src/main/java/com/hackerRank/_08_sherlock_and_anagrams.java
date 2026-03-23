package com.hackerRank;

import java.util.*;

/**
 * Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
 */
public class _08_sherlock_and_anagrams {

    public int sherlockAndAnagrams(String s) {

        int response = 0;

        for (int size = 1; size < s.length(); size++) {


            for (int i = 0; i + size < s.length(); i++) {

                String aux = sortString(s, i, size);

                for (int j = i + 1; j + size - 1 < s.length(); j++) {

                    String aux2 = sortString(s, j, size);
                    if (aux.equals(aux2)) {
                        response++;
                    }
                }
            }
        }

        return response;
    }

    private String sortString(String str, int i, int size) {
        String aux = str.substring(i, i + size);
        char[] letters = aux.toCharArray();
        Arrays.sort(letters);

        return new String(letters);
    }

}
