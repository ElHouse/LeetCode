package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1283_Find_the_Smallest_Divisor_Given_a_ThresholdTest {

    private final _1283_Find_the_Smallest_Divisor_Given_a_Threshold findTheSmallestDivisorGivenAThreshold = new _1283_Find_the_Smallest_Divisor_Given_a_Threshold();


    @Test
    public void test01() {
        assertEquals(5, findTheSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{1, 2, 5, 9}, 6));
    }

    @Test
    public void test02() {
        assertEquals(44, findTheSmallestDivisorGivenAThreshold.smallestDivisor(new int[]{44, 22, 33, 11, 1}, 5));
    }

}