package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3274_Check_if_Two_Chessboard_Squares_Have_the_Same_ColorTest {

    _3274_Check_if_Two_Chessboard_Squares_Have_the_Same_Color test = new _3274_Check_if_Two_Chessboard_Squares_Have_the_Same_Color();

    @Test
    public void test01(){

        assertTrue(test.checkTwoChessboards("a1","c3"));
        assertFalse(test.checkTwoChessboards("a1","h3"));
        assertFalse(test.checkTwoChessboards("d1","h4"));


    }

}