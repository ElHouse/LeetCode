package com.leetcode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _1170_Compare_Strings_by_Frequency_of_the_Smallest_CharacterTest {

    private final _1170_Compare_Strings_by_Frequency_of_the_Smallest_Character compareStringsByFrequencyOfTheSmallestCharacter = new _1170_Compare_Strings_by_Frequency_of_the_Smallest_Character();


    @Test
    public void case1() {
        String[] queries = {"cbd"};
        String[] words = {"zaaaz"};

        assertEquals("[1]", Arrays.toString(compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words)));
    }


    @Test
    public void case2() {
        String[] queries = {"bbb", "cc"};
        String[] words = {"a", "aa", "aaa", "aaaa"};

        assertEquals("[1, 2]", Arrays.toString(compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words)));
    }

    @Test
    public void case3() {
        String[] queries = {"bba", "abaaaaaa", "aaaaaa", "bbabbabaab", "aba", "aa", "baab", "bbbbbb", "aab", "bbabbaabb"};
        String[] words = {"aaabbb", "aab", "babbab", "babbbb", "b", "bbbbbbbbab", "a", "bbbbbbbbbb", "baaabbaab", "aa"};

        assertEquals("[6, 1, 1, 2, 3, 3, 3, 1, 3, 2]", Arrays.toString(compareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, words)));
    }

}