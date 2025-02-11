package com.leetcode;


public class _994_Rotting_Oranges {

    int r = 4;
    boolean isARotten = false;

    public void rotting(int[][] grid, int x, int y) {

        if (x >= 0 && x < grid.length && y >= 0 && y < grid[x].length && grid[x][y] == 1) {
            isARotten = true;
            grid[x][y] = r;
        }
    }

    //	Runtime: 1 ms, faster than 100.00% of Java online submissions for Rotting Oranges.
//	Memory Usage: 38.9 MB, less than 81.25% of Java online submissions for Rotting Oranges.
    public int orangesRotting(int[][] grid) {

        boolean isAFresh = false;
        int step = -1;

        do {

            step++;
            isAFresh = false;
            isARotten = false;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {

                    if (grid[i][j] == r - 2) {
                        grid[i][j] = 0;
                        rotting(grid, i - 1, j);
                        rotting(grid, i + 1, j);
                        rotting(grid, i, j - 1);
                        rotting(grid, i, j + 1);
                    }
                    if (grid[i][j] == 1) {
                        isAFresh = true;
                    }
                }
            }

            r += 2;

        } while (isARotten);


        if (!isARotten && isAFresh) {
            return -1;
        }

        System.out.println("step>" + step);

        return step;
    }


}
