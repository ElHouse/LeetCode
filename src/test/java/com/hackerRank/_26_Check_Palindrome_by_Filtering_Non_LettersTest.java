package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _26_Check_Palindrome_by_Filtering_Non_LettersTest {

    _26_Check_Palindrome_by_Filtering_Non_Letters checkPalindromeByFilteringNonLetters = new _26_Check_Palindrome_by_Filtering_Non_Letters();

    @Test
    void isAlphabeticPalindrome() {
        assertFalse(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("A1b2B"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("A1b2B!a"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("z"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("abc123cba"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("abba"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("abcba"));
        assertFalse(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("aaba"));
        assertFalse(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("aaaba"));
        assertTrue(checkPalindromeByFilteringNonLetters.isAlphabeticPalindrome("abc123cba"));

    }



}