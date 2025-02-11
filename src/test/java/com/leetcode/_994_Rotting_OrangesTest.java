package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _994_Rotting_OrangesTest {


    _994_Rotting_Oranges rottingOranges = new _994_Rotting_Oranges();

    @Test
    public void case1() {
        System.out.println("-----------case 1");
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void case2() {


        System.out.println("-------------case 2");
        int[][] grid = {{1, 2, 1}, {0, 0, 0}, {0, 0, 0}};

        assertEquals(1, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void case3() {


        System.out.println("-------------case 3");
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};

        assertEquals(-1, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void case4() {


        System.out.println("-------------case 4");
        int[][] grid = {{0, 2}};


        assertEquals(0, rottingOranges.orangesRotting(grid));
    }

    @Test
    public void case5() {


        System.out.println("-------------case 5");
        int[][] grid = {{0}};


        assertEquals(0, rottingOranges.orangesRotting(grid));
    }


    @Test
    public void case6() {


        System.out.println("-------------case 6");
        int[][] grid = {{1}, {2}};


        assertEquals(1, rottingOranges.orangesRotting(grid));
    }
}