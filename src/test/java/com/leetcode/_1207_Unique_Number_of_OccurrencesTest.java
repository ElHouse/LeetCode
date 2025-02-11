package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1207_Unique_Number_of_OccurrencesTest {


    private final _1207_Unique_Number_of_Occurrences uniqueNumberOfOccurrences = new _1207_Unique_Number_of_Occurrences();

    @Test
    public void case1() {


        int[] arr = {1, 2, 2, 1, 1, 3};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }


    @Test
    public void case2() {


        int[] arr = {1, 2};

        assertFalse(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }

    @Test
    public void case3() {


        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }

    @Test
    public void case4() {


        int[] arr = {1};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }

    @Test
    public void case5() {


        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }

    @Test
    public void case6() {


        int[] arr = {1, 1, 1, 1};

        assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));

    }
}