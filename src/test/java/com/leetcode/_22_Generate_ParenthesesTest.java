package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _22_Generate_ParenthesesTest {

    _22_Generate_Parentheses generateParentheses = new _22_Generate_Parentheses();


    @Test
    public void test01() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"),
                generateParentheses.generateParenthesis(3));
    }


    @Test
    public void test09() {


        List<String> expected = List.of(

                "((((()))))",
                "(((()())))",
                "(((())()))",
                "(((()))())",
                "(((())))()",
                "((()(())))",
                "((()()()))",
                "((()())())",
                "((()()))()",
                "((())(()))",
                "((())()())",
                "((())())()",
                "((()))(())",
                "((()))()()",
                "(()((())))",
                "(()(()()))",
                "(()(())())",
                "(()(()))()",
                "(()()(()))",
                "(()()()())",
                "(()()())()",
                "(()())(())",
                "(()())()()",
                "(())((()))",
                "(())(()())",
                "(())(())()",
                "(())()(())",
                "(())()()()",
                "()(((())))",
                "()((()()))",
                "()((())())",
                "()((()))()",
                "()(()(()))",
                "()(()()())",
                "()(()())()",
                "()(())(())",
                "()(())()()",
                "()()((()))",
                "()()(()())",
                "()()(())()",
                "()()()(())",
                "()()()()()"
        );

        expected = new ArrayList<>(expected);

        var result = generateParentheses.generateParenthesis(5);

        Collections.sort(expected);
        Collections.sort(result);

        assertEquals(expected, result);
    }



}

