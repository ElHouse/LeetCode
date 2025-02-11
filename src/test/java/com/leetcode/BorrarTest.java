package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorrarTest {

    private final Borrar borrar = new Borrar();

    @Test
    public void test01() {
        assertEquals(3, borrar.process("abcabcbb"));
    }


    @Test
    public void test02() {
        assertEquals(1, borrar.process("bbbbb"));
    }


    @Test
    public void test03() {
        assertEquals(3, borrar.process("pwwkew"));
    }
}