package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _41_Check_Valid_AnagramTest {
    _41_Check_Valid_Anagram checkValidAnagram = new _41_Check_Valid_Anagram();

    @Test
    public void test01(){
        assertEquals(1, checkValidAnagram.isAnagram("listen","silent"));
        assertEquals(0, checkValidAnagram.isAnagram("hello","bellow"));
        assertEquals(0, checkValidAnagram.isAnagram("aa","bb"));
        assertEquals(1, checkValidAnagram.isAnagram("a","a"));
        assertEquals(1, checkValidAnagram.isAnagram("ab","ba"));
        assertEquals(0, checkValidAnagram.isAnagram("listenn","silentt"));
        assertEquals(1, checkValidAnagram.isAnagram("",""));
        assertEquals(0, checkValidAnagram.isAnagram("a",""));

    }
}