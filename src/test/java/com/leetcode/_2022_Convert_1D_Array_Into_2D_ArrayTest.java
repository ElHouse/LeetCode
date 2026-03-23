package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2022_Convert_1D_Array_Into_2D_ArrayTest {

    _2022_Convert_1D_Array_Into_2D_Array convert1DArrayInto2DArray = new _2022_Convert_1D_Array_Into_2D_Array();

    @Test
    public void test01() {
        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        int[][] result = convert1DArrayInto2DArray.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test02() {
        int[][] expected = new int[][]{{1, 2, 3}};
        int[][] result = convert1DArrayInto2DArray.construct2DArray(new int[]{1, 2, 3}, 1, 3);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test03() {
        int[][] expected = new int[0][0];
        int[][] result = convert1DArrayInto2DArray.construct2DArray(new int[]{1, 2}, 1, 1);

        assertArrayEquals(expected, result);
    }

    @Test
    public void test04() {
        int[][] expected = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] result = convert1DArrayInto2DArray.construct2DArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10}, 2, 5);

        assertArrayEquals(expected, result);
    }

}