package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _520_Detect_CapitalTest {

    _520_Detect_Capital detectCapital = new _520_Detect_Capital();

    @Test
    public void case1() {

        String word = "USA";
        assertTrue(detectCapital.detectCapitalUse(word));

    }


    @Test
    public void case2() {

        String word = "FlaG";
        assertFalse(detectCapital.detectCapitalUse(word));

    }


    @Test
    public void case3() {

        String word = "g";
        assertTrue(detectCapital.detectCapitalUse(word));

    }
}