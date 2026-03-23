package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1920_Build_Array_from_PermutationTest {


    _1920_Build_Array_from_Permutation buildArrayFromPermutation = new _1920_Build_Array_from_Permutation();


    @Test
    public void test01(){

        assertArrayEquals(new int[]{0,1,2,4,5,3}, buildArrayFromPermutation.buildArray(new int[]{0,2,1,5,3,4}));
        assertArrayEquals(new int[]{4,5,0,1,2,3}, buildArrayFromPermutation.buildArray(new int[]{5,0,1,2,3,4}));

    }

}