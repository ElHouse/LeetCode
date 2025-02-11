package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _1219_Path_with_Maximum_GoldTest {

    private final _1219_Path_with_Maximum_Gold pathWithMaximumGold = new _1219_Path_with_Maximum_Gold();


    @Test
    public void case1() {

        int[][] grid = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};

        assertEquals(24, pathWithMaximumGold.getMaximumGold(grid));

    }

    @Test
    public void case2() {

        int[][] grid = {{1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}};

        assertEquals(28, pathWithMaximumGold.getMaximumGold(grid));

    }
}