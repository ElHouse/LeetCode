package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _1657_Determine_if_Two_Strings_Are_CloseTest {


    private final _1657_Determine_if_Two_Strings_Are_Close determineIfTwoStringsAreClose = new _1657_Determine_if_Two_Strings_Are_Close();


    @Test
    public void test01() {
        assertTrue(determineIfTwoStringsAreClose.closeStrings("abc", "bca"));
    }

    @Test
    public void test02() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("a", "aa"));
    }

    @Test
    public void test03() {
        assertTrue(determineIfTwoStringsAreClose.closeStrings("cabbba", "abbccc"));
    }

    @Test
    public void test04() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("qwe", "asd"));
    }

    @Test
    public void test05() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("abcdefghijkl", "abcdefghijkm"));
    }

    @Test
    public void test06() {
        assertTrue(determineIfTwoStringsAreClose.closeStrings("qwe", "qwe"));
    }

    @Test
    public void test07() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("qwe", "wee"));
    }

    @Test
    public void test08() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("a", "b"));
    }

    @Test
    public void test09() {
        assertFalse(determineIfTwoStringsAreClose.closeStrings("aaabbbbccddeeeeefffff",
                                                               "aaaaabbcccdddeeeeffff"));
    }




}