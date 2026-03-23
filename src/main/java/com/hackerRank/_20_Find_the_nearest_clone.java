package com.hackerRank;

import java.util.*;
/*
In this challenge, there is a connected undirected graph where each of the nodes is a color. Given a color, find the shortest path connecting any two nodes of that color. Each edge has a weight of . If there is not a pair or if the color is not found, print .

 */
public class _20_Find_the_nearest_clone {

    static class Steps {

        int nodo;
        int step;

        public Steps(int nodo, int step) {
            this.nodo = nodo;
            this.step = step;
        }
    }

    int findShortest(int graphNodes,
                     int[] graphFrom,
                     int[] graphTo,
                     long[] ids,
                     int val) {

        int min = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < graphFrom.length; i++) {

            if (!map.containsKey(graphFrom[i])) {
                map.put(graphFrom[i], new ArrayList<>());
            }
            if (!map.containsKey(graphTo[i])) {
                map.put(graphTo[i], new ArrayList<>());
            }

            map.get(graphFrom[i]).add(graphTo[i]);
            map.get(graphTo[i]).add(graphFrom[i]);
        }


        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == val) {
                int aux = dfs(map, (int) ids[i], val, ids);
                min = Math.min(aux, min);
            }
        }


        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private static int dfs(Map<Integer, List<Integer>> map, int nodo, int color, long[] colors) {

        Queue<Steps> cola = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        int minStep = Integer.MAX_VALUE;

        cola.add(new Steps(nodo, 1));
        visit.add(nodo);

        while (!cola.isEmpty()) {

            Steps n = cola.poll();
            List<Integer> auxs = map.get(n.nodo);

            for (Integer aux : auxs) {
                if (!visit.contains(aux)) {

                    visit.add(aux);
                    cola.add(new Steps(aux, n.step + 1));

                    if (color == colors[aux - 1]) {
                        minStep = Math.min(minStep, n.step);
                    }
                }
            }

        }

        return minStep == Integer.MAX_VALUE ? -1 : minStep;
    }


}
