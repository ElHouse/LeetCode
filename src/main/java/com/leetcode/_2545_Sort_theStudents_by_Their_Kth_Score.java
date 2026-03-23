package com.leetcode;

import java.util.PriorityQueue;

public class _2545_Sort_theStudents_by_Their_Kth_Score {


    public int[][] sortTheStudents(int[][] score, int k) {

        if (k < 0 || score[0].length < k) return null;

        int[][] response = new int[score.length][];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return b[k] - a[k];
        });

        for (int[] s : score) {
            pq.add(s);
        }

        int i = 0;
        while (!pq.isEmpty()) {
            response[i++] = pq.poll();
        }

        return response;
    }


}
