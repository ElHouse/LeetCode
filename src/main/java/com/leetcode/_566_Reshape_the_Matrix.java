package com.leetcode;

public class _566_Reshape_the_Matrix {


    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat.length * mat[0].length) {
            return mat;
        }

        int[][] response = new int[r][c];
        int posX = 0;
        int posY = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int number = mat[i][j];

                response[posX][posY] = number;

                posY++;

                if (posY == c) {
                    posX++;
                    posY = 0;
                }
            }
        }


        return response;
    }


}
