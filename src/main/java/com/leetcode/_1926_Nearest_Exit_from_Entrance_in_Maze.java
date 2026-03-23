package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.

In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.

Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
 */
public class _1926_Nearest_Exit_from_Entrance_in_Maze {

    private static class State {
        int row;
        int col;
        int steps;

        public State(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int nearestExit(char[][] maze, int[] entrance) {

        Queue<State> cola = new LinkedList<>();
        boolean[][] visit = new boolean[maze.length][maze[0].length];

        cola.add(new State(entrance[0], entrance[1], 0));
        visit[entrance[0]][entrance[1]] = true;

        while (!cola.isEmpty()) {

            State state = cola.poll();

            for (int[] dir : directions) {

                State nextStep = new State(state.row + dir[0], state.col + dir[1], state.steps + 1);

                if (valid(nextStep.row, nextStep.col, maze) && !visit[nextStep.row][nextStep.col]) {
                    visit[nextStep.row][nextStep.col] = true;

                    if (isBorder(nextStep.row, nextStep.col, maze)) {
                        return nextStep.steps;
                    }
                    cola.add(nextStep);
                }

            }
        }

        return -1;
    }

    private boolean isBorder(int x, int y, char[][] mat) {
        return x == 0 || x == mat.length - 1 || y == 0 || y == mat[x].length - 1;
    }

    private boolean valid(int row, int col, char[][] mat) {
        return 0 <= row &&
                row < mat.length &&
                0 <= col &&
                col < mat[row].length &&
                mat[row][col] == '.';
    }


}
