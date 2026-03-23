package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _16_alternating_charactersTest {


    _16_alternating_characters alternatingCharacters = new _16_alternating_characters();


    @Test
    public void test01() {
        assertEquals(3, alternatingCharacters.alternatingCharacters("AAAA"));
        assertEquals(4, alternatingCharacters.alternatingCharacters("BBBBB"));
        assertEquals(0, alternatingCharacters.alternatingCharacters("ABABABAB"));
        assertEquals(0, alternatingCharacters.alternatingCharacters("BABABA"));
        assertEquals(4, alternatingCharacters.alternatingCharacters("AAABBB"));
        assertEquals(1, alternatingCharacters.alternatingCharacters("ABAA"));
        assertEquals(0, alternatingCharacters.alternatingCharacters("ABABA"));
    }
}