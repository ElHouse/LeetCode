package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _150_Evaluate_Reverse_Polish_NotationTest {

    private final _150_Evaluate_Reverse_Polish_Notation evaluateReversePolishNotation = new _150_Evaluate_Reverse_Polish_Notation();

    @Test
    public void case1() {

        String[] tokens = {"2", "1", "+", "3", "*"};

        assertEquals(9, evaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    public void case2() {

        String[] tokens = {"4", "13", "5", "/", "+"};

        assertEquals(6, evaluateReversePolishNotation.evalRPN(tokens));
    }

    @Test
    public void case3() {

        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        assertEquals(22, evaluateReversePolishNotation.evalRPN(tokens));
    }
}