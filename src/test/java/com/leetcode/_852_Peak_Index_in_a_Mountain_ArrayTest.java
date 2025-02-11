package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _852_Peak_Index_in_a_Mountain_ArrayTest {

    _852_Peak_Index_in_a_Mountain_Array peakIndexInAMountainArray = new _852_Peak_Index_in_a_Mountain_Array();

    @Test
    public void case1() {
        int[] A = {0, 1, 0};

        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(A));

    }

    @Test
    public void case2() {
        int[] A = {0, 1, 0, 1, 0, 1, 0};

        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(A));

    }


    @Test
    public void case3() {
        int[] A = {0, 1, 0, 0, 0, 0, 0, 1};

        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(A));

    }


    @Test
    public void case4() {
        int[] A = {0, 1, 0, 0, 2, 0, 2, 1};

        assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(A));

    }


    @Test
    public void case5() {
        int[] A = {3, 4, 5, 1};

        assertEquals(2, peakIndexInAMountainArray.peakIndexInMountainArray(A));

    }


}