package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2958_Length_of_Longest_Subarray_With_at_Most_K_FrequencyTest {


    private final _2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency lengthOfLongestSubarrayWithAtMostKFrequency = new _2958_Length_of_Longest_Subarray_With_at_Most_K_Frequency();


    @Test
    public void test01() {
        assertEquals(6, lengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(new int[]{1, 2, 3, 1, 2, 3, 1, 2}, 2));
    }

    @Test
    public void test02() {
        assertEquals(2, lengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 1));
    }

    @Test
    public void test03() {
        assertEquals(4, lengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(new int[]{5, 5, 5, 5, 5, 5, 5}, 4));
    }

    @Test
    public void test04() {
        assertEquals(2, lengthOfLongestSubarrayWithAtMostKFrequency.maxSubarrayLength(new int[]{1,4,4,3}, 1));
    }
}