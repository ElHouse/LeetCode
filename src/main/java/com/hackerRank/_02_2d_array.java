package com.hackerRank;

import java.util.List;

public class _02_2d_array {

    public int hourglassSum(List<List<Integer>> arr) {

        int response = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {


            for (int j = 0; j < arr.size() - 2; j++) {
                int suma = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                        arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                 response = Math.max(response, suma);
            }

        }

        return response;
    }
}
