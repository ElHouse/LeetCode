package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _581_Shortest_Unsorted_Continuous_SubarrayTest {


    _581_Shortest_Unsorted_Continuous_Subarray shortestUnsortedContinuousSubarray = new _581_Shortest_Unsorted_Continuous_Subarray();

    @Test
    public void test01() {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        assertEquals(5, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));

    }

    @Test
    public void test02() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test03() {
        int[] nums = {1};
        assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }


    @Test
    public void test04() {
        int[] nums = {-1, 2, 4, 5, 6, 3, 8, 9, 10, 11, 7, 0};
        assertEquals(11, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }


    @Test
    public void test05() {
        int[] nums = {2, 1};
        assertEquals(2, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test06() {
        int[] nums = {1, 2};
        assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test07() {
        int[] nums = {1, 2, 4, 5, 6, 3, 8, 9, 10, 11, 7, 0};
        assertEquals(12, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }


    @Test
    public void test08() {
        int[] nums = {1, 3, 2, 2, 2};
        assertEquals(4, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test09() {
        int[] nums = {1, 2, 3, 3, 3};
        assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test10() {
        int[] nums = {1, 1};
        assertEquals(0, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test11() {
        int[] nums = {2,3,3,2,4};
        assertEquals(3, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }

    @Test
    public void test12() {
        int[] nums = {1,2,5,3,4};
        assertEquals(3, shortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));
    }
}