package com.leetcode;

import java.util.*;

/*
There is an undirected tree with n nodes labeled from 0 to n - 1 and n - 1 edges.

You are given a 2D integer array edges of length n - 1 where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree. You are also given an integer array restricted which represents restricted nodes.

Return the maximum number of nodes you can reach from node 0 without visiting a restricted node.

Note that node 0 will not be a restricted node.
 */
public class _2368_Reachable_Nodes_With_Restrictions {


    public int reachableNodes(int n, int[][] edges, int[] restricted) {

        if (n <= 0) return 0;

        Set<Integer> visit = new HashSet<>();
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

        for (int j : restricted) {
            visit.add(j);
        }

        return dfs(map, visit, 0);
    }


    private int dfs(Map<Integer, List<Integer>> paths, Set<Integer> visit, int node) {

        int suma = 0;

        if (visit.contains(node)) return 0;
        visit.add(node);

        List<Integer> nodes = paths.getOrDefault(node, new ArrayList<>());

        for (Integer n : nodes) {
            suma += dfs(paths, visit, n);
        }

        return suma + 1;
    }


}
