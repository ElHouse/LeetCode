package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _56_Merge_IntervalsTest {

    private final _56_Merge_Intervals mergeIntervals = new _56_Merge_Intervals();

    @Test
    public void test01() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }


    @Test
    public void test02() {
        assertArrayEquals(new int[][]{{1, 5}},
                mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}}));
    }


    @Test
    public void test03() {
        assertArrayEquals(new int[][]{{1, 10}},
                mergeIntervals.merge(new int[][]{{1, 8}, {2, 6}, {8, 10}}));
    }


    @Test
    public void test04() {
        assertArrayEquals(new int[][]{{1, 8}, {9, 10}},
                mergeIntervals.merge(new int[][]{{1, 8}, {2, 6}, {9, 10}}));
    }


    @Test
    public void test05() {
        assertArrayEquals(new int[][]{{1, 18}},
                mergeIntervals.merge(new int[][]{{1, 18}, {2, 6}, {7, 8}, {9, 10}, {10, 12}}));
    }


    @Test
    public void test06() {
        assertArrayEquals(new int[][]{{0, 4}},
                mergeIntervals.merge(new int[][]{{1, 4}, {0, 4}}));
    }


    @Test
    public void test07() {
        assertArrayEquals(new int[][]{{0, 0}, {1, 4}},
                mergeIntervals.merge(new int[][]{{1, 4}, {0, 0}}));
    }


    @Test
    public void test08() {
        assertArrayEquals(new int[][]{{0, 0}, {1, 4}},
                mergeIntervals.merge(new int[][]{{0, 0}, {1, 4}}));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[][]{{0, 8}},
                mergeIntervals.merge(new int[][]{{1, 4}, {0, 8}}));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[][]{{1, 10}},
                mergeIntervals.merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}));
    }

}