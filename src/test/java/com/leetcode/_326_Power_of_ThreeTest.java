package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _326_Power_of_ThreeTest {


    private final _326_Power_of_Three powerOfThree = new _326_Power_of_Three();

    @Test
    public void case0() {

        assertTrue(powerOfThree.isPowerOfThree(3));
    }


    @Test
    public void case1() {

        assertTrue(powerOfThree.isPowerOfThree(9));
    }

    @Test
    public void case2() {
        assertTrue(powerOfThree.isPowerOfThree(27));
    }

    @Test
    public void case3() {
        assertTrue(powerOfThree.isPowerOfThree(81));
    }

    @Test
    public void case4() {
        assertTrue(powerOfThree.isPowerOfThree(243));
    }

    @Test
    public void case5() {
        assertTrue(powerOfThree.isPowerOfThree(729));
    }

    @Test
    public void case6() {
        assertFalse(powerOfThree.isPowerOfThree(0));
    }

    @Test
    public void case7() {
        assertFalse(powerOfThree.isPowerOfThree(45));
    }

    @Test
    public void case8() {
        assertFalse(powerOfThree.isPowerOfThree(8));
    }

    @Test
    public void case9() {
        assertFalse(powerOfThree.isPowerOfThree(213));
    }

    @Test
    public void case10() {
        assertFalse(powerOfThree.isPowerOfThree(53));
    }

    @Test
    public void case11() {
        assertFalse(powerOfThree.isPowerOfThree(-1));
    }

    @Test
    public void case12() {
        assertFalse(powerOfThree.isPowerOfThree(Integer.MAX_VALUE));
    }

    @Test
    public void case13() {
        assertFalse(powerOfThree.isPowerOfThree(9876));
    }

    @Test
    public void case14() {
        assertFalse(powerOfThree.isPowerOfThree(2));
    }

}