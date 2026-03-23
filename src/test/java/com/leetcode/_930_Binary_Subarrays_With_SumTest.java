package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _930_Binary_Subarrays_With_SumTest {

    private final _930_Binary_Subarrays_With_Sum binarySubarraysWithSum = new _930_Binary_Subarrays_With_Sum();


    @Test
    public void test01() {
        assertEquals(4, binarySubarraysWithSum.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }


    @Test
    public void test02() {
        assertEquals(15, binarySubarraysWithSum.numSubarraysWithSum(new int[]{0, 0, 0, 0, 0}, 0));
    }


    //@Test
    public void test03() {
        //assertEquals(4, binarySubarraysWithSum.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }
}