package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _33_Search_in_Rotated_Sorted_ArrayTest {


    _33_Search_in_Rotated_Sorted_Array searchInRotatedSortedArray = new _33_Search_in_Rotated_Sorted_Array();
    @Test
    public void case1Pivote() {
        System.out.println("-------------case1 pivote");
        int[] nums  = {8,1,2,3,4,5,6,7};
//    	assertEquals(1,findPivot(nums));
        assertEquals(0,searchInRotatedSortedArray.search(nums,8));
    }

    @Test
    public void case2Pivote() {
        System.out.println("-------------case2 pivote");
        int[] nums  = {4,5,6,7,8,0,1,2};
//    	assertEquals(5,findPivot(nums));
        assertEquals(5,searchInRotatedSortedArray.search(nums,0));
    }

    @Test
    public void case3Pivote() {
        System.out.println("-------------case3 pivote");
        int[] nums  = {4,5,6,7,8,9,11,12,13,14,1,2};
        //             0 1 2 3 4 5  6  7  8  9 0 1
//    	assertEquals(10,findPivot(nums));
        assertEquals(2,searchInRotatedSortedArray.search(nums,6));
    }


    @Test
    public void case4Pivote() {
        System.out.println("-------------case4 pivote");
        int[] nums  = {4,5,6,7,0,1,2};
        //             0 1 2 3 4 5 6
//    	assertEquals(10,findPivot(nums));
        assertEquals(-1,searchInRotatedSortedArray.search(nums,3));
    }

    @Test
    public void case5Pivote() {
        System.out.println("-------------case5 pivote");
        int[] nums  = {1};
        //             0 1 2 3 4 5 6
//    	assertEquals(10,findPivot(nums));
        assertEquals(-1,searchInRotatedSortedArray.search(nums,0));
    }

    @Test
    public void case6Pivote() {
        System.out.println("-------------case6 pivote");
        int[] nums  = {5,1};
        //             0 1 2 3 4 5 6
        assertEquals(1,searchInRotatedSortedArray.findPivot(nums));
//    	assertEquals(-1,searchInRotatedSortedArray.search(nums,0));
    }

    @Test
    public void case7Pivote() {
        System.out.println("-------------case7 pivote");
        int[] nums  = {1};
        assertEquals(-1,searchInRotatedSortedArray.search(nums,2));
    }

    @Test
    public void case8Pivote() {
        System.out.println("-------------case8 pivote");
        int[] nums  = {1,3};
        assertEquals(-1,searchInRotatedSortedArray.search(nums,0));
    }

    @Test
    public void case9Pivote() {
        System.out.println("-------------case9 pivote");
        int[] nums  = {1,3};
        assertEquals(-1,searchInRotatedSortedArray.search(nums,2));
    }

    @Test
    public void case10Pivote() {
        System.out.println("-------------case10 pivote");
        int[] nums  = {4,5,6,7,0,1,2};
        //             0 1 2 3 4 5 6
        assertEquals(2,searchInRotatedSortedArray.search(nums,6));
    }
}