package com.leetcode;

public class _852_Peak_Index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] A) {

        for (int i = 1; i < A.length - 1; i++) {

            if (isMoutain(A[i - 1], A[i], A[i + 1])) {
                return i;
            }

        }


        return 0;
    }

    public boolean isMoutain(int a, int b, int c) {

        return a < b && b > c;
    }


}


