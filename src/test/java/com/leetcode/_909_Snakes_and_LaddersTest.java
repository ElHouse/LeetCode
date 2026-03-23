package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _909_Snakes_and_LaddersTest {

    private final _909_Snakes_and_Ladders snakesAndLadders = new _909_Snakes_and_Ladders();

    @Test
    public void test01() {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };

        assertEquals(4, snakesAndLadders.snakesAndLadders(board));
    }

    @Test
    public void test02() {
        int[][] matriz = {
                {-1, -1},
                {-1, 3}
        };

        assertEquals(1, snakesAndLadders.snakesAndLadders(matriz));
    }

    @Test
    public void test03() {
        int[][] board = {
                {-1, -1, -1,},
                {-1, -1, -1,},
                {-1, -1, -1,}
        };

        assertEquals(2, snakesAndLadders.snakesAndLadders(board));
    }


    @Test
    public void test04() {
        int[][] board = {
                {-1, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };

        assertEquals(4, snakesAndLadders.snakesAndLadders(board));
    }


    @Test
    public void test05() {
        int[][] board = {
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1}
        };

        assertEquals(-1, snakesAndLadders.snakesAndLadders(board));
    }



    @Test
    public void test06() {
        int[][] board = {
                {2, 2, 2, 2, 2, 2},
                {2, 2, 2, 2, 2, 2},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1}
        };

        assertEquals(-1, snakesAndLadders.snakesAndLadders(board));
    }

    @Test
    public void test07() {
        int[][] board = {
                {-1, -1, -1},
                {-1, 9, 8},
                {-1, 8, 9}
        };

        assertEquals(1, snakesAndLadders.snakesAndLadders(board));
    }
}