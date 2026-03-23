package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2336_Smallest_Number_in_Infinite_SetTest {


    private final _2336_Smallest_Number_in_Infinite_Set smallestNumberInInfiniteSet = new _2336_Smallest_Number_in_Infinite_Set();


    @Test
    public void test01() {

        _2336_Smallest_Number_in_Infinite_Set.SmallestInfiniteSet smallestInfiniteSet = smallestNumberInInfiniteSet.new SmallestInfiniteSet();

        smallestInfiniteSet.addBack(2);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(4, smallestInfiniteSet.popSmallest());
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }




}