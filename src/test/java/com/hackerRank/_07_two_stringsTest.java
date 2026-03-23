package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _07_two_stringsTest {


    _07_two_strings twoStrings = new _07_two_strings();


    @Test
    public void test01(){
        assertEquals("YES", twoStrings.twoStrings("and","cat"));
        assertEquals("NO", twoStrings.twoStrings("be","cat"));
        assertEquals("YES", twoStrings.twoStrings("hello","world"));
        assertEquals("NO", twoStrings.twoStrings("hi","world"));
    }

}