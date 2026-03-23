package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1005_Maximize_Sum_Of_Array_After_K_NegationsTest {

    private final _1005_Maximize_Sum_Of_Array_After_K_Negations maximizeSumOfArrayAfterKNegations = new _1005_Maximize_Sum_Of_Array_After_K_Negations();

    @Test
    public void test01() {
        assertEquals(5, maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
        assertEquals(6, maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3));
        assertEquals(13, maximizeSumOfArrayAfterKNegations.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2));
    }
}