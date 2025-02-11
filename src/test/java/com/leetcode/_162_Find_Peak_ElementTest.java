package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _162_Find_Peak_ElementTest {


    private final _162_Find_Peak_Element find_peak_element = new _162_Find_Peak_Element();

    @Test
    public void case1() {

        int[] nums = {1, 2, 3, 1};
        assertEquals(2, find_peak_element.findPeakElement(nums));
    }


    @Test
    public void case2() {

        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        assertEquals(1, find_peak_element.findPeakElement(nums));
    }


    @Test
    public void case3() {

        int[] nums = {8};
        assertEquals(0, find_peak_element.findPeakElement(nums));
    }


    @Test
    public void case4() {

        int[] nums = {1, 2, 4, 5, 6, 7, 8, 9};
        assertEquals(7, find_peak_element.findPeakElement(nums));
    }

    @Test
    public void case5() {

        int[] nums = {-2147483648};
        assertEquals(0, find_peak_element.findPeakElement(nums));
    }
}