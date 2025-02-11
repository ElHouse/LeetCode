package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _704_Binary_SearchTest {

    _704_Binary_Search binarySearch = new _704_Binary_Search();

    @Test
    public void case1() {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, binarySearch.search(nums, 9));
    }

    @Test
    public void case2() {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, binarySearch.search(nums, 2));
    }

    @Test
    public void case3() {

        int[] nums = {5};
        assertEquals(-1, binarySearch.search(nums, -5));
    }


    @Test
    public void case4() {

        int[] nums = {2, 5};
        assertEquals(1, binarySearch.search(nums, 5));
    }

    @Test
    public void case5() {

        int[] nums = {2, 5};
        assertEquals(0, binarySearch.search(nums, 2));
    }

    @Test
    public void case6() {

        int[] nums = {1, 2, 5};
        assertEquals(0, binarySearch.search(nums, 1));
    }

    @Test
    public void case7() {

        int[] nums = {1, 2, 5};
        assertEquals(1, binarySearch.search(nums, 2));
    }

    @Test
    public void case8() {
        System.out.println("case 8---------------");
        int[] nums = {1, 2, 5};
        assertEquals(2, binarySearch.search(nums, 5));
    }

}