package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _443_String_CompressionTest {

    private final _443_String_Compression stringCompression = new _443_String_Compression();

    @Test
    public void test1() {

        char[] chars = new char[]{'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, stringCompression.compress(chars));
        System.out.println(Arrays.toString(chars));
    }


    @Test
    public void test2() {
        char[] chars = new char[]{'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
        assertEquals(3, stringCompression.compress(chars));
        System.out.println(Arrays.toString(chars));
    }

    @Test
    public void test3() {
        char[] chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c'};
        assertEquals(4, stringCompression.compress(chars));
        System.out.println(Arrays.toString(chars));
    }

    @Test
    public void test4() {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        assertEquals(10, stringCompression.compress(chars));
        System.out.println(Arrays.toString(chars));
    }


}