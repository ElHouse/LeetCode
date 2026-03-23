package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _08_sherlock_and_anagramsTest {
    _08_sherlock_and_anagrams sherlockAndAnagrams = new _08_sherlock_and_anagrams();


    @Test
    public void test01(){

        assertEquals(3, sherlockAndAnagrams.sherlockAndAnagrams("ifailuhkqq"));
        assertEquals(10, sherlockAndAnagrams.sherlockAndAnagrams("kkkk"));
        assertEquals(5, sherlockAndAnagrams.sherlockAndAnagrams("cdcd"));
        assertEquals(2, sherlockAndAnagrams.sherlockAndAnagrams("mom"));
        assertEquals(4, sherlockAndAnagrams.sherlockAndAnagrams("abba"));
        assertEquals(0, sherlockAndAnagrams.sherlockAndAnagrams("abcd"));
    }

}