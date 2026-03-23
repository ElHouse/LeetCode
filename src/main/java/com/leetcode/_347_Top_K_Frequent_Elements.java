package com.leetcode;

import java.util.*;

public class _347_Top_K_Frequent_Elements {


    public int[] topKFrequent(int[] nums, int k) {

        List<Integer> response = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> {
                    return b.getValue() - a.getValue();
                }
        );


        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        pq.addAll(map.entrySet());


        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            response.add(pq.poll().getKey());
        }

        return response.stream().mapToInt(a -> a).toArray();
    }


}
