package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2404_Most_Frequent_Even_ElementTest {


    _2404_Most_Frequent_Even_Element mostFrequentEvenElement = new _2404_Most_Frequent_Even_Element();

    @Test
    public void test01() {

        assertEquals(2, mostFrequentEvenElement.mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1}));
        assertEquals(4, mostFrequentEvenElement.mostFrequentEven(new int[]{4, 4, 4, 9, 2, 4}));
        assertEquals(-1, mostFrequentEvenElement.mostFrequentEven(new int[]{29, 47, 21, 41, 13, 37, 25, 7}));

    }
}