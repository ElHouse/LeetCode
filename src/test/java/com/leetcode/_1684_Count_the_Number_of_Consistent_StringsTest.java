package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1684_Count_the_Number_of_Consistent_StringsTest {

    _1684_Count_the_Number_of_Consistent_Strings countTheNumberOfConsistentString = new _1684_Count_the_Number_of_Consistent_Strings();


    @Test
    public void test01() {
        assertEquals(2, countTheNumberOfConsistentString.countConsistentStrings("ab",
                new String[]{"ad","bd","aaab","baa","badab"}));
        assertEquals(7, countTheNumberOfConsistentString.countConsistentStrings("abc",
                new String[]{"a","b","c","ab","ac","bc","abc"}));
        assertEquals(4, countTheNumberOfConsistentString.countConsistentStrings("cad",
                new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }

}