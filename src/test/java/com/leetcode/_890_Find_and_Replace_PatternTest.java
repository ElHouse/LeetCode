package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _890_Find_and_Replace_PatternTest {

    _890_Find_and_Replace_Pattern findAndReplacePattern = new _890_Find_and_Replace_Pattern();

    @Test
    public void case1() {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc", "baa"};
        String pattern = "abb";
        assertEquals("[mee, aqq, baa]", findAndReplacePattern.findAndReplacePattern(words, pattern).toString());
    }

    @Test
    public void case2() {
        String[] words = {"ef", "fq", "ao", "at", "lx"};
        String pattern = "ya";
        //["ef","fq","ao","at","lx"]
        //["ef","fq","          lx"]
        assertEquals("[ef, fq, ao, at, lx]", findAndReplacePattern.findAndReplacePattern(words, pattern).toString());
    }

}