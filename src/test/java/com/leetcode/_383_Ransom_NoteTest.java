package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _383_Ransom_NoteTest {


    _383_Ransom_Note ransomNote = new _383_Ransom_Note();


    @Test
    public void case1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void case2() {
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void case3() {
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}