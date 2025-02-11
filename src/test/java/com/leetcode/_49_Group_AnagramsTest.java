package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _49_Group_AnagramsTest {


    _49_Group_Anagrams group_anagrams = new _49_Group_Anagrams();


    @Test
    public void case1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        group_anagrams.groupAnagrams(strs);
    }


    @Test
    public void case2() {
        String[] strs = {"abc", "dbc", "qwe", "ksajd", "sad"};

        group_anagrams.groupAnagrams(strs);
    }
}