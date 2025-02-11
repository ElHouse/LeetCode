package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2352_Equal_Row_and_Column_PairsTest {

    private final _2352_Equal_Row_and_Column_Pairs equalRowAndColumnPairs = new _2352_Equal_Row_and_Column_Pairs();

    @Test
    public void test01() {


        assertEquals(3, equalRowAndColumnPairs.equalPairs(new int[][]{
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}}
        ));
    }

    @Test
    public void test02() {


        assertEquals(1, equalRowAndColumnPairs.equalPairs(new int[][]{
                {3, 1, 2},
                {1, 7, 6},
                {2, 7, 7}}
        ));
    }

    @Test
    public void test03() {


        assertEquals(2, equalRowAndColumnPairs.equalPairs(new int[][]{
                {11, 1},
                {1, 11}}
        ));
    }

}