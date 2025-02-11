package com.leetcode;

import java.util.Arrays;

public class _274_H_Index {

    public int hIndex(int[] citations) {


        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            int remainingPapers = citations.length - i;
            if (citations[i] >= remainingPapers) {
                h = remainingPapers;
                break;
            }
        }

        return h;

    }
}