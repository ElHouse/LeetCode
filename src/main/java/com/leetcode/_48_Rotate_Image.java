package com.leetcode;

public class _48_Rotate_Image {


    public void rotate(int[][] matrix) {

        if (matrix == null) return;
        if (matrix.length == 0) return;

        int auxA = 0;
        int auxB = 0;

        for (int i = 0; i < matrix.length / 2; i++) {

            int[] a = new int[]{auxA, auxA};
            int[] b = new int[]{auxA, matrix.length - 1 - auxB};
            int[] c = new int[]{matrix.length - 1 - auxB, matrix.length - 1 - auxB};
            int[] d = new int[]{matrix.length - 1 - auxB, auxA};

            while (a[1] < b[1]) {

                int av = matrix[a[0]][a[1]];
                int bv = matrix[b[0]][b[1]];
                int cv = matrix[c[0]][c[1]];
                int dv = matrix[d[0]][d[1]];

                matrix[a[0]][a[1]] = dv;
                matrix[b[0]][b[1]] = av;
                matrix[c[0]][c[1]] = bv;
                matrix[d[0]][d[1]] = cv;


                a[1] = a[1] + 1;
                b[0] = b[0] + 1;
                c[1] = c[1] - 1;
                d[0] = d[0] - 1;

            }

            auxA++;
            auxB++;
        }
    }


}
