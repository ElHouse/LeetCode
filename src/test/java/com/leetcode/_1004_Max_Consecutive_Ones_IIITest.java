package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1004_Max_Consecutive_Ones_IIITest {

    private final _1004_Max_Consecutive_Ones_III maxConsecutiveOnesIii = new _1004_Max_Consecutive_Ones_III();


    @Test
    public void test01() {
 ///                                                                         0 1  2   3  4  5  6  7  8  9  0
        assertEquals(6, maxConsecutiveOnesIii.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    @Test
    public void test02() {

        assertEquals(10, maxConsecutiveOnesIii.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }


    @Test
    public void test03() {

        assertEquals(11, maxConsecutiveOnesIii.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 4));
    }

}