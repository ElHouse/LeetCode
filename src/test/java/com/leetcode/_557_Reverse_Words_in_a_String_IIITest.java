package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _557_Reverse_Words_in_a_String_IIITest {


    _557_Reverse_Words_in_a_String_III reverseWordsInAStringIii = new _557_Reverse_Words_in_a_String_III();


    @Test
    public void case1() {
        String s = "Let's take LeetCode contest";
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWordsInAStringIii.reverseWords(s));
    }

    @Test
    public void case2() {
        String s = null;
        assertEquals("", reverseWordsInAStringIii.reverseWords(s));
    }
}