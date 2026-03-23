package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _692_Top_K_Frequent_WordsTest {


    private final _692_Top_K_Frequent_Words topKFrequentWords = new _692_Top_K_Frequent_Words();

    @Test
    public void test01() {

        assertEquals(List.of("i", "love"), topKFrequentWords.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));

    }

    @Test
    public void test02() {

        assertEquals(List.of("the", "is", "sunny", "day"), topKFrequentWords.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));

    }
}