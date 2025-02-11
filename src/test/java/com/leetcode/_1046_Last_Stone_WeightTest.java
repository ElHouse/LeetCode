package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1046_Last_Stone_WeightTest {

    private final _1046_Last_Stone_Weight last_stone_weight = new _1046_Last_Stone_Weight();


    @Test
    public void case1() {

        int[] stones = {2, 7, 4, 1, 8, 1};
        assertEquals(1, last_stone_weight.lastStoneWeight(stones));
    }

    @Test
    public void case2() {

        int[] stones = {2, 2};
        assertEquals(0, last_stone_weight.lastStoneWeight(stones));
    }

    @Test
    public void case3() {

        int[] stones = {221321};
        assertEquals(221321, last_stone_weight.lastStoneWeight(stones));
    }

    @Test
    public void case4() {

        int[] stones = {9, 18, 83, 21, 23, 218, 15};
        assertEquals(49, last_stone_weight.lastStoneWeight(stones));
    }

    @Test
    public void case5() {

        int[] stones = {2, 7, 4, 1, 8, 1, 7};
        assertEquals(0, last_stone_weight.lastStoneWeight(stones));
    }


    @Test
    public void case6() {

        int[] stones = null;
        assertEquals(0, last_stone_weight.lastStoneWeight(stones));
    }


    @Test
    public void case7() {

        int[] stones = {};
        assertEquals(0, last_stone_weight.lastStoneWeight(stones));
    }
}