package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _537_Complex_Number_MultiplicationTest {

    _537_Complex_Number_Multiplication complexNumberMultiplication = new _537_Complex_Number_Multiplication();

    @Test
    public void case1() {

        String a = "1+1i";
        String b = "1+1i";

        assertEquals("0+2i", complexNumberMultiplication.complexNumberMultiply(a, b));
    }

    @Test
    public void case2() {

        String a = "1+-1i";
        String b = "1+-1i";

        assertEquals("0+-2i", complexNumberMultiplication.complexNumberMultiply(a, b));
    }


    @Test
    public void case3() {

        String a = "-100+-100i";
        String b = "-100+-100i";

        assertEquals("0+20000i", complexNumberMultiplication.complexNumberMultiply(a, b));
    }
}