package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _394_Decode_StringTest {

    private final _394_Decode_String decode_string = new _394_Decode_String();


    @Test
    public void case1() {
        // 01234567
        String s = "3[a2[c]]";
        assertEquals("accaccacc", decode_string.decodeString(s));
    }


    @Test
    public void case2() {

        String s = "3[a]2[bc]";
        assertEquals("aaabcbc", decode_string.decodeString(s));
    }


    @Test
    public void case3() {

        String s = "2[abc]3[cd]ef";
        assertEquals("abcabccdcdcdef", decode_string.decodeString(s));
    }

    @Test
    public void case4() {
        String s = "10[leetcode]";

        assertEquals("leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode", decode_string.decodeString(s));
    }
}