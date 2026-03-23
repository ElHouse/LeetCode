package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1137_N_th_Tribonacci_NumberTest {
    private final _1137_N_th_Tribonacci_Number nThTribonacciNumber = new _1137_N_th_Tribonacci_Number();


    @Test
    public void test01() {

        assertEquals(4, nThTribonacciNumber.tribonacci(4));
    }


    @Test
    public void test02() {

        assertEquals(1389537, nThTribonacciNumber.tribonacci(25));
    }


    @Test
    public void test03() {

        assertEquals(7, nThTribonacciNumber.tribonacci(5));
    }


    @Test
    public void test04() {

        assertEquals(0, nThTribonacciNumber.tribonacci(0));
    }

    @Test
    public void test05() {

        assertEquals(1, nThTribonacciNumber.tribonacci(1));
    }
    @Test
    public void test06() {

        assertEquals(1, nThTribonacciNumber.tribonacci(2));
    }
}