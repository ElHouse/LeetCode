package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _239_Sliding_Window_MaximumTest {

    private final _239_Sliding_Window_Maximum slidingWindowMaximum = new _239_Sliding_Window_Maximum();

    @Test
    public void test01() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, result);
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[]{1}, slidingWindowMaximum.maxSlidingWindow(new int[]{1}, 1));
    }


    @Test
    public void test03() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{-1, -3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{-1, -1, 5, 5, 6, 7}, result);
    }


    @Test
    public void test04() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{-1, -3, -1, -3, 5, 3, 6, 7}, 8);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{7}, result);
    }

    @Test
    public void test05() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{-1, -3, -1, -3, 5, 3, 6, 7}, 6);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{5, 6, 7}, result);
    }

    @Test
    public void test06() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{-1, -3, -1, -3, 5, 3, 6, 7}, 1);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{-1, -3, -1, -3, 5, 3, 6, 7}, result);
    }


    @Test
    public void test07() {
        assertArrayEquals(new int[]{2}, slidingWindowMaximum.maxSlidingWindow(new int[]{1, 2}, 2));
    }

    @Test
    public void test08() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{7, 2, 4}, 2);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{7, 4}, result);
    }

    @Test
    public void test09() {
        int[] result = slidingWindowMaximum.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{3,3,2,5}, result);
    }
}