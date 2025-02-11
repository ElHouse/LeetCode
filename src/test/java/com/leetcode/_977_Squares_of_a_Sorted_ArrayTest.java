package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _977_Squares_of_a_Sorted_ArrayTest {

    _977_Squares_of_a_Sorted_Array squaresOfASortedArray = new _977_Squares_of_a_Sorted_Array();



    @Test
    public void case1() {
        int[] a = {-4,-1,0,3,10};
        assertEquals("[0, 1, 9, 16, 100]", Arrays.toString(squaresOfASortedArray.sortedSquares(a)));
    }
    @Test
    public void case2() {
        int[] a = {-7,-3,2,3,11};
        assertEquals("[4, 9, 9, 49, 121]", Arrays.toString(squaresOfASortedArray.sortedSquares(a)));
    }
}