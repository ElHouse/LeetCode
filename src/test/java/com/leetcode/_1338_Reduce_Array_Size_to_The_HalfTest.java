package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1338_Reduce_Array_Size_to_The_HalfTest {


    private final _1338_Reduce_Array_Size_to_The_Half reduceArraySizeToTheHalf = new _1338_Reduce_Array_Size_to_The_Half();

    @Test
    public void test01(){

        assertEquals(2, reduceArraySizeToTheHalf.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));

    }

    @Test
    public void test02(){

        assertEquals(1, reduceArraySizeToTheHalf.minSetSize(new int[]{7,7,7,7,7,7}));

    }

    @Test
    public void test03(){

        assertEquals(1, reduceArraySizeToTheHalf.minSetSize(new int[]{1,9}));

    }

}