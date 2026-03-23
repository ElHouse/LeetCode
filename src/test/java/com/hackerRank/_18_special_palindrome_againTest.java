package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _18_special_palindrome_againTest {

    _18_special_palindrome_again specialPalindromeAgain = new _18_special_palindrome_again();


    @Test
    public void test01(){

        assertEquals(12, specialPalindromeAgain.substrCount(7, "mnonopoo"));
        assertEquals(10, specialPalindromeAgain.substrCount(4, "aaaa"));

        assertEquals(7, specialPalindromeAgain.substrCount(5, "asasd"));

        assertEquals(10, specialPalindromeAgain.substrCount(7, "abcbaba"));

    }

}