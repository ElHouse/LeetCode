package com.leetcode;

import java.util.Arrays;

public class _2022_Convert_1D_Array_Into_2D_Array {

    public int[][] construct2DArray(int[] original, int m, int n) {

        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] response = new int[m][n];
        int i = 0;
        int j = 0;


        for (int k = 0; k < original.length; k++) {

            int number = original[k];

            response[i][j] = number;

            j++;
            if (j == n) {
                i++;
                j = 0;
            }
        }

        return response;
    }
}
