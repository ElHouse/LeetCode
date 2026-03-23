package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _04_minimum_swaps_2Test {


    _04_minimum_swaps_2 minimumSwaps2 = new _04_minimum_swaps_2();

    @Test
    public void test01() {
        assertEquals(5, minimumSwaps2.minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
        assertEquals(3, minimumSwaps2.minimumSwaps(new int[]{4, 3, 1, 2}));
        assertEquals(3, minimumSwaps2.minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7}));
        assertEquals(0, minimumSwaps2.minimumSwaps(new int[]{1, 2, 3, 4,5,6,7}));

    }

}