package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1133_Largest_Unique_NumberTest {

    private final _1133_Largest_Unique_Number largestUniqueNumber = new _1133_Largest_Unique_Number();

    @Test
    public void test01(){
        assertEquals(8, largestUniqueNumber.largestUniqueNumber(new int[]{5,7,3,9,4,9,8,3,1}));
    }

    @Test
    public void test02(){
        assertEquals(-1, largestUniqueNumber.largestUniqueNumber(new int[]{9,9,8,8}));
    }
}