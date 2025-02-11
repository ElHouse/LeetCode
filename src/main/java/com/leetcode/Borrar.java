package com.leetcode;

import java.util.HashSet;

public class Borrar {

    /*
    Problem: Find the Longest Substring Without Repeating Characters
Description: Given a string s, find the length of the longest substring that does not contain any repeating characters.
Example:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
     */


    public int process(String text) {

     //   if (text == null || !text.isEmpty()) return 0;

        HashSet<String> cache = new HashSet<>();

        int count =0;
        int max = 0;

        for (int i = 0; i < text.length(); i++) {

            if (cache.contains(String.valueOf(text.charAt(i)))) {
                max = Math.max(max, count);
                cache.clear();
                count = 0;
            } else {
                count++;
                cache.add(String.valueOf(text.charAt(i)));
            }
        }

        max = Math.max(max, count);


        return max;
    }

}
