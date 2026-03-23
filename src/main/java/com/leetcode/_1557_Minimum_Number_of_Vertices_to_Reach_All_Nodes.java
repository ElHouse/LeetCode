package com.leetcode;

import java.util.*;

public class _1557_Minimum_Number_of_Vertices_to_Reach_All_Nodes {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        int[] nodos = new int[n];
        List<Integer> response = new ArrayList<>();

        for (List<Integer> edge : edges) {

            int direction = edge.get(1);
            nodos[direction]++;
        }

        for (int i = 0; i < nodos.length; i++) {
            if (nodos[i] == 0) {
                response.add(i);
            }
        }


        return response;
    }


}
