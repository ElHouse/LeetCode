package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _463_Island_PerimeterTest {

    _463_Island_Perimeter island_perimeter = new _463_Island_Perimeter();

    @Test
    public void case1() {


        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        assertEquals(16, island_perimeter.islandPerimeter(grid));


    }


    @Test
    public void case2() {


        int[][] grid = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        assertEquals(16, island_perimeter.islandPerimeter(grid));


    }


    @Test
    public void case3() {


        int[][] grid = {{0, 0, 0, 0},
                {1, 1, 1, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1}};

        assertEquals(14, island_perimeter.islandPerimeter(grid));


    }

    @Test
    public void case4() {


        int[][] grid = {{0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};

        assertEquals(8, island_perimeter.islandPerimeter(grid));


    }


    @Test
    public void case5() {


        int[][] grid = {{0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        assertEquals(4, island_perimeter.islandPerimeter(grid));


    }


    @Test
    public void case6() {


        int[][] grid = {{0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        assertEquals(6, island_perimeter.islandPerimeter(grid));


    }


}