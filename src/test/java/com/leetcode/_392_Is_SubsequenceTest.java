package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _392_Is_SubsequenceTest {

    private final _392_Is_Subsequence isSubsequence = new _392_Is_Subsequence();

    @Test
    public void test01(){
        assertTrue(isSubsequence.isSubsequence("abc","ahbgdc"));
    }
    @Test
    public void test02(){
        assertFalse(isSubsequence.isSubsequence("axc","ahbgdc"));
    }
    @Test
    public void test03(){
        assertFalse(isSubsequence.isSubsequence("abc","ahigdc"));
    }
    @Test
    public void test04(){
        assertTrue(isSubsequence.isSubsequence("abc","ahegbc"));
    }
    @Test
    public void test06(){
        assertTrue(isSubsequence.isSubsequence("xxxxxxxx","xxxxxxxxxxxxxxxxx"));
    }
    @Test
    public void test07(){
        assertFalse(isSubsequence.isSubsequence("xxxaxxxx","xxxxxxxxxxxxxxxxx"));
    }
    @Test
    public void test08(){
        assertTrue(isSubsequence.isSubsequence("x","xxxxxxxxxxxxxxxxx"));
    }
    @Test
    public void test09(){
        assertTrue(isSubsequence.isSubsequence("","xxxxxxxxxxxxxxxxx"));
    }
    @Test
    public void test10(){
        assertTrue(isSubsequence.isSubsequence("xtatx","xtatx"));
    }
    @Test
    public void test11(){
        assertTrue(isSubsequence.isSubsequence("xtx","xtatx"));
    }
    @Test
    public void test12(){
        assertTrue(isSubsequence.isSubsequence("","ahbgdc"));
    }
    @Test
    public void test13(){
        assertFalse(isSubsequence.isSubsequence("abbc","ahbdc"));
    }

    @Test
    public void test14(){
        assertTrue(isSubsequence.isSubsequence("abc","ahbdc"));
    }
}