package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _567_Permutation_in_StringTest {

    private final _567_Permutation_in_String permutationInString = new _567_Permutation_in_String();

    @Test
    public void test00(){
        assertTrue(permutationInString.checkInclusion("ab","ab"));
    }
    @Test
    public void test01(){
        assertTrue(permutationInString.checkInclusion("ab","eidbaooo"));
    }
    @Test
    public void test02(){
        assertFalse(permutationInString.checkInclusion("ab","eidboaoo"));
    }
    @Test
    public void test03(){
        assertTrue(permutationInString.checkInclusion("ooabal","oeobaola"));
    }
    @Test
    public void test04(){
        assertTrue(permutationInString.checkInclusion("ooabal","oeobaolxmmsasdobaolhobaola"));
    }

    @Test
    public void test05(){
        assertTrue(permutationInString.checkInclusion("adc","dcda"));
    }

    @Test
    public void test06(){
        assertFalse(permutationInString.checkInclusion("dinitrophenylhydrazine","acetylphenylhydrazine"));
    }



}