package com.leetcode.pendientes;

import java.util.HashSet;

public class _62_Unique_Paths {

    private final HashSet<String> cache = new HashSet<>();

    //TODO terminar, no funciona en casos muy grandes

    public int uniquePaths(int m, int n) {
        cache.clear();

        if (m == n && m == 0) return 0;

        int[][] matrix = new int[m][n];

        algo(matrix, "", 0, 0, m, n);
        return cache.size();
    }


    private final String R = "R";
    private final String D = "D";

    public void algo(int[][] matrix, String path, int x, int y, int m, int n) {

        if (cache.contains(path)) return;

        matrix[x][y] = 1;

        if (path.length() - 1 == n) {
            cache.add(path);
        }

        if (y + 1 < n && matrix[x][y + 1] == 0) algo(matrix, path + R, x, y + 1, m, n);
        if (x + 1 < m && matrix[x + 1][y] == 0) algo(matrix, path + D, x + 1, y, m, n);

        matrix[x][y] = 0;
    }

    /*
        public void algo(int[][] matrix, StringBuilder path, int x, int y, int m, int n) {

        if (cache.contains(path)) return;

        matrix[x][y] = 1;

        if (path.length() - 1 == n) {
            cache.add(path);
        }

        if (y + 1 < n && matrix[x][y + 1] == 0) algo(matrix, new StringBuilder(path).append(R), x, y + 1, m, n);
        if (x + 1 < m && matrix[x + 1][y] == 0) algo(matrix, new StringBuilder(path).append(D) , x + 1, y, m, n);

        matrix[x][y] = 0;
        if (x == m - 1 && y == n - 1) {
            count++;
        }

    }
     */
}
