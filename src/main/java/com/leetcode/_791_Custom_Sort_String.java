package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/*
You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.

Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.

Return any permutation of s that satisfies this property.



Example 1:

Input: order = "cba", s = "abcd"

Output: "cbad"

Explanation: "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".

Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.


Example 2:

Input: order = "bcafg", s = "abcd"

Output: "bcad"

Explanation: The characters "b", "c", and "a" from order dictate the order for the characters in s. The character "d" in s does not appear in order, so its position is flexible.

Following the order of appearance in order, "b", "c", and "a" from s should be arranged as "b", "c", "a". "d" can be placed at any position since it's not in order. The output "bcad" correctly follows this rule. Other arrangements like "dbca" or "bcda" would also be valid, as long as "b", "c", "a" maintain their order.
*/
public class _791_Custom_Sort_String {

    //1ms
    public String customSortString(String order, String s) {

        StringBuilder sb = new StringBuilder();
        int[] letterCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letterCount[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < order.length(); i++) {
            sb.repeat(order.charAt(i), letterCount[order.charAt(i) - 'a']);
            letterCount[order.charAt(i) - 'a'] = -1;
        }

        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > 0) {
                sb.repeat((char) ('a' + i), letterCount[i]);
            }
        }


        return sb.toString();
    }

    //6ms
    public String customSortString2(String order, String s) {

        List<Pair> pares = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int index = order.indexOf(s.charAt(i));
            pares.add(new Pair(s.charAt(i), index));
        }

        Collections.sort(pares);

        return pares.stream()
                .map(Pair::toString)
                .collect(Collectors.joining());
    }

    private class Pair implements Comparable<Pair> {

        Character c;
        Integer n;

        @Override
        public String toString() {
            return String.valueOf(c);
        }

        Pair(Character c, Integer n) {
            this.c = c;
            this.n = n;
        }

        @Override
        public int compareTo(Pair o) {
            return n - o.n;
        }
    }

}
