package com.leetcode;

import java.util.*;

/*

There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.
 */
public class _547_Number_of_Provinces {


    public int findCircleNum(int[][] isConnected) {

        if (isConnected == null || isConnected.length == 0) return 0;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < isConnected.length; i++) {

            if (!set.contains(i)) {

                graph.put(i, new ArrayList<>());
                Queue<Integer> cola = new LinkedList<>();
                cola.add(i);
                set.add(i);
                graph.get(i).add(i);

                while (!cola.isEmpty()) {

                    int aux = cola.poll();
                    int[] line = isConnected[aux];

                    for (int j = 0; j < line.length; j++) {
                        if (line[j] == 1) {
                            if (!set.contains(j)) {
                                cola.add(j);
                                set.add(j);
                                graph.get(i).add(j);
                            }
                        }
                    }
                }
            }
        }

        return graph.size();
    }

    public int findCircleNum2(int[][] isConnected) {

        if (isConnected == null || isConnected.length == 0) return 0;

        int[] provincesList = new int[isConnected.length];
        int count = 1;

        for (int i = 0; i < provincesList.length; i++) {

            if (provincesList[i] == 0) {
                Queue<int[]> cola = new LinkedList<>();
                cola.add(isConnected[i]);

                while (!cola.isEmpty()) {

                    int[] aux = cola.poll();

                    for (int j = 0; j < aux.length; j++) {

                        if (aux[j] == 1 && provincesList[j] == 0) {
                            provincesList[j] = count;
                            if (i != j) cola.add(isConnected[j]);
                        }
                    }
                }

                count++;
            }
        }


        return count - 1;
    }


}
