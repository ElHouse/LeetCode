package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _70_Climbing_StairsTest {


    _70_Climbing_Stairs climbingStairs = new _70_Climbing_Stairs();

    @Test
    public void case1() {
        assertEquals(0, climbingStairs.climbStairs(0));
        assertEquals(1, climbingStairs.climbStairs(1));
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(5, climbingStairs.climbStairs(4));
        assertEquals(8, climbingStairs.climbStairs(5));
        assertEquals(13, climbingStairs.climbStairs(6));

    }
}