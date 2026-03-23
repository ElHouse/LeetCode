package com.leetcode;

import java.util.*;

/*
You have a graph of n nodes. You are given an integer n and an array edges where edges[i] = [ai, bi] indicates that there is an edge between ai and bi in the graph.

Return the number of connected components in the graph

 */
public class _323_Number_of_Connected_Components_in_an_Undirected_Graph {

    private Set<Integer> visit;

    public int countComponents(int n, int[][] edges) {

        if (n == 1) return 1;

        int suma = 0;
        visit = new HashSet<>();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] edge : edges) {

            int x = edge[0];
            int y = edge[1];

            if (!map.containsKey(x)) {
                map.put(x, new ArrayList<>());
            }

            if (!map.containsKey(y)) {
                map.put(y, new ArrayList<>());
            }

            map.get(x).add(y);
            map.get(y).add(x);
        }


        for (Integer key : map.keySet()) {
            int aux = dfs(map, key);
            suma += aux;
        }


        return suma + (n - visit.size());
    }

    private int dfs(Map<Integer, List<Integer>> map, int node) {

        if (visit.contains(node)) return 0;

        visit.add(node);

        List<Integer> nodes = map.getOrDefault(node, new ArrayList<>());

        for (int i = 0; i < nodes.size(); i++) {
            dfs(map, nodes.get(i));
        }

        return 1;
    }


}
