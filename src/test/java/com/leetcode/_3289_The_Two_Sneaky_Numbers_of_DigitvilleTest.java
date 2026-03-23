package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3289_The_Two_Sneaky_Numbers_of_DigitvilleTest {

    _3289_The_Two_Sneaky_Numbers_of_Digitville theTwoSneakyNumbersOfDigitville = new _3289_The_Two_Sneaky_Numbers_of_Digitville();


    @Test
    public void test01() {

        assertArrayEquals(new int[]{0, 1}, theTwoSneakyNumbersOfDigitville.getSneakyNumbers(new int[]{0, 1, 1, 0}));
        assertArrayEquals(new int[]{2, 3}, theTwoSneakyNumbersOfDigitville.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2}));
        assertArrayEquals(new int[]{4, 5}, theTwoSneakyNumbersOfDigitville.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}));

    }


}