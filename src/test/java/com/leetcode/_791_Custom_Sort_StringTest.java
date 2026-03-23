package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _791_Custom_Sort_StringTest {

    private final _791_Custom_Sort_String customSortString = new _791_Custom_Sort_String();


    @Test
    public void test01() {
        assertEquals("cbad", customSortString.customSortString("cba", "abcd"));
    }

    @Test
    public void test02() {
        assertEquals("bcad", customSortString.customSortString("bcafg", "abcd"));
    }

    @Test
    public void test03() {
        assertEquals("hhhhhuucccwaaaaaaaaabbdddddeffffggggiijjjjkkkkllllmmmmnnnoooopppqqqqqqqqqqqrsssttttttttvxxxxxyyzzzzz",
                customSortString.customSortString("hucw",
                        "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh"));
    }

}