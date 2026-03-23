package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _57_Insert_IntervalTest {

    _57_Insert_Interval insertInterval = new _57_Insert_Interval();

    @Test
    public void test01() {

        int[][] numeros = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] inter = {4, 8};

        insertInterval.insert(numeros, inter);
    }

    @Test
    public void test02() {

        int[][] numeros = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] inter = {8, 11};

        insertInterval.insert(numeros, inter);
    }


    @Test
    public void test03() {

        int[][] numeros = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[] inter = {8, 17};

        insertInterval.insert(numeros, inter);
    }

    @Test
    public void test04() {

        int[][] numeros = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 11},
                {12, 16}
        };

        int[] inter = {9, 10};

        insertInterval.insert(numeros, inter);
    }

    @Test
    public void test05() {

        int[][] numeros = {
                {1, 3},
                {6, 9}
        };

        int[] inter = {2, 5};


        int[][] expected = {
                {1, 5},
                {6, 9}
        };

        assertArrayEquals(expected, insertInterval.insert(numeros, inter));
    }

    @Test
    public void test06() {

        int[][] numeros = {};

        int[] inter = {5, 7};


        int[][] expected = {
                {5, 7}
        };

        assertArrayEquals(expected, insertInterval.insert(numeros, inter));
    }

}