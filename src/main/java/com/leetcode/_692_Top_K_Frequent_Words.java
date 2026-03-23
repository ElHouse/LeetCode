package com.leetcode;

import java.util.*;
/*
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 */
public class _692_Top_K_Frequent_Words {


    public List<String> topKFrequent(String[] words, int k) {

        if(words == null) return new ArrayList<>();

        List<String> response = new ArrayList<>(k);
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) ->{

            if(b.getValue() == a.getValue()){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        pq.addAll(map.entrySet());

        while (response.size() < k && !pq.isEmpty()) {
            response.add(pq.poll().getKey());
        }

        return response;
    }

}
