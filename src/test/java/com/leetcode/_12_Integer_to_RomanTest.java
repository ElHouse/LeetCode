package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _12_Integer_to_RomanTest {


    private final _12_Integer_to_Roman integerToRoman = new _12_Integer_to_Roman();

    @Test
    public void test1() {
        assertEquals("MMMDCCXLIX", integerToRoman.intToRoman(3749));
        assertEquals("LVIII", integerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
        assertEquals("X", integerToRoman.intToRoman(10));

    }


}