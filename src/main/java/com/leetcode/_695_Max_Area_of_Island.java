package com.leetcode;

/*
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.
 */
public class _695_Max_Area_of_Island {


    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {

        if (grid == null) return 0;

        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(i, j, grid));
                }
            }
        }

        return max;
    }


    private int dfs(int x, int y, int[][] matrix) {

        if (!isValid(x, y, matrix)) return 0;

        matrix[x][y] = 0;
        int suma = 1;

        for (int[] direction : directions) {
            suma += dfs(x + direction[0], y + direction[1], matrix);
        }

        return suma;
    }

    private boolean isValid(int x, int y, int[][] matrix) {

        if (x < 0) return false;
        if (y < 0) return false;

        if (x >= matrix.length) return false;
        if (y >= matrix[0].length) return false;

        return matrix[x][y] == 1;
    }


}
