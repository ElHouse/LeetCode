package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1679_Max_Number_of_K_Sum_PairsTest {


    private final _1679_Max_Number_of_K_Sum_Pairs maxNumberOfKSumPairs = new _1679_Max_Number_of_K_Sum_Pairs();


    @Test
    public void test0() {
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void test1() {
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
    }

    @Test
    public void test2() {
        assertEquals(0, maxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4, 5}, 50));
    }

    @Test
    public void test3() {
        assertEquals(4, maxNumberOfKSumPairs.maxOperations(new int[]{3, 3, 3, 3, 7, 7, 7, 7}, 10));
    }

    @Test
    public void test4() {
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4, 108}, 109));
    }

    @Test
    public void test5() {
        assertEquals(4, maxNumberOfKSumPairs.maxOperations(new int[]{3, 3, 3, 3, 7, 7, 7, 7}, 10));
    }

    @Test
    public void test6() {
        assertEquals(24,
                maxNumberOfKSumPairs.maxOperations(new int[]{3, 3, 3, 3, 7, 7, 7, 7,
                        3, 3, 3, 3, 7, 7, 7, 7,
                        3, 3, 3, 3, 7, 7, 7, 7,
                        3, 3, 3, 3, 7, 7, 7, 7,
                        3, 3, 3, 3, 7, 7, 7, 7,
                        3, 3, 3, 3, 7, 7, 7, 7}, 10));
    }


    @Test
    public void test7() {
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5}, 5));
    }

    @Test
    public void test8() {
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4));
    }


    @Test
    public void test9() {
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(new int[]{80, 2, 2, 3, 1, 1, 4, 5}, 85));
    }


}