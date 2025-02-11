package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _494_Target_SumTest {

    _494_Target_Sum targetSum = new _494_Target_Sum();


    @Test
    public void test1() {
        //  assertEquals(5, targetSum.findTargetSumWays(new int[]{1,2,3,4,7}, 3));
        assertEquals(5, targetSum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(1, targetSum.findTargetSumWays(new int[]{1}, 1));

    }
}