package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _2215_Find_the_Difference_of_Two_ArraysTest {


    private final _2215_Find_the_Difference_of_Two_Arrays findTheDifferenceOfTwoArrays = new _2215_Find_the_Difference_of_Two_Arrays();

    @Test
    public void test1() {


        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        expected.add(lista1);
        expected.add(lista2);

        lista1.add(1);
        lista1.add(3);

        lista2.add(4);
        lista2.add(6);

        List<List<Integer>> resopnse = this.findTheDifferenceOfTwoArrays.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});

        assertEquals(expected, resopnse);
    }


    @Test
    public void test2() {


        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        expected.add(lista1);
        expected.add(lista2);

        lista1.add(3);

        List<List<Integer>> resopnse = this.findTheDifferenceOfTwoArrays.findDifference(new int[]{1, 2, 3, 3},
                new int[]{1, 1, 2, 2});

        assertEquals(expected, resopnse);
    }


    @Test
    public void test3() {


        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        expected.add(lista1);
        expected.add(lista2);

        lista1.add(3);
        lista1.add(4);

        List<List<Integer>> resopnse = this.findTheDifferenceOfTwoArrays.findDifference(new int[]{1, 2, 3, 3, 4},
                new int[]{1, 1, 2, 2, 2, 2, 2,});

        assertEquals(expected, resopnse);
    }

    @Test
    public void test4() {


        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        expected.add(lista1);
        expected.add(lista2);

        List<List<Integer>> resopnse = this.findTheDifferenceOfTwoArrays.findDifference(
                new int[]{1, 2, 3, 4},
                new int[]{1, 2, 3, 4});

        assertEquals(expected, resopnse);
    }

    @Test
    public void test5() {


        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        expected.add(lista1);
        expected.add(lista2);

        lista1.add(0);
        lista2.add(5);

        List<List<Integer>> resopnse = this.findTheDifferenceOfTwoArrays.findDifference(
                new int[]{0, 1, 2, 3, 4},
                new int[]{1, 2, 3, 4, 5});

        assertEquals(expected, resopnse);
    }
}