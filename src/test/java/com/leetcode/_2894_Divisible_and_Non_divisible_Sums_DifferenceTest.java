package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2894_Divisible_and_Non_divisible_Sums_DifferenceTest {


    _2894_Divisible_and_Non_divisible_Sums_Difference divisibleAndNonDivisibleSumsDifference = new _2894_Divisible_and_Non_divisible_Sums_Difference();


    @Test
    public void test01() {
        assertEquals(19, divisibleAndNonDivisibleSumsDifference.differenceOfSums(10,3));
        assertEquals(15, divisibleAndNonDivisibleSumsDifference.differenceOfSums(5,6));
        assertEquals(-15, divisibleAndNonDivisibleSumsDifference.differenceOfSums(5,1));
        assertEquals(0, divisibleAndNonDivisibleSumsDifference.differenceOfSums(10,0));
        assertEquals(0, divisibleAndNonDivisibleSumsDifference.differenceOfSums(0,0));
    }

}