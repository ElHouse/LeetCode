package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_LengthTest {

    private final _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length maximumNumberOfVowelsInASubstringOfGivenLength = new _1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();

    @Test
    public void test01() {
        assertEquals(3, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("abciiidef", 3));
    }

    @Test
    public void test02() {
        assertEquals(2, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("aeiou", 2));
    }

    @Test
    public void test03() {
        assertEquals(2, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("leetcode", 3));
    }

    @Test
    public void test04() {
        assertEquals(3, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("ltqqqcdaoe", 3));
    }

    @Test
    public void test05() {
        assertEquals(0, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("qwrtyp", 0));
    }

    @Test
    public void test06() {
        assertEquals(5, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("aeiou", 5));
    }

    @Test
    public void test07() {
        assertEquals(4, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels("aeiou", 4));
    }
}