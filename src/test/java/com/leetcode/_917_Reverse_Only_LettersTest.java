package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _917_Reverse_Only_LettersTest {


    private final _917_Reverse_Only_Letters reverseOnlyLetters = new _917_Reverse_Only_Letters();


    @Test
    public void test01() {
        assertEquals("dc-ba", reverseOnlyLetters.reverseOnlyLetters("ab-cd"));
    }

    @Test
    public void test02() {
        assertEquals("a----", reverseOnlyLetters.reverseOnlyLetters("a----"));
    }

    @Test
    public void test03() {
        assertEquals("a-bC-dEf-ghIj", reverseOnlyLetters.reverseOnlyLetters("j-Ih-gfE-dCba"));
    }

    @Test
    public void test04() {
        assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }


    @Test
    public void test05() {
        assertEquals("----a", reverseOnlyLetters.reverseOnlyLetters("----a"));
    }

    @Test
    public void test06() {
        assertEquals("--b-a--", reverseOnlyLetters.reverseOnlyLetters("--a-b--"));
    }

    @Test
    public void test07() {
        assertEquals("a", reverseOnlyLetters.reverseOnlyLetters("a"));
    }

    @Test
    public void test08() {
        assertEquals("-", reverseOnlyLetters.reverseOnlyLetters("-"));
    }

    @Test
    public void test09() {
        assertEquals("7_28]", reverseOnlyLetters.reverseOnlyLetters("7_28]"));
    }



}