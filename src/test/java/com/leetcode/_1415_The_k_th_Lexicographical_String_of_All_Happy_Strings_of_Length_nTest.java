package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_nTest {


    private final _1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n theKThLexicographicalStringOfAllHappyStringsOfLengthN = new _1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n();


    @Test
    public void test01(){
        assertEquals("c", theKThLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(1,3));
    }
    @Test
    public void test02(){
        assertEquals("", theKThLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(1,4));
    }
    @Test
    public void test03(){
        assertEquals("cab", theKThLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(3,9));
    }


    @Test
    public void test04(){
        assertEquals("abababacab", theKThLexicographicalStringOfAllHappyStringsOfLengthN.getHappyString(10,5));
    }

}