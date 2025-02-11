package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _342_Power_of_FourTest {


    _342_Power_of_Four powerOfFour = new _342_Power_of_Four();


    @Test
    public void case0() {
        assertFalse(powerOfFour.isPowerOfFour(2));
    }

    @Test
    public void case1() {
        assertTrue(powerOfFour.isPowerOfFour(4));
    }

    @Test
    public void case2() {
        assertTrue(powerOfFour.isPowerOfFour(16));
    }

    @Test
    public void case3() {
        assertTrue(powerOfFour.isPowerOfFour(16*4));
    }

    @Test
    public void case4() {
        assertTrue(powerOfFour.isPowerOfFour(16*4*4));
    }

    @Test
    public void case5() {
        assertTrue(powerOfFour.isPowerOfFour(1));
    }

    @Test
    public void case6() {
        assertFalse(powerOfFour.isPowerOfFour(0));
    }

    @Test
    public void case7() {
        assertFalse(powerOfFour.isPowerOfFour(45));
    }

    @Test
    public void case8() {
        assertFalse(powerOfFour.isPowerOfFour(28));
    }

    @Test
    public void case9() {
        assertFalse(powerOfFour.isPowerOfFour(213));
    }

    @Test
    public void case10() {
        assertFalse(powerOfFour.isPowerOfFour(53));
    }

    @Test
    public void case11() {
        assertFalse(powerOfFour.isPowerOfFour(-1));
    }

    @Test
    public void case12() {
        assertFalse(powerOfFour.isPowerOfFour(Integer.MAX_VALUE));
    }

    @Test
    public void case13() {
        assertFalse(powerOfFour.isPowerOfFour(9876));
    }

    @Test
    public void case14() {
        assertFalse(powerOfFour.isPowerOfFour(3));
    }
}