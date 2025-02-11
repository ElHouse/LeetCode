package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1221_Split_a_String_in_Balanced_StringsTest {

    private final _1221_Split_a_String_in_Balanced_Strings splitAStringInBalancedStrings = new _1221_Split_a_String_in_Balanced_Strings();

    @Test
    public void case1() {
        String s = "RLRRLLRLRL";
        assertEquals(4, splitAStringInBalancedStrings.balancedStringSplit(s));
    }

    @Test
    public void case2() {
        String s = "RLLLLRRRLR";
        assertEquals(3, splitAStringInBalancedStrings.balancedStringSplit(s));
    }

    @Test
    public void case3() {
        String s = "LLLLRRRR";
        assertEquals(1, splitAStringInBalancedStrings.balancedStringSplit(s));
    }

    @Test
    public void case4() {
        String s = "RLRRRLLRLL";
        assertEquals(2, splitAStringInBalancedStrings.balancedStringSplit(s));
    }

}