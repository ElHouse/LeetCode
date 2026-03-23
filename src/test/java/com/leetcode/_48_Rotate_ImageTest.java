package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _48_Rotate_ImageTest {


    private final _48_Rotate_Image rotateImage = new _48_Rotate_Image();

    @Test
    public void test01() {

        int[][] m = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] e = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        rotateImage.rotate(m);
        assertArrayEquals(e, m);
    }


    @Test
    public void test02() {
        int[][] m = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] e = new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        rotateImage.rotate(m);

        assertArrayEquals(e, m);

    }

}