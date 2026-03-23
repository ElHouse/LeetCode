package com.leetcode;

import java.util.*;

public class _767_Reorganize_String {
/*
Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.



Example 1:

Input: s = "aab"
Output: "aba"
Example 2:

Input: s = "aaab"
Output: ""

*/


    public String reorganizeString(String s) {

        var charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        List<Pair> cache = new ArrayList<>();


        char[] letters = s.toCharArray();

        Arrays.sort(letters);

        char letter = letters[0];
        int count = 1;
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letter) {
                count++;
            } else {
                cache.add(new Pair(letter, count));
                count = 1;
                letter = letters[i];
            }
        }
        cache.add(new Pair(letter, count));

        Character letterAux = getLetter(cache, '@');
        sb.append(letterAux);

        while (!cache.isEmpty()) {
            letterAux = getLetter(cache, letterAux);
            if (letterAux == null) return "";
            sb.append(letterAux);
        }

        return sb.toString();
    }

    private Character getLetter(List<Pair> cache, Character notLetter) {

        Collections.sort(cache);

        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i).c != notLetter) {
                Pair aux = cache.get(i);
                aux.v--;
                cache.remove(i);
                if (aux.v > 0) {
                    cache.add(aux);
                }
                return aux.c;
            }
        }

        return null;
    }

    private class Pair implements Comparable<Pair> {

        Character c;
        Integer v;

        Pair(Character c, Integer v) {
            this.c = c;
            this.v = v;
        }

        @Override
        public int compareTo(Pair o) {
            return o.v - v;
        }
    }

}
