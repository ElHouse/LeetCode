package com.hackerRank;

import java.util.*;

public class _23_Top_K_Frequent_Events_with_Order_Preservation {


    public List<Integer> getTopKFrequentEvents(List<Integer> events, int k) {

        if (events == null || k == 0) {
            return new ArrayList<>();
        }

        List<Integer> response = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {

            if (b.getValue().equals(a.getValue())) {
                return events.indexOf(a.getKey()) - events.indexOf(b.getKey());
            }

            return b.getValue() - a.getValue();
        });


        for (Integer event : events) {
            map.put(event, map.getOrDefault(event, 0) + 1);
        }

        pq.addAll(map.entrySet());


        for (int i = 0; i < k && !pq.isEmpty(); i++) {

            response.add(pq.poll().getKey());
        }

        response.forEach(System.out::println);


        return response;
    }


}
