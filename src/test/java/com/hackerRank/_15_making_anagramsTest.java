package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _15_making_anagramsTest {
    _15_making_anagrams makingAnagrams = new _15_making_anagrams();

    @Test
    public void test01(){
        assertEquals(2, makingAnagrams.makeAnagram("cde", "dcf"));
        assertEquals(4, makingAnagrams.makeAnagram("cde", "abc"));
        assertEquals(0, makingAnagrams.makeAnagram("aaaaaaaaa", "aaaaaaaaa"));
        assertEquals(15, makingAnagrams.makeAnagram("aaaaaaaaab", "bbbbbbbba"));
    }
}