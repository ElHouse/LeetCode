package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _3386_Button_with_Longest_Push_TimeTest {


    _3386_Button_with_Longest_Push_Time buttonWithLongestPushTime = new _3386_Button_with_Longest_Push_Time();

    @Test
    public void test1() {

        assertEquals(1, buttonWithLongestPushTime.buttonWithLongestTime(new int[][]{{1, 2}, {2, 5}, {3, 9}, {1, 15}}));
        assertEquals(10, buttonWithLongestPushTime.buttonWithLongestTime(new int[][]{{10, 5}, {1, 7}}));
        assertEquals(2, buttonWithLongestPushTime.buttonWithLongestTime(new int[][]{{9,4}, {19, 5},{2, 8},{3, 11},{2, 15}}));
        assertEquals(20, buttonWithLongestPushTime.buttonWithLongestTime(new int[][]{{5, 4}, {20, 14}}));


    }


}