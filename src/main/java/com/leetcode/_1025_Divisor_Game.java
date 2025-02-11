package com.leetcode;

public class _1025_Divisor_Game {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Divisor Game.
//	Memory Usage: 33.2 MB, less than 13.33% of Java online submissions for Divisor Game

    public boolean divisorGame(int N) {

        boolean alice = false;

        while (N > 1) {
            int aux = nextPair(N);
            N -= aux;
            alice = !alice;
        }

        return alice;
    }

    private int nextPair(int n) {

        for (int i = 1; i < n - 1; i++) {

            if (n % i == 0) return i;
        }

        return 1;
    }


}
