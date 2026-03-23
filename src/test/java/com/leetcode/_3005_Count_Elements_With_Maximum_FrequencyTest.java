package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3005_Count_Elements_With_Maximum_FrequencyTest {


    private final _3005_Count_Elements_With_Maximum_Frequency countElementsWithMaximumFrequency = new _3005_Count_Elements_With_Maximum_Frequency();

    @Test
    public void test01(){
        assertEquals(4, countElementsWithMaximumFrequency.maxFrequencyElements(new int[]{1,2,2,3,1,4}));
    }
    @Test
    public void test02(){
        assertEquals(5, countElementsWithMaximumFrequency.maxFrequencyElements(new int[]{1,2,3,4,5}));
    }
}