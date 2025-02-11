package com.leetcode;

public class _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
/*

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */


    public int maxVowels(String s, int k) {

        int max;
        int count = 0;

        for (int i = 0; i < k; i++) {
            count += isVowel(s.charAt(i)) ? 1 : 0;
        }

        max = count;

        for (int i = 1, j = k; j < s.length(); i++, j++) {

            count = count - (isVowel(s.charAt(i - 1)) ? 1 : 0) + (isVowel(s.charAt(j)) ? 1 : 0);
            if (count > max) {
                max = count;
            }
        }

        if (count > max) {
            max = count;
        }

        return max;
    }

    private boolean isVowel(char c) {

        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

}
