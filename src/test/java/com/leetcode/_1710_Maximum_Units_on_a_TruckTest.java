package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1710_Maximum_Units_on_a_TruckTest {

    private final _1710_Maximum_Units_on_a_Truck maximumUnitsOnATruck = new _1710_Maximum_Units_on_a_Truck();

    @Test
    public void test01() {
        assertEquals(8, maximumUnitsOnATruck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }

    @Test
    public void test02() {
        assertEquals(91, maximumUnitsOnATruck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }


}