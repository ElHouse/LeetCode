package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1047_Remove_All_Adjacent_Duplicates_In_StringTest {


    private final _1047_Remove_All_Adjacent_Duplicates_In_String removeAllAdjacentDuplicatesInString = new _1047_Remove_All_Adjacent_Duplicates_In_String();


    @Test
    public void test01(){
        assertEquals("ca", removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca"));
    }
    @Test
    public void test02(){
        assertEquals("ay", removeAllAdjacentDuplicatesInString.removeDuplicates("azxxzy"));
    }


    @Test
    public void test03(){
        assertEquals("a", removeAllAdjacentDuplicatesInString.removeDuplicates("aaaaa"));
    }
    @Test
    public void test04(){
        assertEquals("abcdef", removeAllAdjacentDuplicatesInString.removeDuplicates("abcdef"));
    }


    @Test
    public void test05(){
        assertEquals("cac", removeAllAdjacentDuplicatesInString.removeDuplicates("abbacac"));
    }
    @Test
    public void test06(){
        assertEquals("", removeAllAdjacentDuplicatesInString.removeDuplicates("112233"));
    }

}