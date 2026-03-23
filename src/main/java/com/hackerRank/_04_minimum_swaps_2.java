package com.hackerRank;

import java.util.Arrays;

public class _04_minimum_swaps_2 {


    int minimumSwaps(int[] arr) {

        int response = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != i + 1) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == i + 1) {
                        arr[j] = arr[i];
                        arr[i] = i + 1;
                        response++;
                    }
                }
             }
        }

        return response;
    }

}
