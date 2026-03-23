package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _209_Minimum_Size_Subarray_SumTest {

    private final _209_Minimum_Size_Subarray_Sum minimumSizeSubarraySum = new _209_Minimum_Size_Subarray_Sum();


    @Test
    public void testMinSubArrayLen_case1() {
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    public void testMinSubArrayLen_case2() {
        assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 4, 5}));
    }

    @Test
    public void testMinSubArrayLen_case3() {
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(70, new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testMinSubArrayLen_case4() {
        assertEquals(5, minimumSizeSubarraySum.minSubArrayLen(5, new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testMinSubArrayLen_case5() {
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(6, new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testMinSubArrayLen_case6() {
        assertEquals(4, minimumSizeSubarraySum.minSubArrayLen(4, new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void testMinSubArrayLen_case7() {
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(15, new int[]{5,1,3,5,10,7,4,9,2,8}));
    }

    @Test
    public void testMinSubArrayLen_case8() {
        assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(18, new int[]{5,1,3,5,10,7,4,9,8,10}));
    }

    @Test
    public void testMinSubArrayLen_case9() {
        assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(41, new int[]{1, 4, 5}));
    }


}