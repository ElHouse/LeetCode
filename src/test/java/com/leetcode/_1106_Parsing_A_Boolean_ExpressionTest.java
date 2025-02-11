package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _1106_Parsing_A_Boolean_ExpressionTest {


    private final _1106_Parsing_A_Boolean_Expression parsingABooleanExpression = new _1106_Parsing_A_Boolean_Expression();

    @Test
    public void case1() {
        String a = "!(f)";
        assertTrue(parsingABooleanExpression.parseBoolExpr(a));
    }

    @Test
    public void case2() {
        String a = "|(f,t)";
        assertTrue(parsingABooleanExpression.parseBoolExpr(a));
    }

    @Test
    public void case3() {
        String a = "&(t,f)";
        assertFalse(parsingABooleanExpression.parseBoolExpr(a));
    }

    @Test
    public void case4() {
        String a = "|(&(t,f,t),!(t))";
        assertFalse(parsingABooleanExpression.parseBoolExpr(a));
    }

    @Test
    public void case5() {
        String a = "|(f,&(t,t))";
        assertTrue(parsingABooleanExpression.parseBoolExpr(a));
    }

    @Test
    public void case6() {
        String a = "!(&(!(&(f)),&(t),|(f,f,t)))";
        assertFalse(parsingABooleanExpression.parseBoolExpr(a));
    }
}