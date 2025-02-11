package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _459_Repeated_Substring_PatternTest {


    _459_Repeated_Substring_Pattern repeated_substring_pattern = new _459_Repeated_Substring_Pattern();


    @Test
    public void case1() {
        System.out.println("#############-> case 1");
        String s = "abcabcabcabc";
        //          012345678901
        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }

    @Test
    public void case2() {
        System.out.println("#############-> case 2");
        String s = "aba";

        assertFalse(repeated_substring_pattern.repeatedSubstringPattern(s));
    }

    @Test
    public void case3() {
        System.out.println("#############-> case 3");
        String s = "abab";

        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }

    @Test
    public void case4() {
        System.out.println("#############-> case 4");
        String s = "XXRAXXRBXXRAXXRB";
//                  0123456789012345
        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }


    @Test
    public void case5() {
        System.out.println("#############-> case 5");
        String s = "bbabb";
//                  0123456789012345
        assertFalse(repeated_substring_pattern.repeatedSubstringPattern(s));
    }


    @Test
    public void case6() {
        System.out.println("#############-> case 6");
        String s = "aaa";
//                  0123456789012345
        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }


    @Test
    public void case7() {
        System.out.println("#############-> case 7");
        String s = "aaaanaaaan";
//                  0123456789012345
        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }


    @Test
    public void case8() {
        System.out.println("#############-> case 8");
        String s = "a";
//                  0123456789012345
        assertFalse(repeated_substring_pattern.repeatedSubstringPattern(s));
    }

    @Test
    public void case9() {
        System.out.println("#############-> case 9");
        String s = "ab";
//                  0123456789012345
        assertFalse(repeated_substring_pattern.repeatedSubstringPattern(s));
    }


    @Test
    public void case10() {
        System.out.println("#############-> case 10");
        String s = "ababababab";
//		            abababab
//                  0123456789012345
        assertTrue(repeated_substring_pattern.repeatedSubstringPattern(s));
    }
}