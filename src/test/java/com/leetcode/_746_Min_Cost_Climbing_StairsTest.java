package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _746_Min_Cost_Climbing_StairsTest {

    private final _746_Min_Cost_Climbing_Stairs minCostClimbingStairs = new _746_Min_Cost_Climbing_Stairs();

    @Test
    public void test01(){
        int[] costs = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(costs));
    }
    @Test
    public void test02(){
        int[] costs = new int[]{10, 15, 20};
        assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(costs));
    }


    @Test
    public void test03(){
        int[] costs = new int[]{2, 100};
        assertEquals(2, minCostClimbingStairs.minCostClimbingStairs(costs));
    }

    @Test
    public void test04(){
        int[] costs = new int[]{3};
        assertEquals(0, minCostClimbingStairs.minCostClimbingStairs(costs));
    }

}