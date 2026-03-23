package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1208_Get_Equal_Substrings_Within_BudgetTest {


    private final _1208_Get_Equal_Substrings_Within_Budget getEqualSubstringsWithinBudget = new _1208_Get_Equal_Substrings_Within_Budget();


    @Test
    public void test01(){
        assertEquals(3, getEqualSubstringsWithinBudget.equalSubstring("abcd", "bcdf",3));
    }
    @Test
    public void test02(){
        assertEquals(1, getEqualSubstringsWithinBudget.equalSubstring("abcd", "cdef",3));
    }
    @Test
    public void test03(){
        assertEquals(1, getEqualSubstringsWithinBudget.equalSubstring("abcd", "acde",0));
    }


    @Test
    public void test04(){
        assertEquals(4, getEqualSubstringsWithinBudget.equalSubstring("abcd", "zzzz",1000));
    }

    @Test
    public void test05(){
        assertEquals(0, getEqualSubstringsWithinBudget.equalSubstring("abcd", "cdef",1));
    }

}