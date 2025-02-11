package com.leetcode;

public class _6_Zigzag_Conversion {


    public String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();

        char[][] matrix = new char[numRows][(s.length()/numRows) + (s.length())];
        int count = 0;
        boolean baja = true;


        for (int i = 0, j = 0; count < s.length(); ) {

            matrix[Math.max(0,i)][j] = s.charAt(count++);

            if (baja) {
                if (i + 1 == numRows) {
                    baja = false;
                    i--;
                    j++;
                } else {
                    i++;
                }
            } else {
                if (i - 1 == -1) {
                    baja = true;
                    i++;
                } else {
                    i--;
                    j++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                char c = matrix[i][j];
                if (c != '\u0000') {
                    sb.append(matrix[i][j]);
                }
            }
        }

        return sb.toString().replaceAll("'\\u0000", "");
    }
}