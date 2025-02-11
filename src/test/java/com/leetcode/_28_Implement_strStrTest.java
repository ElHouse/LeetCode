package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _28_Implement_strStrTest {


    _28_Implement_strStr implementStrStrTest = new _28_Implement_strStr();

    @Test
    public void case1() {
//		                   01234
        String haystack = "hello";
        String needle   = "ll";
//		                   01

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }

    @Test
    public void case2() {

        String haystack = "aaaaa";
        String needle   = "bba";

        assertEquals(-1, implementStrStrTest.strStr(haystack, needle));
    }

    @Test
    public void case3() {

        String haystack = "hello";
        String needle   = "";

        assertEquals(0, implementStrStrTest.strStr(haystack, needle));
    }


    @Test
    public void case4() {

        String haystack = "heaaaaallbbbbbo";
        String needle   = "llbbb";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }


    @Test
    public void case5() {

        String haystack = "aaaabbc";
        String needle   = "bba";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }


    @Test
    public void case6() {

        String haystack = "microsfot";
        String needle   = "micro";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }


    @Test
    public void case7() {

        String haystack = "aaaaaaaaaaac";
        String needle   = "c";

        assertEquals(haystack.indexOf(needle),implementStrStrTest. strStr(haystack, needle));
    }

    @Test
    public void case8() {

        String haystack = "a";
        String needle   = "a";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }



    @Test
    public void case9() {

        String haystack = "";
        String needle   = "";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }

    @Test
    public void case10() {

        String haystack = "";
        String needle   = "a";

        assertEquals(haystack.indexOf(needle), implementStrStrTest.strStr(haystack, needle));
    }
}