package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class _34_Find_First_and_Last_Position_of_Element_in_Sorted_ArrayTest {

    private final _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array findFirstAndLastPositionOfElementInSortedArray = new _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array();


    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 4},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }


    @Test
    public void test2() {
        assertArrayEquals(new int[]{-1, -1},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }


    @Test
    public void test3() {
        assertArrayEquals(new int[]{-1, -1},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[0], 0));

    }


    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 13},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10}, 1));

    }


    @Test
    public void test5() {
        assertArrayEquals(new int[]{9, 15},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 10}, 1));

    }

    @Test
    public void test6() {
        assertArrayEquals(new int[]{-1, -1},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 10}, 2));

    }

    @Test
    public void test7() {
        assertArrayEquals(new int[]{0, 0},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[1], 0));

    }

    @Test
    public void test8() {
        assertArrayEquals(new int[]{-1, -1},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[1], 1));

    }

    @Test
    public void test9() {
        assertArrayEquals(new int[]{0, 0},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{1, 3}, 1));

    }

    @Test
    public void test10() {
        assertArrayEquals(new int[]{1, 1},
                findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{1, 3}, 3));

    }

}