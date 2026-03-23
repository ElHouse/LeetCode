package com.hackerRank;

import java.util.*;

public class _37_Count_Connected_Components_in_Network {


    public int countIsolatedCommunicationGroups(List<List<Integer>> links, int n) {

        int count = 0;
        Set<Integer> visit = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (List<Integer> l : links) {

            int a = l.get(0);
            int b = l.get(1);

            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            if (!map.containsKey(b)) {
                map.put(b, new ArrayList<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (Integer key : map.keySet()) {
            count += dfs(map, visit, key);
        }

        return count + (n - map.size());
    }

    private static int dfs(Map<Integer, List<Integer>> map, Set<Integer> visit, int node) {

        if (visit.contains(node)) {
            return 0;
        }

        visit.add(node);

        Queue<Integer> cola = new LinkedList<>();
        cola.add(node);

        while (!cola.isEmpty()) {

            List<Integer> nodes = map.get(cola.poll());

            for (Integer n : nodes) {
                dfs(map, visit, n);
            }
        }

        return 1;
    }

}
