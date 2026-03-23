package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1663_Smallest_String_With_A_Given_Numeric_ValueTest {

    private final _1663_Smallest_String_With_A_Given_Numeric_Value smallestStringWithAGivenNumericValue = new _1663_Smallest_String_With_A_Given_Numeric_Value();

    @Test
    public void test01() {

        assertEquals("aay", smallestStringWithAGivenNumericValue.getSmallestString(3, 27));
        assertEquals("aaszz", smallestStringWithAGivenNumericValue.getSmallestString(5, 73));

        assertEquals("z", smallestStringWithAGivenNumericValue.getSmallestString(1, 26));
        assertEquals("a", smallestStringWithAGivenNumericValue.getSmallestString(1, 1));
        assertEquals("aa", smallestStringWithAGivenNumericValue.getSmallestString(2, 2));
        assertEquals("b", smallestStringWithAGivenNumericValue.getSmallestString(1, 2));


    }
}