package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _231_Power_of_TwoTest {

    _231_Power_of_Two powerOfTwo = new _231_Power_of_Two();


    @Test
    public void case0() {
        assertTrue(powerOfTwo.isPowerOfTwo(2));
    }

    @Test
    public void case1() {
        assertTrue(powerOfTwo.isPowerOfTwo(4));
    }

    @Test
    public void case2() {
        assertTrue(powerOfTwo.isPowerOfTwo(16));
    }

    @Test
    public void case3() {
        assertTrue(powerOfTwo.isPowerOfTwo(16*2));
    }

    @Test
    public void case4() {
        assertTrue(powerOfTwo.isPowerOfTwo(16*2*2));
    }

    @Test
    public void case5() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
    }

    @Test
    public void case6() {
        assertFalse(powerOfTwo.isPowerOfTwo(0));
    }

    @Test
    public void case7() {
        assertFalse(powerOfTwo.isPowerOfTwo(45));
    }

    @Test
    public void case8() {
        assertFalse(powerOfTwo.isPowerOfTwo(28));
    }

    @Test
    public void case9() {
        assertFalse(powerOfTwo.isPowerOfTwo(213));
    }

    @Test
    public void case10() {
        assertFalse(powerOfTwo.isPowerOfTwo(53));
    }

    @Test
    public void case11() {
        assertFalse(powerOfTwo.isPowerOfTwo(-1));
    }

    @Test
    public void case12() {
        assertFalse(powerOfTwo.isPowerOfTwo(Integer.MAX_VALUE));
    }

    @Test
    public void case13() {
        assertFalse(powerOfTwo.isPowerOfTwo(9876));
    }

    @Test
    public void case14() {
        assertFalse(powerOfTwo.isPowerOfTwo(3));
    }
}