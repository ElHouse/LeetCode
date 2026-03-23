package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _409_Longest_PalindromeTest {

    private final _409_Longest_Palindrome longestPalindrome = new _409_Longest_Palindrome();

    @Test
    public void test01() {
        assertEquals(7, longestPalindrome.longestPalindrome("abcccccdd"));
        assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
        assertEquals(1, longestPalindrome.longestPalindrome("a"));
        assertEquals(3, longestPalindrome.longestPalindrome("ccc"));

    }

}