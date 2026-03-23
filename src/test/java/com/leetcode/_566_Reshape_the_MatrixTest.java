package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _566_Reshape_the_MatrixTest {

    _566_Reshape_the_Matrix reshapeTheMatrix = new _566_Reshape_the_Matrix();

    @Test
    public void test01() {

        int[][] expected = new int[][]{{1, 2, 3, 4}};
        int[][] result = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test02() {

        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        int[][] result = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test03() {

        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        int[][] result = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2, 3, 4}}, 2, 2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test04() {

        int[][] expected = new int[][]{{1, 2, 3, 4}};
        int[][] result = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2,3, 4}}, 1, 4);

        assertArrayEquals(expected, result);
    }
}