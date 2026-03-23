package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2374_Node_With_Highest_Edge_Score {


    public int edgeScore(int[] edges) {

        if (edges.length == 0) return 0;

        Map<Integer, Long> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Long>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey() - b.getKey();
            }

            return b.getValue().compareTo(a.getValue());
        });


        for (int i = 0; i < edges.length; i++) {
            map.put(edges[i], map.getOrDefault(edges[i], 0L) + i);
        }

        pq.addAll(map.entrySet());

        return pq.poll().getKey();
    }
}
