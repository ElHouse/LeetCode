package com.hackerRank;

import java.util.*;

public class _21_BFS_Shortest_Reach_in_a_Graph {

    static class Step {
        int node;
        int step;

        public Step(int node, int step) {
            this.node = node;
            this.step = step;
        }
    }

    public int[] Shortest_Reach_in_a_Graph(int[][] connections, int startingPoint, int numberNodes) {

        int[] response = new int[numberNodes];

        Arrays.fill(response, -1);

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] con : connections) {
            int a = con[0];
            int b = con[1];

            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            if (!map.containsKey(b)) {
                map.put(b, new ArrayList<>());
            }

            map.get(a).add(b);
            map.get(b).add(a);
        }

        bfs(map, startingPoint, response);

        return response;
    }


    private static void bfs(Map<Integer, List<Integer>> map, int start, int[] response) {

        Set<Integer> visit = new HashSet<>();
        Queue<Step> cola = new LinkedList<>();

        visit.add(start);
        cola.add(new Step(start, 7));

        while (!cola.isEmpty()) {

            Step step = cola.poll();

            List<Integer> list = map.get(step.node);

            for (Integer element : list) {

                if (!visit.contains(element)) {
                    response[element] = step.step * 6;
                    cola.add(new Step(element, step.step + 1));
                    visit.add(element);
                }
            }
        }
    }

}
