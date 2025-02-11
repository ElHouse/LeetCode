package com.leetcode;

public class _877_Stone_Game {

    private boolean winA = false;

    public boolean stoneGame(int[] piles) {

        process(piles, 0, piles.length - 1, 0, 0);

        return winA;
    }

    private void process(int[] piles, int i, int j, int totalA, int totalB) {


        if (winA) {
            return;
        }


        if (i >= j) {

            if (totalA > totalB) {
                winA = true;
            }

            return;
        }

        process(piles, i + 1, j - 1, totalA + piles[i], totalB + piles[j]);
        process(piles, i + 1, j - 1, totalA + piles[j], totalB + piles[i]);
    }

}
