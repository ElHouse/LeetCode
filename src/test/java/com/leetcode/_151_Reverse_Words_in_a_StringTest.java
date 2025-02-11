package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _151_Reverse_Words_in_a_StringTest {

    private final _151_Reverse_Words_in_a_String reverseWordsInAString = new _151_Reverse_Words_in_a_String();

    @Test
    public void case1() {

        String a = "the sky is blue";
        assertTrue("blue is sky the".equals(reverseWordsInAString.reverseWords(a)));
    }


    @Test
    public void case2() {

        String a = "  hello world!  ";
        assertEquals("world! hello", (reverseWordsInAString.reverseWords(a)));
    }


    @Test
    public void case3() {

        String a = "a good   example";
        assertEquals("example good a", (reverseWordsInAString.reverseWords(a)));
    }
}