package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1249_Minimum_Remove_to_Make_Valid_ParenthesesTest {
    private final _1249_Minimum_Remove_to_Make_Valid_Parentheses minimumRemoveToMakeValidParentheses = new _1249_Minimum_Remove_to_Make_Valid_Parentheses();

    @Test
    public void case1() {
        String s = "lee(t(c)o)de)";
        assertEquals("lee(t(c)o)de", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s));
    }

    @Test
    public void case2() {
        String s = "a)b(c)d";
        assertEquals("ab(c)d", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s));
    }

    @Test
    public void case3() {
        String s = "))((";
        assertEquals("", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s));
    }

    @Test
    public void case4() {
        String s = "(a(b(c)d)";
        assertEquals("(a(bc)d)", minimumRemoveToMakeValidParentheses.minRemoveToMakeValid(s));
    }


}