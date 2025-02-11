package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _153_Find_Minimum_in_Rotated_Sorted_ArrayTest {

    private final _153_Find_Minimum_in_Rotated_Sorted_Array findMinimumInRotatedSortedArray = new _153_Find_Minimum_in_Rotated_Sorted_Array();

    @Test
    public void case1() {
        int[] nums = {3, 4, 5, 1, 2};
        assertEquals(1, findMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    public void case2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(nums));
    }


    @Test
    public void case3() {
        int[] nums = {4};
        assertEquals(4, findMinimumInRotatedSortedArray.findMin(nums));
    }


    @Test
    public void case4() {
        int[] nums = {4, 5};
        assertEquals(4, findMinimumInRotatedSortedArray.findMin(nums));
    }


    @Test
    public void case5() {
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2, 3};
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(nums));
    }


    @Test
    public void case6() {
        int[] nums = {0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(nums));
    }


    @Test
    public void case7() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArray.findMin(nums));
    }
}