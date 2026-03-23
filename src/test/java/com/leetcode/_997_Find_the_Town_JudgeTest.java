package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _997_Find_the_Town_JudgeTest {


    private final _997_Find_the_Town_Judge findTheTownJudge = new _997_Find_the_Town_Judge();


    @Test
    public void test01() {
        assertEquals(2, findTheTownJudge.findJudge(2, new int[][]{{1, 2}}));
    }

    @Test
    public void test02() {
        assertEquals(3, findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
    }

    @Test
    public void test03() {
        assertEquals(-1, findTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }


    @Test
    public void test04() {
        assertEquals(-1, findTheTownJudge.findJudge(3, new int[][]{{1, 2}, {2, 3}}));
    }




}