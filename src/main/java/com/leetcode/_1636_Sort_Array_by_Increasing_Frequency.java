package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _1636_Sort_Array_by_Increasing_Frequency {


    public int[] frequencySort(int[] nums) {

        int[] response = new int[nums.length];

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey() - a.getKey();
            }

            return a.getValue() - b.getValue();
        });

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        pq.addAll(map.entrySet());

        int i = 0;
        while (!pq.isEmpty()) {

            Map.Entry<Integer, Integer> entry = pq.poll();

            for (int j = 0; j < entry.getValue(); j++) {
                response[i++] = entry.getKey();
            }
        }

        return response;
    }

}
