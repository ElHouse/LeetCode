package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2101_Detonate_the_Maximum_BombsTest {


    private final _2101_Detonate_the_Maximum_Bombs detonateTheMaximumBombs = new _2101_Detonate_the_Maximum_Bombs();


    @Test
    public void test01() {
        int[][] array3 = {
                {2, 1, 3},
                {6, 1, 4}
        };
        assertEquals(2, detonateTheMaximumBombs.maximumDetonation(array3));
    }

    @Test
    public void test02() {
        int[][] array2 = {
                {1, 1, 5},
                {10, 10, 5}
        };
        assertEquals(1, detonateTheMaximumBombs.maximumDetonation(array2));
    }


    @Test
    public void test03() {
        int[][] array1 = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 4, 2},
                {4, 5, 3},
                {5, 6, 4}
        };
        assertEquals(5, detonateTheMaximumBombs.maximumDetonation(array1));
    }
}