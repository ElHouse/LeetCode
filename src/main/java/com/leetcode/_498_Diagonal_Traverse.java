package com.leetcode;

import java.util.Arrays;


public class _498_Diagonal_Traverse {

    int step = 0;
    int i = 0;
    int x = 0;
    int y = 0;

    public int[] findDiagonalOrder(int[][] matrix) {

        int[] answer = new int[matrix.length + matrix[0].length];

        answer[i++] = matrix[x][y];
        movements(matrix, answer);

        return answer;
    }

    public boolean isValid(int[][] matrix, int x, int y) {

        if (x < 0) return false;
        if (y < 0) return false;


        int M = matrix.length;
        int N = matrix[0].length;

        if (x >= M || y >= N) return false;

        return true;
    }


    public void movements(int[][] matrix, int[] answer) {

        if (x == answer.length) return;

        System.out.println("########################------------movements-->");
        System.out.println("X>" + x);
        System.out.println("Y>" + y);

        switch (step) {
            case 0: {
//				  int auxX = x;
//				  int auxY = y+1;

                y += 1;

                step = 1;
            }
            break;
            case 1: {
                System.out.println("case 1 antes ->X:" + x + "<Y:" + y);
                getDownLine(matrix, x, y, answer);
                System.out.println("case 1 despues ->X:" + x + "<Y:" + y);
                step = 2;
            }
            break;
            case 2: {
                x += 1;
                step = 3;
            }
            break;
            case 3: {
                System.out.println("case 1 antes ->X:" + x + "<Y:" + y);
                getUpLine(matrix, x, y, answer);
                System.out.println("case 1 despues ->X:" + x + "<Y:" + y);
                step = 0;
            }
            break;

        }//fin .whiele

        System.out.println("---------------paso>" + step);
        System.out.println(Arrays.toString(answer));

        movements(matrix, answer);
    }

    public void getUpLine(int[][] matrix, int x, int y, int[] answer) {


        int auxX = x;
        int auxY = y;

        while (isValid(matrix, auxX, auxY)) {

            answer[i++] = matrix[auxX][auxY];
            auxX -= 1;
            auxY += 1;
        }

        this.x = auxX + 1;
        this.y = auxY - 1;

    }

    public void getDownLine(int[][] matrix, int x, int y, int[] answer) {

        int auxX = x;
        int auxY = y;

        while (isValid(matrix, auxX, auxY)) {

            answer[i++] = matrix[auxX][auxY];

            auxX += 1;
            auxY -= 1;

        }
        this.x = auxX - 1;
        this.y = auxY + 1;
    }





}
