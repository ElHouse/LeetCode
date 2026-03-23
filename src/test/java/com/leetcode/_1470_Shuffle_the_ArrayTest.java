package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1470_Shuffle_the_ArrayTest {
    _1470_Shuffle_the_Array shuffleTheArray = new _1470_Shuffle_the_Array();

    @Test
    public void test01() {
        assertArrayEquals(new int[]{2,3,5,4,1,7}, shuffleTheArray.shuffle(new int[]{2,5,1,3,4,7},3));
        assertArrayEquals(new int[]{1,4,2,3,3,2,4,1}, shuffleTheArray.shuffle(new int[]{1,2,3,4,4,3,2,1},4));
        assertArrayEquals(new int[]{1,2,1,2}, shuffleTheArray.shuffle(new int[]{1,1,2,2},2));
    }
}