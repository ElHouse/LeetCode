package com.leetcode;

import java.util.*;

/*
There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.

You want to determine if there is a valid path that exists from vertex source to vertex destination.

Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
 */
public class _1971_Find_if_Path_Exists_in_Graph {

    private final Set<Integer> visit = new HashSet<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (edges == null || edges.length == 0) return true;

        Map<Integer, List<Integer>> map = new HashMap<>();
        //relacion bidrecional del grafo
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


        return dfs(map, source, destination);
    }

//recorre el grafo y te dice si un nodo puede llegar a otro
    private boolean dfs(Map<Integer, List<Integer>> routes, int source, int destination) {

        if (source == destination) return true;
        if (visit.contains(source)) return false;

        visit.add(source);
        List<Integer> nodes = routes.getOrDefault(source, new ArrayList<>());

        for (Integer n : nodes) {

            if (!visit.contains(n)) {

                if (dfs(routes, n, destination)) {
                    return true;
                }
            }
        }

        return false;
    }


}
