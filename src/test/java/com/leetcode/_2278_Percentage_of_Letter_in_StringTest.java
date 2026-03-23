package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2278_Percentage_of_Letter_in_StringTest {


    _2278_Percentage_of_Letter_in_String percentageOfLetterInString = new _2278_Percentage_of_Letter_in_String();

    @Test
    public void test01(){
        assertEquals(33, percentageOfLetterInString.percentageLetter("foobar", 'o'));
        assertEquals(0, percentageOfLetterInString.percentageLetter("jjjj", 'k'));
        assertEquals(25, percentageOfLetterInString.percentageLetter("foobaraa", 'o'));
    }
}