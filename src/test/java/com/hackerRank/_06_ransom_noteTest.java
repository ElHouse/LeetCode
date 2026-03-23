package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _06_ransom_noteTest {


    _06_ransom_note ransomNote = new _06_ransom_note();


    @Test
    public void test01() {


        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");

        ransomNote.checkMagazine(magazine, note);
    }
    @Test
    public void test02() {


        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        ransomNote.checkMagazine(magazine, note);
    }
    @Test
    public void test03() {


        List<String> magazine = Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = Arrays.asList("ive", "got", "some", "coconuts");
        ransomNote.checkMagazine(magazine, note);
    }

}