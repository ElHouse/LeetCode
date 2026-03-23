package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _3498_Reverse_Degree_of_a_StringTest {

    private final _3498_Reverse_Degree_of_a_String reverseDegreeOfAString = new _3498_Reverse_Degree_of_a_String();


    @Test
    public void test01() {
        assertEquals(148, reverseDegreeOfAString.reverseDegree("abc"));
        assertEquals(160, reverseDegreeOfAString.reverseDegree("zaza"));
        assertEquals(3276, reverseDegreeOfAString.reverseDegree("abcdefghijklmnopqrstuvwxyz"));

    }
}