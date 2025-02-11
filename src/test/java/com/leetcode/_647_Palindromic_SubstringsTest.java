package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _647_Palindromic_SubstringsTest {


    _647_Palindromic_Substrings palindromicSubstrings = new _647_Palindromic_Substrings();


    @Test
    public void case1() {
        String s = "abc";
        assertEquals(3, palindromicSubstrings.countSubstrings(s));
    }
    @Test
    public void case2() {
        String s = "aaa";
        assertEquals(6, palindromicSubstrings.countSubstrings(s));
    }
    @Test
    public void case3() {
        String s = "abcdefghi";
        assertEquals(9, palindromicSubstrings.countSubstrings(s));
    }
    @Test
    public void case4() {
        String s = "abcdeefghi";
        assertEquals(11, palindromicSubstrings.countSubstrings(s));
    }
}