package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _542_01_MatrixTest {


    _542_01_Matrix updateMatrix = new _542_01_Matrix();

    @Test
    public void case1() {
        int[][] matrix = {{1, 0},
                {1, 1},
                {1, 1}};


        int[][] r = updateMatrix.updateMatrix(matrix);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(r[i][j]);
            }
            System.out.println();
        }

    }
}