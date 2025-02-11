package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _728_Self_Dividing_NumbersTest {
    _728_Self_Dividing_Numbers selfDividingNumbers = new _728_Self_Dividing_Numbers();

    @Test
    public void case1() {
        assertEquals(13, selfDividingNumbers.selfDividingNumbers(1, 22).size());
    }
}