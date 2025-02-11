package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _240_Search_a_2D_Matrix_IITest {


    _240_Search_a_2D_Matrix_II searchA2DMatrixIi = new _240_Search_a_2D_Matrix_II();

    @Test
    public void case1() {
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 4;


        assertEquals(-1, searchA2DMatrixIi.findX(matrix, 18));

//		assertEquals(0, findX(matrix, 1));
//		assertEquals(1, findX(matrix, 4));
//		assertEquals(2, findX(matrix, 7));
//		assertEquals(3, findX(matrix, 11));
//		assertEquals(4, findX(matrix, 15));


    }
}