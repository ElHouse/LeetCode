package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1071_Greatest_Common_Divisor_of_StringsTest {


    private final _1071_Greatest_Common_Divisor_of_Strings greatestCommonDivisorOfStrings = new _1071_Greatest_Common_Divisor_of_Strings();


    @Test
    public void test01() {
        assertEquals("ABC", greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC"));
    }

    @Test
    public void test02() {
        assertEquals("AB", greatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    public void test03() {
        assertEquals("", greatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE"));
    }


    @Test
    public void test04() {
        assertEquals("ABC", greatestCommonDivisorOfStrings.gcdOfStrings("ABC", "ABCABC"));
    }

    @Test
    public void test05() {
        assertEquals("ABCABC", greatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABCABC"));
    }

    @Test
    public void test06() {
        assertEquals("", greatestCommonDivisorOfStrings.gcdOfStrings("ABC", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    }


    @Test
    public void test07() {
        assertEquals("", greatestCommonDivisorOfStrings.gcdOfStrings("ABCDEF", "ABC"));
    }

    @Test
    public void test08() {
        assertEquals("ABAB", greatestCommonDivisorOfStrings.gcdOfStrings("ABABABAB", "ABAB"));
    }

    @Test
    public void test09() {
        assertEquals("TAUXX", greatestCommonDivisorOfStrings.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}