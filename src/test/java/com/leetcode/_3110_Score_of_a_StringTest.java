package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3110_Score_of_a_StringTest {

    _3110_Score_of_a_String scoreOfAString = new _3110_Score_of_a_String();


    @Test
    public void test01(){

        assertEquals(13, scoreOfAString.scoreOfString("hello"));
        assertEquals(50, scoreOfAString.scoreOfString("zaz"));
    }

}