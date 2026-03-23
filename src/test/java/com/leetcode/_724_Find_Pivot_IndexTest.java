package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _724_Find_Pivot_IndexTest {


    private final _724_Find_Pivot_Index findPivotIndex = new _724_Find_Pivot_Index();

    @Test
    public void case1() {
        int[] nums = {1, 7, 3, 6, 5, 6};

        assertEquals(3, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void case2() {
        int[] nums = {1, 2, 3};

        assertEquals(-1, findPivotIndex.pivotIndex(nums));
    }


    @Test
    public void case3() {
        int[] nums = {2, 1, -1};

        assertEquals(0, findPivotIndex.pivotIndex(nums));
    }


    @Test
    public void case4() {
        int[] nums = {1, -1, 5};

        assertEquals(2, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void case5() {
        int[] nums = {-1,-1,0,1,0,-1};

        assertEquals(4, findPivotIndex.pivotIndex(nums));
    }
}