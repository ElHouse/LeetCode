package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class _54_Spiral_Matrix {

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.s
    //	Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for Spiral Matrix.
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return list;

        int x = 0;
        int M = matrix.length;
        int N = matrix[0].length;
        int count = 0;
        int limit = M * N;


        while (limit >= count) {

            for (int i = x; i < N; i++) {
                list.add(matrix[x][i]);
                count++;
            }
            if (limit <= count) return list;
            for (int i = x + 1; i < M; i++) {
                list.add(matrix[i][N - 1]);
                count++;
            }
            if (limit <= count) return list;
            for (int i = N - 2; i >= x; i--) {
                list.add(matrix[M - 1][i]);
                count++;
            }
            if (limit <= count) return list;
            for (int i = M - 2; i > x; i--) {
                list.add(matrix[i][x]);
                count++;
            }
            if (limit <= count) return list;

            x++;
            N--;
            M--;

        }

        return list;
    }

}
