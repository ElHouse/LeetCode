package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1167_Minimum_Cost_to_Connect_SticksTest {

    private final _1167_Minimum_Cost_to_Connect_Sticks minimumCostToConnectSticks = new _1167_Minimum_Cost_to_Connect_Sticks();

    @Test
    public void test01() {
        assertEquals(14, minimumCostToConnectSticks.connectSticks(new int[]{2, 4, 3}));
    }
    @Test
    public void test02() {
        assertEquals(30, minimumCostToConnectSticks.connectSticks(new int[]{1,8,3,5}));
    }
    @Test
    public void test03() {
        assertEquals(0, minimumCostToConnectSticks.connectSticks(new int[]{88}));
    }

    @Test
    public void test04() {
        assertEquals(73, minimumCostToConnectSticks.connectSticks(new int[]{2, 4, 3,50}));
    }

}