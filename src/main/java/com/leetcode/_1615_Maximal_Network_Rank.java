package com.leetcode;

import java.util.*;

public class _1615_Maximal_Network_Rank {

    public int maximalNetworkRank(int n, int[][] roads) {

        if (roads == null) return 0;
        if (roads.length == 0) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        int max = 0;

        for (int[] road : roads) {

            if (!map.containsKey(road[0])) {
                map.put(road[0], new ArrayList<>());
            }
            if (!map.containsKey(road[1])) {
                map.put(road[1], new ArrayList<>());
            }

            map.get(road[0]).add(road[1]);
            map.get(road[1]).add(road[0]);
        }

        System.out.println(map);

        for (int i = 0; i < n; i++) {

            List<Integer> caminos = map.getOrDefault(i, new ArrayList<>());

            for (Integer c : caminos) {


                System.out.println(i + "-----------C>" + c + "------------map.get(c).size() - 1>" + (map.get(c).size() - 1) + "---------caminos.size()>" + caminos.size());
                max = Math.max(max, map.get(c).size() - 1 + caminos.size());
            }
        }

        return max;
    }


}
