package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1926_Nearest_Exit_from_Entrance_in_MazeTest {


    private _1926_Nearest_Exit_from_Entrance_in_Maze nearestExitFromEntranceInMaze = new _1926_Nearest_Exit_from_Entrance_in_Maze();

    @Test
    public void test01() {
        char[][] maze1 = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };

        assertEquals(1, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{1, 2}));
    }

    @Test
    public void test02() {
        char[][] maze1 = {
                {'+', '+', '+'},
                {'.', '.', '.'},
                {'+', '+', '+'}
        };

        assertEquals(2, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{1, 0}));
    }

    @Test
    public void test03() {
        char[][] maze1 = {
                {'.', '+'}
        };

        assertEquals(-1, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{0, 0}));
    }

    @Test
    public void test04() {
        char[][] maze1 = {
                {'+', '+', '+', '+', '+'},
                {'.', '.', '.', '.', '+'},
                {'+', '+', '+', '.', '+'}
        };

        assertEquals(4, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{2, 3}));
    }

    @Test
    public void test05() {
        char[][] maze1 = {
                {'+', '+', '+', '+', '+'},
                {'+', '.', '.', '.', '+'},
                {'+', '+', '+', '.', '+'}
        };

        assertEquals(-1, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{2, 3}));
    }

    @Test
    public void test06() {
        char[][] maze1 = {
                {'+', '+', '+', '+'},
                {'+', '.', '+', '.'},
                {'+', '+', '+', '.'}
        };

        assertEquals(-1, nearestExitFromEntranceInMaze.nearestExit(maze1, new int[]{1, 1}));
    }
}