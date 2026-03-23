package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class _451_Sort_Characters_By_Frequency {
/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/


    public String frequencySort(String s) {

        List<Pair> pares = new ArrayList<>();
        char[] letters = s.toCharArray();

        Arrays.sort(letters);

        Character aux = letters[0];
        int count = 1;

        for (int i = 1; i < letters.length; i++) {
            if (!aux.equals(letters[i])) {
                pares.add(new Pair(aux, count));
                count = 1;
                aux = letters[i];
            } else {
                count++;
            }
        }
        pares.add(new Pair(aux, count));


        return pares.stream().sorted().map(Pair::toString).collect(Collectors.joining());
    }

    private class Pair implements Comparable<Pair>{

        private final Character c;
        private final Integer n;

        @Override
        public String toString() {
            return String.valueOf(c).repeat(Math.max(0, n));
        }

        Pair(Character c, Integer n) {
            this.c = c;
            this.n = n;
        }

        @Override
        public int compareTo(Pair o) {
            return o.n - n;
        }

    }



}
