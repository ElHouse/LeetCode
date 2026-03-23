package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2506_Count_Pairs_Of_Similar_StringsTest {


    _2506_Count_Pairs_Of_Similar_Strings countPairsOfSimilarStrings = new _2506_Count_Pairs_Of_Similar_Strings();


    @Test
    public void test01() {
        assertEquals(2, countPairsOfSimilarStrings.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        assertEquals(3, countPairsOfSimilarStrings.similarPairs(new String[]{"aabb", "ab", "ba"}));
        assertEquals(0, countPairsOfSimilarStrings.similarPairs(new String[]{"nba", "cba", "dba"}));

        assertEquals(16, countPairsOfSimilarStrings.similarPairs(new String[]{
                "dcedceadceceaeddcedc",
                "dddcebcedcdbaeaaaeab",
                "eecbeddbddeadcbbbdbb",
                "decbcbebbddceacdeadd",
                "ccbddbaedcadedbcaaae",
                "dddcaadaceaedcdceedd",
                "bbeddbcbbccddcaceeea",
                "bdabacbbdadabbbddaea"
        }));
    }

}