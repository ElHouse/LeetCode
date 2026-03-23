package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2545_Sort_theStudents_by_Their_Kth_ScoreTest {


    _2545_Sort_theStudents_by_Their_Kth_Score sortTheStudentsByTheirKthScore = new _2545_Sort_theStudents_by_Their_Kth_Score();

    @Test
    public void test01() {
        int[][] score = new int[][]{{10, 5, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15}};

        int[][] expected = new int[][]{{7, 5, 11, 2},
                {10, 5, 9, 1},
                {4, 8, 3, 15}};

        assertArrayEquals(expected, sortTheStudentsByTheirKthScore.sortTheStudents(score, 2));
    }


    @Test
    public void test02() {
        int[][] score = new int[][]{{3, 4},
                {5, 6}};

        int[][] expected = new int[][]{{5, 6},
                {3, 4}};

        assertArrayEquals(expected, sortTheStudentsByTheirKthScore.sortTheStudents(score, 0));
    }


    @Test
    public void test03() {
        int[][] score = new int[][]{{3, 4},
                {5, 6}};


        assertNull(sortTheStudentsByTheirKthScore.sortTheStudents(score, 5));
    }

    @Test
    public void test04() {
        int[][] score = new int[][]{{3, 4},
                {5, 1}};

        int[][] expected = new int[][]{{3, 4},
                {5, 1}};

        assertArrayEquals(expected, sortTheStudentsByTheirKthScore.sortTheStudents(score, 1));
    }


    @Test
    public void test05() {
        int[][] score = new int[][]{{3, 4},
                {5, 111}};

        int[][] expected = new int[][]{{5, 111},
                {3, 4}};

        assertArrayEquals(expected, sortTheStudentsByTheirKthScore.sortTheStudents(score, 1));
    }


    @Test
    public void test06() {
        int[][] score = new int[][]{
                {64766, 11978, 20502, 21365, 79611, 36797, 58431, 89540, 59373, 25955},
                {51305, 66104, 88468, 5333, 17233, 32521, 14087, 42738, 46669, 65662},
                {93306, 92793, 54009, 9715, 24354, 24895, 20069, 93332, 73836, 64359},
                {23358, 84599, 4675, 20979, 76889, 34630, 64098, 23468, 71448, 17848}
        };

        int[][] expected = new int[][]{
                {64766, 11978, 20502, 21365, 79611, 36797, 58431, 89540, 59373, 25955},
                {23358, 84599, 4675, 20979, 76889, 34630, 64098, 23468, 71448, 17848},
                {51305, 66104, 88468, 5333, 17233, 32521, 14087, 42738, 46669, 65662},
                {93306, 92793, 54009, 9715, 24354, 24895, 20069, 93332, 73836, 64359}

        };

        assertArrayEquals(expected, sortTheStudentsByTheirKthScore.sortTheStudents(score, 5));
    }
}



