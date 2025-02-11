package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _724_Find_Pivot_IndexTest {


    _724_Find_Pivot_Index findPivotIndex = new _724_Find_Pivot_Index();

    @Test
    public void case1() {
        System.out.println("###############> case 1");
        int[] nums = {1, 7, 3, 6, 5, 6};

        assertEquals(3, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void case2() {
        System.out.println("###############> case 2");
        int[] nums = {1, 2, 3};

        assertEquals(-1, findPivotIndex.pivotIndex(nums));
    }
}