package com.leetcode;

public class _3274_Check_if_Two_Chessboard_Squares_Have_the_Same_Color {
/*
You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.

 Return true if these two squares have the same color and false otherwise.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).
 */

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        return getColor(coordinate1) == getColor(coordinate2);

    }


    private boolean getColor(String coordinate2) {
        int col = coordinate2.charAt(0) - 'a' + 1;
        int row = coordinate2.charAt(1) - '0';
        return (col + row) % 2 == 0;
    }


}
