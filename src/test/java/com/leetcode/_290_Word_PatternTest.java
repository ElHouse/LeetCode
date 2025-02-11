package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _290_Word_PatternTest {


   private final  _290_Word_Pattern nWordPattern = new _290_Word_Pattern();

    @Test
    public void case1() {
        String pattern = "abba";
        String str     = "dog cat cat dog";

        assertTrue(nWordPattern.wordPattern(pattern, str));

    }

    @Test
    public void case2() {
        String pattern = "abba";
        String str     = "dog cat cat fish";

        assertFalse(nWordPattern.wordPattern(pattern, str));

    }



    @Test
    public void case3() {
        String pattern = "aaaa";
        String str     = "dog cat cat dog";

        assertFalse(nWordPattern.wordPattern(pattern, str));

    }



    @Test
    public void case4() {
        String pattern = "abba";
        String str     = "dog dog dog dog";

        assertFalse(nWordPattern.wordPattern(pattern, str));

    }


    @Test
    public void case5() {
        String pattern = "abc";
        String str     = "b c a";

        assertTrue(nWordPattern.wordPattern(pattern, str));

    }

}