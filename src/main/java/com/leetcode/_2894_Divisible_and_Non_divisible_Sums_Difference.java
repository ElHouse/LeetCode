package com.leetcode;

public class _2894_Divisible_and_Non_divisible_Sums_Difference {


    public int differenceOfSums(int n, int m) {

        int sumaNot = 0;
        int sumaDo = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumaDo += i;
            } else {
                sumaNot += i;
            }
        }

        return sumaNot - sumaDo;
    }
}
