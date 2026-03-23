package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2389_Longest_Subsequence_With_Limited_SumTest {

    _2389_Longest_Subsequence_With_Limited_Sum longestSubsequenceWithLimitedSum = new _2389_Longest_Subsequence_With_Limited_Sum();


    @Test
    public void test01(){
        assertArrayEquals(new int[]{2,3,4}, longestSubsequenceWithLimitedSum.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21}));
        assertArrayEquals(new int[]{0}, longestSubsequenceWithLimitedSum.answerQueries(new int[]{2,3,4,5}, new int[]{1}));

        assertArrayEquals(new int[]{2,2,1,1,2,3,3}, longestSubsequenceWithLimitedSum.answerQueries(new int[]{736411,184882,914641,37925,214915}, new int[]{331244,273144,118983,118252,305688,718089,665450}));

    }


}