package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class _17_sherlock_and_valid_stringTest {

    _17_sherlock_and_valid_string sherlockAndValidString = new _17_sherlock_and_valid_string();


    @Test
    public void test01() {
        assertEquals("NO", sherlockAndValidString.isValid("aabbcd"));
        assertEquals("NO", sherlockAndValidString.isValid("aabbccddeefghi"));
        assertEquals("YES", sherlockAndValidString.isValid("abcdefghhgfedecba"));
        assertEquals("NO", sherlockAndValidString.isValid("aaaabbcc"));
        assertEquals("NO", sherlockAndValidString.isValid("aabbcd"));
        assertEquals("NO", sherlockAndValidString.isValid("aabbcd"));
    }

    @Test
    public void test02() throws IOException {

        String rutaArchivo = "src/test/java/com/hackerRank/resources/_17_01.txt";
        String linea;

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {

            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();
                assertEquals("YES", sherlockAndValidString.isValid(linea));
            }
        }
    }


    @Test
    public void test03() throws IOException {

        String rutaArchivo = "src/test/java/com/hackerRank/resources/_17_02.txt";
        String linea;

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {

            while ((linea = reader.readLine()) != null) {
                linea = linea.trim();
                assertEquals("YES", sherlockAndValidString.isValid(linea));
            }
        }
    }

}