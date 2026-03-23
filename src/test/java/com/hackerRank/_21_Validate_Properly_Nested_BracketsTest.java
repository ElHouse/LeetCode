package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _21_Validate_Properly_Nested_BracketsTest {
    _21_Validate_Properly_Nested_Brackets validateProperlyNestedBrackets  = new _21_Validate_Properly_Nested_Brackets();


    @Test
    public void test01(){
        assertTrue(validateProperlyNestedBrackets.areBracketsProperlyMatched("() {} []"));
        assertTrue(validateProperlyNestedBrackets.areBracketsProperlyMatched("42"));
        assertFalse(validateProperlyNestedBrackets.areBracketsProperlyMatched("(((((((())))))"));
        assertFalse(validateProperlyNestedBrackets.areBracketsProperlyMatched("(((((((("));

    }
}