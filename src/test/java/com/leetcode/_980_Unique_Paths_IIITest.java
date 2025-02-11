package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _980_Unique_Paths_IIITest {

    _980_Unique_Paths_III uniquePathsIii = new _980_Unique_Paths_III();

    @Test
    public void case1() {

        int[][] matrix = {{0, 1}, {2, 0}};

        assertEquals(0, uniquePathsIii.uniquePathsIII(matrix));
    }


    @Test
    public void case2() {

        int[][] matrix = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};

        assertEquals(2, uniquePathsIii.uniquePathsIII(matrix));
    }


    @Test
    public void case3() {

        int[][] matrix = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};


        assertEquals(4, uniquePathsIii.uniquePathsIII(matrix));
    }
}