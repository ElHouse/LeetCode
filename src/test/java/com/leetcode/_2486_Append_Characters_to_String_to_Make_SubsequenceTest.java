package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2486_Append_Characters_to_String_to_Make_SubsequenceTest {


    private final _2486_Append_Characters_to_String_to_Make_Subsequence appendCharactersToStringToMakeSubsequence = new _2486_Append_Characters_to_String_to_Make_Subsequence();


    @Test
    public void test01() {

        assertEquals(4, appendCharactersToStringToMakeSubsequence.appendCharacters("coaching","coding"));
        assertEquals(0, appendCharactersToStringToMakeSubsequence.appendCharacters("abcde","a"));
        assertEquals(5, appendCharactersToStringToMakeSubsequence.appendCharacters("z","abcde"));
        assertEquals(2, appendCharactersToStringToMakeSubsequence.appendCharacters("aa","bb"));

    }


}