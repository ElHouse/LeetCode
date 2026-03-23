package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1941_Check_if_All_Characters_Have_Equal_Number_of_OccurrencesTest {


    _1941_Check_if_All_Characters_Have_Equal_Number_of_Occurrences checkIfAllCharactersHaveEqualNumberOfOccurrences = new _1941_Check_if_All_Characters_Have_Equal_Number_of_Occurrences();
    @Test
    public void test01(){
        assertTrue(checkIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual("abacbc"));

        assertFalse(checkIfAllCharactersHaveEqualNumberOfOccurrences.areOccurrencesEqual("aaabb"));
    }
}