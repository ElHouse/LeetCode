package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.

The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).


 */
public class _797_All_Paths_From_Source_to_Target {


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> start = new ArrayList<>();

        start.add(0);

        backTracking(ans, start, 0, graph);

        return ans;
    }


    private void backTracking(List<List<Integer>> ans, List<Integer> curr, int i, int[][] graph) {

        if (curr.getLast() == graph.length - 1) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int conectados : graph[i]) {

            curr.add(conectados);
            backTracking(ans, curr, conectados, graph);
            curr.removeLast();
        }

    }


}
