package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _205_Isomorphic_StringsTest {

    private final _205_Isomorphic_Strings isomorphicStrings = new _205_Isomorphic_Strings();


    @Test
    public void case1() {
        String s = "egg";
        String t = "add";

        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }


    @Test
    public void case2() {
        String s = "foo";
        String t = "bar";

        assertFalse(isomorphicStrings.isIsomorphic(s, t));
    }


    @Test
    public void case3() {
        String s = "paper";
        String t = "title";

        assertTrue(isomorphicStrings.isIsomorphic(s, t));
    }

    @Test
    public void case4() {
        String s = "ab";
        String t = "aa";

        assertFalse(isomorphicStrings.isIsomorphic(s, t));
    }
}