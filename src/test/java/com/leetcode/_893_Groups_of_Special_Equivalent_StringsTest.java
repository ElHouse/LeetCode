package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _893_Groups_of_Special_Equivalent_StringsTest {


    _893_Groups_of_Special_Equivalent_Strings groupsOfSpecialEquivalentStrings = new _893_Groups_of_Special_Equivalent_Strings();


    @Test
    public void case1() {
        String[] A = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        assertEquals(3, groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(A));
    }


    @Test
    public void case2() {
        String[] A = {"abc", "acb", "bac", "bca", "cab", "cba"};
        assertEquals(3, groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(A));
    }
}