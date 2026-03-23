package com.leetcode;


/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */

public class _79_Word_Search {

    private int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public boolean exist(char[][] board, String word) {

        if (word == null || board == null || word.isEmpty()) return false;

        boolean[][] seen = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == word.charAt(0)) {
                    seen[i][j] = true;

                    if (dfs(board, word, i, j, seen, 1)) {
                        return true;
                    }

                    seen[i][j] = false;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int x, int y, boolean[][] seen, int index) {

        if (index == word.length()) {
            return true;
        }

        for (int i = 0; i < directions.length; i++) {

            int a = x + directions[i][0];
            int b = y + directions[i][1];

            if (valid(a, b, board) &&
                    !seen[a][b] &&
                    word.charAt(index) == board[a][b]) {
                seen[a][b] = true;

                if (dfs(board, word, a, b, seen, index + 1)) {
                    return true;
                }
                seen[a][b] = false;
            }
        }

        return false;
    }

    private boolean valid(int row, int col, char[][] board) {
        return 0 <= row && row < board.length && 0 <= col && col < board[0].length;
    }

}
