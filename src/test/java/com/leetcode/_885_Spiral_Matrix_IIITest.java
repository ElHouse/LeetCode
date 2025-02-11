package com.leetcode;

import com.leetcode._885_Spiral_Matrix_III;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _885_Spiral_Matrix_IIITest {

    private final _885_Spiral_Matrix_III spiralMatrixIii = new _885_Spiral_Matrix_III();


    @Test
    public void test1() {

        int[][] expected = new int[][]{{1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4}, {0, 5}, {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4}, {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0}, {2, 0}, {1, 0}, {0, 0}};

        assertArrayEquals(expected, spiralMatrixIii.spiralMatrixIII(5, 6, 1, 4));
    }

    @Test
    public void test2() {

        int[][] expected = new int[][]{{0, 0}};

        assertArrayEquals(expected, spiralMatrixIii.spiralMatrixIII(1, 1, 0, 0));
    }


    @Test
    public void test3() {

        int[][] expected = new int[][]{{0, 0}, {0, 1}, {0, 2}, {0, 3}};

        assertArrayEquals(expected, spiralMatrixIii.spiralMatrixIII(1, 4, 0, 0));
    }



    @Test
    public void test4() {

        int[][] expected = new int[][]{{1, 1}, {1, 0}, {0, 0}, {0, 1}};

        assertArrayEquals(expected, spiralMatrixIii.spiralMatrixIII(2, 2, 1, 1));
    }

}