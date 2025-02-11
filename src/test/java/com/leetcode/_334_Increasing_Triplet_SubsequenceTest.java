package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _334_Increasing_Triplet_SubsequenceTest {


    private final _334_Increasing_Triplet_Subsequence increasingTripletSubsequence = new _334_Increasing_Triplet_Subsequence();


    @Test
    public void test1() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test2() {
        assertFalse(increasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }

    @Test
    public void test4() {
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 5, 0, 6, 4, 6, 9}));
    }

    @Test
    public void test5() {
        assertFalse(increasingTripletSubsequence.increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3}));
    }

    @Test
    public void test6() {//                                                 0    1   2   3   4  5
        assertTrue(increasingTripletSubsequence.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
    }

    @Test
    public void test7() {//                                                 0    1   2   3   4  5
        assertFalse(increasingTripletSubsequence.increasingTriplet(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
                , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
                , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

}