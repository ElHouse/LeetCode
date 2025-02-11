package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _59_Spiral_Matrix_IITest {

    _59_Spiral_Matrix_II spiralMatrixIi = new _59_Spiral_Matrix_II();

    @Test
    public void case1() {
//TODO asserts
        int[][] matrix = spiralMatrixIi.generateMatrix(10);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "-");
            }
            System.out.println();
        }
    }

}