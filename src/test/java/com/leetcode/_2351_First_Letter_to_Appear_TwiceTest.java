package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2351_First_Letter_to_Appear_TwiceTest {

    _2351_First_Letter_to_Appear_Twice firstLetterToAppearTwice = new _2351_First_Letter_to_Appear_Twice();


    @Test
    public void test01(){
        assertEquals('c',  firstLetterToAppearTwice.repeatedCharacter("abccbaacz"));
        assertEquals('d',  firstLetterToAppearTwice.repeatedCharacter("abcdd"));
    }

}