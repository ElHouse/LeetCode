package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1544_Make_The_String_GreatTest {


    private final _1544_Make_The_String_Great makeTheStringGreat = new _1544_Make_The_String_Great();

    @Test
    public void test01(){

        assertEquals("leetcode", makeTheStringGreat.makeGood("leEeetcode"));

    }

    @Test
    public void test02(){

        assertEquals("", makeTheStringGreat.makeGood("abBAcC"));

    }
    @Test
    public void test03(){

        assertEquals("s", makeTheStringGreat.makeGood("s"));

    }

    @Test
    public void test04(){

        assertEquals("", makeTheStringGreat.makeGood("sS"));

    }

    @Test
    public void test05(){

        assertEquals("s", makeTheStringGreat.makeGood("sSs"));

    }
}