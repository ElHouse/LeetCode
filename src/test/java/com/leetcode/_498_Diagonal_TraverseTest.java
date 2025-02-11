package com.leetcode;

import java.util.Arrays;

class _498_Diagonal_TraverseTest {

    _498_Diagonal_Traverse diagonalTraverse = new _498_Diagonal_Traverse();

  //  @Test
    public void case1() {
        int count = 0;
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++count;
            }
        }
        printMatrix(matrix);
        int[] a = diagonalTraverse.findDiagonalOrder(matrix);

        System.out.println(Arrays.toString(a));

    }

    //	@Test
    public void casex() {

        int[][] matrix = new int[5][5];
        printMatrix(matrix);
        System.out.println("------cuadro");
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        System.out.println("------racta h");
        matrix = new int[2][5];

        printMatrix(matrix);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);


        System.out.println("------reacta v");
        matrix = new int[5][2];

        printMatrix(matrix);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        System.out.println("------raro 1");
        matrix = new int[5][1];

        printMatrix(matrix);

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        System.out.println("------ raro 2");
        matrix = new int[1][5];

        printMatrix(matrix);

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
    }


    public void printMatrix(int[][] matrix) {
        System.out.println("#################");
        for (int i = 0; i < matrix.length; i++) {         //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) {   //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }

        System.out.println("#################");
    }
}