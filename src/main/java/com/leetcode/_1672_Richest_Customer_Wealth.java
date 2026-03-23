package com.leetcode;

public class _1672_Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int suma = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                suma += accounts[i][j];
            }
            max = Math.max(max, suma);
        }


        return max;
    }

}
