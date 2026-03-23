package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _347_Top_K_Frequent_ElementsTest {


    _347_Top_K_Frequent_Elements topKFrequentElements = new _347_Top_K_Frequent_Elements();

    @Test
    public void test01(){
        assertArrayEquals(new int[]{1,2}, topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(new int[]{1}, 1));
        assertArrayEquals(new int[]{1}, topKFrequentElements.topKFrequent(new int[]{1}, 10));

    }

}