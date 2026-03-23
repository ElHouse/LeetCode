package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _967_Numbers_With_Same_Consecutive_DifferencesTest {

    private final _967_Numbers_With_Same_Consecutive_Differences numbersWithSameConsecutiveDifferences = new _967_Numbers_With_Same_Consecutive_Differences();

    @Test
    public void test01() {
        int[] expected = new int[]{181, 292, 707, 818, 929};
        assertArrayEquals(expected, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(3, 7));
    }

    @Test
    public void test02() {
        int[] expected = new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98};
        assertArrayEquals(expected, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(2, 1));
    }


    @Test
    public void test03() {
        int[] expected = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        assertArrayEquals(expected, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(2, 0));
    }

    @Test
    public void test04() {
        int[] expected = new int[]{101, 121, 123, 210, 212, 232, 234, 321, 323, 343, 345, 432, 434, 454, 456, 543, 545, 565, 567, 654, 656, 676, 678, 765, 767, 787, 789, 876, 878, 898, 987, 989};
        assertArrayEquals(expected, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(3, 1));
    }


    @Test
    public void test05() {
        int[] expected = new int[]{181, 292, 707, 818, 929};
        assertArrayEquals(expected, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(5, 7));
    }
}