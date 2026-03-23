package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2404_Most_Frequent_Even_Element {


    public int mostFrequentEven(int[] nums) {

        if (nums == null || nums.length == 0) return -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {

            if (a.getValue().equals(b.getValue())) {
                return Integer.compare(a.getKey(), b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        pq.addAll(map.entrySet());

        return pq.isEmpty() ? -1 : pq.poll().getKey();
    }
}
