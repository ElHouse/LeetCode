package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class _744_Find_Smallest_Letter_Greater_Than_TargetTest {

    _744_Find_Smallest_Letter_Greater_Than_Target findSmallestLetterGreaterThanTarget = new _744_Find_Smallest_Letter_Greater_Than_Target();

  //  @Test
    public void case1() {

        char[] letters = {'a','b','c','d','e','f','g','h','i','j'};
        char target = 'z';
        System.out.println(findSmallestLetterGreaterThanTarget.algo(letters, target, 0, letters.length-1));

    }
}