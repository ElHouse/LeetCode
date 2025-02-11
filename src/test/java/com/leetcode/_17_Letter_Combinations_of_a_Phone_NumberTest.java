package com.leetcode;

import com.leetcode._17_Letter_Combinations_of_a_Phone_Number;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _17_Letter_Combinations_of_a_Phone_NumberTest {

    private _17_Letter_Combinations_of_a_Phone_Number letterCombinationsOfAPhoneNumber = new _17_Letter_Combinations_of_a_Phone_Number();


    @Test
    public void test1() {

        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        assertEquals(expected, letterCombinationsOfAPhoneNumber.letterCombinations("23"));
        assertEquals(Collections.emptyList(), letterCombinationsOfAPhoneNumber.letterCombinations(""));
        assertEquals(Collections.emptyList(), letterCombinationsOfAPhoneNumber.letterCombinations(null));


        expected = List.of("a","b","c");
        assertEquals(expected, letterCombinationsOfAPhoneNumber.letterCombinations("2"));



        expected = List.of("a","b","c");
      //  assertEquals(expected, letterCombinationsOfAPhoneNumber.letterCombinations("2975"));

    }


}