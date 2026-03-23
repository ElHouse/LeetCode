package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1636_Sort_Array_by_Increasing_FrequencyTest {

    _1636_Sort_Array_by_Increasing_Frequency sortArrayByIncreasingFrequency = new _1636_Sort_Array_by_Increasing_Frequency();


    @Test
    public void test01() {

        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, sortArrayByIncreasingFrequency.frequencySort(new int[]{1, 1, 2, 2, 2, 3}));
        assertArrayEquals(new int[]{1, 3, 3, 2, 2}, sortArrayByIncreasingFrequency.frequencySort(new int[]{2, 3, 1, 3, 2}));
        assertArrayEquals(new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1}, sortArrayByIncreasingFrequency.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}));
    }
}