package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _909_Snakes_and_Ladders {

    private static class Position {
        int x;
        int steps;

        public Position(int x, int steps) {
            this.x = x;
            this.steps = steps;
        }

        public Position() {
        }

        @Override
        public String toString() {
            return "Position{" +
                    "x=" + x +
                    ", steps=" + steps +
                    '}';
        }
    }

    public int snakesAndLadders(int[][] board) {

        if (board.length == 1) return 1;

        int min = Integer.MAX_VALUE;
        int n = board.length;

        int[] path = new int[n * n];
        boolean[] visit = new boolean[n * n];
        Queue<Position> cola = new LinkedList<>();
        boolean right = true;
        int index = 0;

        for (int i = board.length - 1; i >= 0; i--) {

            if (right) {
                for (int j = 0; j < board.length; j++) {
                    path[index++] = board[i][j];
                }
            } else {
                for (int j = board.length - 1; j >= 0; j--) {
                    path[index++] = board[i][j];
                }
            }
            right = !right;
        }

        System.out.println(Arrays.toString(path));


        Position initial = new Position();
        cola.add(initial);

        while (!cola.isEmpty()) {

            Position current = cola.poll();


            for (int i = 1; i < 7; i++) {

                Position next = new Position(current.x + i, current.steps + 1);
                System.out.println("next>> " + next);

                if (isValid(next, n) && !visit[next.x]) {

                    visit[next.x] = true;

                    if (path[next.x] != -1) {

                        int value = path[next.x];
                        next.x = value - 1;
                    }

                    if (next.x == n * n - 1) {
                        min = Math.min(min, next.steps);
                    }

                    System.out.println("next final>> " + next);

                    cola.add(next);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private static boolean isValid(Position position, int n) {
        return 0 <= position.x && position.x < n * n;
    }
}
