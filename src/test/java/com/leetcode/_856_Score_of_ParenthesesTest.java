package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _856_Score_of_ParenthesesTest {

    _856_Score_of_Parentheses score_of_parentheses = new _856_Score_of_Parentheses();

    @Test
    public void case1() {

        String S = "()";
        assertEquals(1, score_of_parentheses.scoreOfParentheses(S));
    }

    @Test
    public void case2() {

        String S = "()()";
        assertEquals(2, score_of_parentheses.scoreOfParentheses(S));
    }

    @Test
    public void case3() {

        String S = "(())";
        assertEquals(2, score_of_parentheses.scoreOfParentheses(S));
    }

    @Test
    public void case4() {
        String S = "(()(()))";
        assertEquals(6, score_of_parentheses.scoreOfParentheses(S));
    }

    @Test
    public void case5() {
        String S = "(((((((())))))))";
        assertEquals(128, score_of_parentheses.scoreOfParentheses(S));
    }

}