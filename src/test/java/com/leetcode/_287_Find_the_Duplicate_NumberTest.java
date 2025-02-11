package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _287_Find_the_Duplicate_NumberTest {


    _287_Find_the_Duplicate_Number findTheDuplicateNumber = new _287_Find_the_Duplicate_Number();

    @Test
    public void case1() {

        int[] nums = {1, 3, 4, 2, 2};

        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));

    }


    @Test
    public void case2() {

        int[] nums = {3, 1, 3, 4, 2};

        assertEquals(3, findTheDuplicateNumber.findDuplicate(nums));

    }


    @Test
    public void case3() {

        int[] nums = {2};

        assertEquals(-1, findTheDuplicateNumber.findDuplicate(nums));

    }


    @Test
    public void case4() {

        int[] nums = {2, 2};

        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));

    }


    @Test
    public void case5() {
        int[] nums = {1, 2, 3};

        assertEquals(-1, findTheDuplicateNumber.findDuplicate(nums));

    }


    @Test
    public void case6() {

        int[] nums = {2, 2, 3, 4, 5};

        assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));

    }

    @Test
    public void case7() {

        int[] nums = {2, 3, 4, 5, 6, 8, 9, 9};

        assertEquals(9, findTheDuplicateNumber.findDuplicate(nums));

    }
}