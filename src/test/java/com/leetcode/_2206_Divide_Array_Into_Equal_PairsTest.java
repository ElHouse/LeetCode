package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2206_Divide_Array_Into_Equal_PairsTest {

    private final _2206_Divide_Array_Into_Equal_Pairs divideArrayIntoEqualPairs = new _2206_Divide_Array_Into_Equal_Pairs();

    @Test
    public void test01() {
        assertTrue(divideArrayIntoEqualPairs.divideArray(new int[]{3, 2, 3, 2, 2, 2}));
        assertFalse(divideArrayIntoEqualPairs.divideArray(new int[]{1, 2, 3, 4}));
    }
}