package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _784_Letter_Case_PermutationTest {

    _784_Letter_Case_Permutation letterCasePermutation = new _784_Letter_Case_Permutation();

    @Test
    public void case1() {
        String s = "a1b2";
        assertEquals(4, letterCasePermutation.letterCasePermutation(s).size());
    }

    @Test
    public void case2() {
        String s = "3z4";
        assertEquals(2, letterCasePermutation.letterCasePermutation(s).size());
    }

    @Test
    public void case3() {
        String s = "1234";
        assertEquals(1, letterCasePermutation.letterCasePermutation(s).size());
    }

    @Test
    public void case4() {
        String s = "qwsderfgtyhj";
        assertEquals(4096, letterCasePermutation.letterCasePermutation(s).size());
    }

}