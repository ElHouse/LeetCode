package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _844_Backspace_String_CompareTest {

    private final _844_Backspace_String_Compare backspaceStringCompare = new _844_Backspace_String_Compare();


    @Test
    public void test01() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c","ad#c"));
    }
    @Test
    public void test02() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab##","c#d#"));
    }
    @Test
    public void test03() {
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
    }
    @Test
    public void test04() {
        assertTrue(backspaceStringCompare.backspaceCompare("xywrrmp", "xywrrmu#p"));
    }


}