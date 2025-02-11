package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _54_Spiral_MatrixTest {

    _54_Spiral_Matrix spiralMatrix = new _54_Spiral_Matrix();

    @Test
    public void case3() {


        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(spiralMatrix.spiralOrder(matrix));

    }

    @Test
    public void case2() {


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(spiralMatrix.spiralOrder(matrix));

    }

    @Test
    public void case1() {
        int[][] matrix = new int[4][8];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[0][4] = 5;
        matrix[0][5] = 6;
        matrix[0][6] = 7;
        matrix[0][7] = 8;
        matrix[1][7] = 9;
        matrix[2][7] = 10;
        matrix[3][7] = 11;
        matrix[3][6] = 12;
        matrix[3][5] = 13;
        matrix[3][4] = 14;
        matrix[3][3] = 15;
        matrix[3][2] = 16;
        matrix[3][1] = 17;
        matrix[3][0] = 18;
        matrix[2][0] = 19;
        matrix[1][0] = 20;
        matrix[1][1] = 21;
        matrix[1][2] = 22;
        matrix[1][3] = 23;
        matrix[1][4] = 24;
        matrix[1][5] = 25;
        matrix[1][6] = 26;

        matrix[2][6] = 27;
        matrix[2][5] = 28;
        matrix[2][4] = 29;
        matrix[2][3] = 30;
        matrix[2][2] = 31;
        matrix[2][1] = 32;


        List<Integer> list = spiralMatrix.spiralOrder(matrix);

        System.out.println(list);
    }
}