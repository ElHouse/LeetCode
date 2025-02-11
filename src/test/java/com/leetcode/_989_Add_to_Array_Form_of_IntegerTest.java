package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _989_Add_to_Array_Form_of_IntegerTest {

    _989_Add_to_Array_Form_of_Integer addToArrayFormOfInteger = new _989_Add_to_Array_Form_of_Integer();

    @Test
    public void case1() {
        int[] A = {1,2,0,0};
        int K = 34;
        int[] R = {1,2,3,4};

        assertEquals(Arrays.toString(R),addToArrayFormOfInteger.addToArrayForm(A, K).toString());
    }



    @Test
    public void case2() {
        int[] A = {2,7,4};
        int   K = 181;
        int[] R = {4,5,5};

        assertEquals(Arrays.toString(R),addToArrayFormOfInteger.addToArrayForm(A, K).toString());
    }


    @Test
    public void case3() {
        int[] A = {2,1,5};
        int K = 806;
        int[] R = {1,0,2,1};

        assertEquals(Arrays.toString(R),addToArrayFormOfInteger.addToArrayForm(A, K).toString());
    }


    @Test
    public void case4() {
        int[] A = {9,9,9,9,9,9,9,9,9,9};
        int K = 1;
        int[] R = {1,0,0,0,0,0,0,0,0,0,0};

        assertEquals(Arrays.toString(R),addToArrayFormOfInteger.addToArrayForm(A, K).toString());
    }


    @Test
    public void case5() {
        int[] A = null;
        int K = 0;
        int[] R = {};

        assertEquals(Arrays.toString(R),addToArrayFormOfInteger.addToArrayForm(A, K).toString());
    }
}