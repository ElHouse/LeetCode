package com.leetcode;

public class _885_Spiral_Matrix_III {

    private int[][] response;
    private int count;


    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        response = new int[rows * cols][2];
        count = 0;

        int increase = 1;

        while (count < (rows * cols)) {

            //east
            for (int i = 0; i < increase; i++) {
                validateAndInclude(rStart, cStart++, rows, cols);
            }

            //south
            for (int i = 0; i < increase; i++) {
                validateAndInclude(rStart++, cStart, rows, cols);
            }

            increase++;

            //west
            for (int i = 0; i < increase; i++) {
                validateAndInclude(rStart, cStart--, rows, cols);
            }

            //NORTH
            for (int i = 0; i < increase; i++) {
                validateAndInclude(rStart--, cStart, rows, cols);
            }
            increase++;
        }


        return response;
    }


    private void validateAndInclude(int i, int j, int rows, int cols) {


        if (i < 0 || i > rows - 1) {
            return;
        }

        if (j < 0 || j > cols - 1) {
            return;
        }

        response[count][0] = i;
        response[count][1] = j;
        count++;
    }


}


