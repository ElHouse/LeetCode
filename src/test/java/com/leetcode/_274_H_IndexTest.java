package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _274_H_IndexTest {

    private final _274_H_Index hIndex = new _274_H_Index();

    @Test
    public void test1() {


        assertEquals(3, hIndex.hIndex(new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(1, hIndex.hIndex(new int[]{1, 3, 1}));
        assertEquals(5, hIndex.hIndex(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 5}));
   //     assertEquals(1, hIndex.hIndex(new int[]{3, 0, 6, 1}));
        assertEquals(1, hIndex.hIndex(new int[]{1}));
        assertEquals(0, hIndex.hIndex(new int[]{0}));
        assertEquals(2, hIndex.hIndex(new int[]{11, 15}));
        assertEquals(1, hIndex.hIndex(new int[]{1, 2}));
        assertEquals(2, hIndex.hIndex(new int[]{4, 4, 0, 0}));
        assertEquals(2, hIndex.hIndex(new int[]{0, 0, 4, 4}));


    }

}