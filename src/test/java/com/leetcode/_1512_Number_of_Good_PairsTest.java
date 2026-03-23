package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1512_Number_of_Good_PairsTest {


    private final _1512_Number_of_Good_Pairs numberOfGoodPairs = new _1512_Number_of_Good_Pairs();

    @Test
    public void test01(){
        assertEquals(4, numberOfGoodPairs.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
    @Test
    public void test02(){
        assertEquals(6, numberOfGoodPairs.numIdenticalPairs(new int[]{1,1,1,1}));
    }
    @Test
    public void test03(){
        assertEquals(0, numberOfGoodPairs.numIdenticalPairs(new int[]{1,2,3}));
    }
}