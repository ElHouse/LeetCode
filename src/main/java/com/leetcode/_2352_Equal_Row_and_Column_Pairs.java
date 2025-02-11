package com.leetcode;

import java.util.HashMap;

public class _2352_Equal_Row_and_Column_Pairs {


    public int equalPairs(int[][] grid) {

        String espacio = " ";
        HashMap<String, Integer> cache = new HashMap<>();
        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[i][j]);
                sb.append(espacio);
            }

            cache.put(sb.toString(), cache.getOrDefault(sb.toString(), 0) + 1);
        }


        for (int i = 0; i < grid.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[j][i]);
                sb.append(espacio);
            }

            if (cache.containsKey(sb.toString())) {
                count += cache.get(sb.toString());
            }
        }

        return count;
    }
}
