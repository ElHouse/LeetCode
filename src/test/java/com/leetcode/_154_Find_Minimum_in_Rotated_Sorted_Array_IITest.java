package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _154_Find_Minimum_in_Rotated_Sorted_Array_IITest {

    private final _154_Find_Minimum_in_Rotated_Sorted_Array_II findMinimumInRotatedSortedArrayIi = new _154_Find_Minimum_in_Rotated_Sorted_Array_II();

    @Test
    public void case1() {
        int[] nums = {3, 4, 5, 1, 1, 2, 2, 2};
        assertEquals(1, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case2() {
        int[] nums = {4, 5, 6, 7, 0, 0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case3() {
        int[] nums = {4, 4};
        assertEquals(4, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case4() {
        int[] nums = {4, 4, 5};
        assertEquals(4, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case5() {
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 0, 1, 2, 3};
        assertEquals(0, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case6() {
        int[] nums = {0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case7() {
        int[] nums = {4, 5, 6, 7, 0, 0, 0, 0, 0, 0, 1, 2};
        assertEquals(0, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }


    @Test
    public void case8() {
        int[] nums = {1, 3, 5};
        assertEquals(1, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case9() {
        int[] nums = {2, 2, 2, 0, 1};
        assertEquals(2, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }

    @Test
    public void case10() {
        int[] nums = {3, 1, 3, 3};
        assertEquals(1, findMinimumInRotatedSortedArrayIi.findMin(nums));
    }
}