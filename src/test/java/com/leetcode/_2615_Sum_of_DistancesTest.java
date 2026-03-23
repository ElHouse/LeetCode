package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2615_Sum_of_DistancesTest {


    private final _2615_Sum_of_Distances sumOfDistances = new _2615_Sum_of_Distances();

    @Test
    public void test01() {
        assertArrayEquals(new long[]{10,0,6,6,0,10,0}, sumOfDistances.distance(new int[]{1,14,1,1,11,1,13}));

        assertArrayEquals(new long[]{5, 0, 3, 4, 0}, sumOfDistances.distance(new int[]{1, 3, 1, 1, 2}));
        assertArrayEquals(new long[]{0, 0, 0}, sumOfDistances.distance(new int[]{0, 5, 3}));
        assertArrayEquals(new long[]{0,}, sumOfDistances.distance(new int[]{3}));

    }


}