package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void case3() {
        String s = "Mr Ding";
        assertEquals("rM gniD", reverseWordsInAStringIii.reverseWords(s));
    }


    @Test
    public void case4() {
        String s = "MrDing";
        assertEquals("gniDrM", reverseWordsInAStringIii.reverseWords(s));
    }

}