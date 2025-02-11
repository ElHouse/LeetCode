package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1768_Merge_Strings_AlternatelyTest {

    private final _1768_Merge_Strings_Alternately mergeStringsAlternately = new _1768_Merge_Strings_Alternately();


    @Test
    public void test(){

        assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", mergeStringsAlternately.mergeAlternately("abcd", "pq"));
        assertEquals("albmcodpeqfrgshtivjxkwyz", mergeStringsAlternately.mergeAlternately("abcdefghijk", "lmopqrstvxwyz"));

    }



}