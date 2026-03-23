package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _451_Sort_Characters_By_FrequencyTest {


    private final _451_Sort_Characters_By_Frequency sortCharactersByFrequency = new _451_Sort_Characters_By_Frequency();

    @Test
    public void test01(){
        assertEquals("eert", sortCharactersByFrequency.frequencySort("tree"));
    }

    @Test
    public void test02(){
        assertEquals("aaaccc", sortCharactersByFrequency.frequencySort("cccaaa"));
    }

    @Test
    public void test03(){
        assertEquals("bbAa", sortCharactersByFrequency.frequencySort("Aabb"));
    }

}