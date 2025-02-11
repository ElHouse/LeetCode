package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _367_Valid_Perfect_SquareTest {


    _367_Valid_Perfect_Square validPerfectSquare = new _367_Valid_Perfect_Square();


    @Test
    public void case1() {

        int[] nums = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169};


        for (int i = 0; i < nums.length; i++) {

            assertTrue(validPerfectSquare.isPerfectSquare(nums[i]));
        }
    }

    @Test
    public void case2() {

        assertFalse(validPerfectSquare.isPerfectSquare(14));
        assertFalse(validPerfectSquare.isPerfectSquare(15));
        assertFalse(validPerfectSquare.isPerfectSquare(3));
        assertFalse(validPerfectSquare.isPerfectSquare(2));
        assertFalse(validPerfectSquare.isPerfectSquare(83));
    }
}