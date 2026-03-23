package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2000_Reverse_Prefix_of_WordTest {


    private final _2000_Reverse_Prefix_of_Word reversePrefixOfWord= new _2000_Reverse_Prefix_of_Word();


    @Test
    public void test01(){
        assertEquals("dcbaefd", reversePrefixOfWord.reversePrefix("abcdefd", 'd'));
    }


    @Test
    public void test02(){
        assertEquals("zxyxxe", reversePrefixOfWord.reversePrefix("xyxzxe", 'z'));
    }


    @Test
    public void test03(){
        assertEquals("abcd", reversePrefixOfWord.reversePrefix("abcd", 'z'));
    }

    @Test
    public void test04(){
        assertEquals("feewlee", reversePrefixOfWord.reversePrefix("lweefee", 'f'));
    }

    @Test
    public void test05(){
        //                    "shvdqeiygbnolmapfjcxtkuwzr
        assertEquals("shvdqeiygbnolmapfjcxtkuwzr", reversePrefixOfWord.reversePrefix("rzwuktxcjfpamlonbgyieqdvhs", 's'));
    }
}