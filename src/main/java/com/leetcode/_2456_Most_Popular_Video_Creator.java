package com.leetcode;

import java.util.*;

public class _2456_Most_Popular_Video_Creator {

    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {

        List<List<String>> response = new ArrayList<>();

        if (creators.length == 0) return response;

        PriorityQueue<Map.Entry<String, Integer>> prCreatorViews = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        Map<String, PriorityQueue<Map.Entry<String, Integer>>> mapCreatorMostViewVideo = new HashMap<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < creators.length; i++) {
            map.put(creators[i], map.getOrDefault(creators[i], 0) + views[i]);

            if (!mapCreatorMostViewVideo.containsKey(creators[i])) {
                mapCreatorMostViewVideo.put(creators[i], new PriorityQueue<>((a, b) -> {
                    if (a.getValue().equals(b.getValue())) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return b.getValue() - a.getValue();
                }));
            }

            mapCreatorMostViewVideo.get(creators[i]).add(Map.entry(ids[i], views[i]));
        }

        prCreatorViews.addAll(map.entrySet());

        int maxViews = prCreatorViews.peek().getValue();

        while (!prCreatorViews.isEmpty() && maxViews == prCreatorViews.peek().getValue()) {

            Map.Entry<String, Integer> entry = prCreatorViews.poll();
            PriorityQueue<Map.Entry<String, Integer>> aux = mapCreatorMostViewVideo.get(entry.getKey());

            List<String> auxResponse = new ArrayList<>();
            auxResponse.add(entry.getKey());
            auxResponse.add(aux.poll().getKey());
            response.add(auxResponse);
        }

        return response;
    }
}
