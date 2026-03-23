package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _198_House_RobberTest {

    private final _198_House_Robber houseRobber = new _198_House_Robber();

    @Test
    public void test01() {
        assertEquals(4, houseRobber.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void test02() {
        assertEquals(12, houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }


}