package com.leetcode;

public class _2011_Final_Value_of_Variable_After_Performing_Operations {


    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String str : operations) {
            if (str.contains("+")) {
                x++;
            } else {
                x--;
            }

        }

        return x;
    }
}
