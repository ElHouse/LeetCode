package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _767_Reorganize_StringTest {


    private final _767_Reorganize_String reorganizeString = new _767_Reorganize_String();


    @Test
    public void test01(){
        assertEquals("aba", reorganizeString.reorganizeString("aab"));
    }
    @Test
    public void test02(){
        assertEquals("", reorganizeString.reorganizeString("aaab"));
    }
    @Test
    public void test03(){
        assertEquals("cbcbcabcabcabcabcdeabc", reorganizeString.reorganizeString("aaaaabbbbbbbccccccccde"));
    }



}