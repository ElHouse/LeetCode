package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _409_Longest_Palindrome {

    public int longestPalindrome(String s) {

        int count = 0;
        boolean one = false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character c : map.keySet()) {
            int number = map.get(c);

            if (number == 1) {
                one = true;
            } else if (number > 1) {
                count += (number / 2) * 2;
                if (number % 2 == 1) {
                    one = true;
                }
            }
        }

        return count + (one ? 1 : 0);
    }
}
