package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2434_Using_a_Robot_to_Print_the_Lexicographically_Smallest_StringTest {

    _2434_Using_a_Robot_to_Print_the_Lexicographically_Smallest_String usingARobotToPrintTheLexicographicallySmallestString = new _2434_Using_a_Robot_to_Print_the_Lexicographically_Smallest_String();

    @Test
    public void test01() {
            assertEquals(  "azz",
                    usingARobotToPrintTheLexicographicallySmallestString.robotWithString("zza"));
    }

    @Test
    public void test02() {
        assertEquals(  "abc",
                usingARobotToPrintTheLexicographicallySmallestString.robotWithString("bac"));
    }

    @Test
    public void test03() {
        assertEquals(  "addb",
                usingARobotToPrintTheLexicographicallySmallestString.robotWithString("bdda"));
    }
    @Test
    public void test04() {
        assertEquals(  "bdevfziy",
                usingARobotToPrintTheLexicographicallySmallestString.robotWithString("bydizfve"));
    }

    @Test
    public void test05() {
        assertEquals(  "fnohopzv",
                usingARobotToPrintTheLexicographicallySmallestString.robotWithString("vzhofnpo"));
    }
}