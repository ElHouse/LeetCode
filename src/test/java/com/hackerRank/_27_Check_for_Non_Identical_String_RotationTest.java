package com.hackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _27_Check_for_Non_Identical_String_RotationTest {

    _27_Check_for_Non_Identical_String_Rotation checkForNonIdenticalStringRotation = new _27_Check_for_Non_Identical_String_Rotation();

    @Test
    void isNonTrivialRotation() {
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcde", "cdeab"));
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("a", "a"));
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("a", "b"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("dcccddc", "ddcdccc"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefg", "gabcdef"));
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefgt", "gabcdefe"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("xxcx", "xcxx"));

        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefg", "fgabcde"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("rotation", "tionrota"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("xyzabc", "abcxyz"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("helloWorld", "Worldhello"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("123456", "456123"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("aab", "aba"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("looping", "ingloop"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefgt", "tabcdefg"));
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefgt", "gtabcdef"));

        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcdefg", "abcdefg")); // iguales
        assertTrue(checkForNonIdenticalStringRotation.isNonTrivialRotation("abc", "cab"));         // no es rotación válida
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("abc", "acb"));         // permutación
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("a", "a"));             // trivial
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("abcde", "abcd"));      // distinta longitud
        assertFalse(checkForNonIdenticalStringRotation.isNonTrivialRotation("rotation", "rotation")); // iguales


    }
}