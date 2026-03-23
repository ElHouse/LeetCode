package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _80_Remove_Duplicates_from_Sorted_Array_IITest {

    private final _80_Remove_Duplicates_from_Sorted_Array_II removeDuplicatesFromSortedArrayIi = new _80_Remove_Duplicates_from_Sorted_Array_II();

    @Test
    public void test01() {

        int[] expected = new int[]{1, 1, 2, 2, 3, 3};
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};

        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(5, result);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test02() {

        int[] expected = new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3};
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};

        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(7, result);
        assertArrayEquals(expected, nums);
    }


    @Test
    public void test03() {

        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(9, result);
        assertArrayEquals(expected, nums);
    }


    @Test
    public void test04() {

        int[] expected = new int[]{-1, 0, 0, 1, 1, 2, 3, 3, 3, 3};
        int[] nums = new int[]{-1, 0, 0, 1, 1, 1, 1, 2, 3, 3};


        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(8, result);
        assertArrayEquals(expected, nums);
    }


    @Test
    public void test05() {

        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0};


        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(2, result);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test06() {

        int[] expected = new int[]{0, 0, 1, 0, 0, 0, 0, 0, 1};
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1};


        int result = removeDuplicatesFromSortedArrayIi.removeDuplicates(nums);

        assertEquals(3, result);
        assertArrayEquals(expected, nums);
    }

}