package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _79_Word_SearchTest {

    private final _79_Word_Search wordSearch = new _79_Word_Search();


    @Test
    public void test01() {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertTrue(wordSearch.exist(board, "ABCCED"));
    }

    @Test
    public void test02() {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };


        assertTrue(wordSearch.exist(board, "SEE"));
    }

    @Test
    public void test03() {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };


        assertFalse(wordSearch.exist(board, "ABCB"));
    }

}