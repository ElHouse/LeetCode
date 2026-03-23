package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _560_Subarray_Sum_Equals_KTest {


    _560_Subarray_Sum_Equals_K subarraySumEqualsK = new _560_Subarray_Sum_Equals_K();


    @Test
    public void trest01() {
        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(2, subarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3));
        assertEquals(4, subarraySumEqualsK.subarraySum(new int[]{1, 2, 1, 2, 1}, 3));

        assertEquals(0, subarraySumEqualsK.subarraySum(new int[]{1}, 0));
        assertEquals(1, subarraySumEqualsK.subarraySum(new int[]{1}, 1));
        assertEquals(1, subarraySumEqualsK.subarraySum(new int[]{-1, -1, 1}, 0));
        assertEquals(3, subarraySumEqualsK.subarraySum(new int[]{1, -1, 0}, 0));

    }

}