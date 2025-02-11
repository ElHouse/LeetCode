package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _643_Maximum_Average_Subarray_ITest {

    private final _643_Maximum_Average_Subarray_I maximumAverageSubarrayI = new _643_Maximum_Average_Subarray_I();

    @Test
    public void test1() {
        assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    @Test
    public void test2() {
        assertEquals(5.00, maximumAverageSubarrayI.findMaxAverage(new int[]{5}, 1));
    }


    @Test
    public void test3() {
        double expected = (double) (1 + 12 + -5 + -6 + 50 + 3) / 6;
        assertEquals(expected, maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 6));
    }

    @Test
    public void test4() {
        assertEquals(5.00, maximumAverageSubarrayI.findMaxAverage(new int[]{5, 5}, 1));
    }


    @Test
    public void test5() {
        assertEquals(8.00, maximumAverageSubarrayI.findMaxAverage(new int[]{5, 5, 2, 3, 4, 8, 8}, 1));
    }

    @Test
    public void test6() {
        assertEquals(8.00, maximumAverageSubarrayI.findMaxAverage(new int[]{5, 5, 2, 3, 4, 8, 8}, 2));
    }

    @Test
    public void test7() {
        assertEquals(-1.00, maximumAverageSubarrayI.findMaxAverage(new int[]{-1}, 1));
    }
}