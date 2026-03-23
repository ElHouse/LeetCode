package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2542_Maximum_Subsequence_ScoreTest {


    private final _2542_Maximum_Subsequence_Score maximumSubsequenceScore = new _2542_Maximum_Subsequence_Score();


    @Test
    public void test01() {

        assertEquals(12, maximumSubsequenceScore.maxScore(new int[]{1, 3, 3, 2},
                new int[]{2, 1, 3, 4},
                3));
    }

    @Test
    public void test02() {

        assertEquals(30, maximumSubsequenceScore.maxScore(new int[]{4, 2, 3, 1, 1},
                new int[]{7, 5, 10, 9, 6},
                1));
    }


    @Test
    public void test03() {

        assertEquals(3, maximumSubsequenceScore.maxScore(new int[]{3, 3, 3, 3},
                new int[]{1, 1, 1, 1},
                1));
    }


    @Test
    public void test04() {

        assertEquals(33, maximumSubsequenceScore.maxScore(new int[]{33, 3, 3, 3},
                new int[]{1, 1, 1, 1},
                1));
    }

    @Test
    public void test05() {

        assertEquals(32, maximumSubsequenceScore.maxScore(new int[]{5, 6, 7, 8},
                new int[]{1, 2, 3, 4},
                1));
    }


    @Test
    public void test06() {

        assertEquals((8 + 9 + 10 + 11 + 12) * 2, maximumSubsequenceScore.maxScore(new int[]{5, 6, 7, 8, 9, 10, 11, 12},
                new int[]{1, 2, 3, 4, 1, 1, 2, 2},
                //       0   1  2  3  4  5  6  7
                5));
    }


    @Test
    public void test07() {

        assertEquals(1121, maximumSubsequenceScore.maxScore(new int[]{23,16,20,7,3},
                new int[]{19,21,22,22,12},
                3));
    }

    @Test
    public void test08() {
//                                                                             0  1  2  3 4 5
        assertEquals(1364, maximumSubsequenceScore.maxScore(new int[]{22,5,25,15,28,1},
                new int[]{22,30,25,25,9,18},
                //        0   1  2  3 4* 5*
                3));
    }


}