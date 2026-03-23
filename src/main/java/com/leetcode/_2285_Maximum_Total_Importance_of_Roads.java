package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class _2285_Maximum_Total_Importance_of_Roads {

    /**
     * You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.
     * <p>
     * You are also given a 2D integer array roads where roads[i] = [ai, bi] denotes that there exists a bidirectional road connecting cities ai and bi.
     * <p>
     * You need to assign each city with an integer value from 1 to n, where each value can only be used once. The importance of a road is then defined as the sum of the values of the two cities it connects.
     * <p>
     * Return the maximum total importance of all roads possible after assigning the values optimally.
     */

    private Map<Integer, List<Integer>> map = new HashMap<>();


    public long maximumImportance(int n, int[][] roads) {

        if(roads == null) return 0L;

        int elements = n;

        int index = n - 1;
        int[] values = new int[n];
        int[] realValues = new int[n];
        long suma = 0;

        crearMapa(roads);

        Map<Integer, List<Map.Entry<Integer, List<Integer>>>> integerMapMap = map.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                m -> m.getValue().size()
                        )
                );


        while (elements > 0) {

            List<Integer> withExactNElements = withExactNElements(elements--);

            if (!withExactNElements.isEmpty()) {

                if (withExactNElements.size() == 1) {
                    values[index] = withExactNElements.getFirst();
                    index--;
                } else {
                    for (Integer nElments : withExactNElements) {
                        boolean found = false;
                        for (int i = n - 1; i > -1; i--) {
                            if (map.containsKey(values[i])) {
                                if (map.get(values[i]).contains(nElments)) {
                                    values[index] = nElments;
                                    index--;
                                    found = true;
                                    break;
                                }
                            }
                        }

                        if (!found) {
                            values[index] = nElments;
                            index--;
                        }
                    }
                }
            }
         }

        int j = 0;
        for (int i = 0; i < n; i++) {
            realValues[values[i]] = i + 1;
        }


        for (int[] road : roads) {
            int a = road[0], b = road[1];
            suma += realValues[a] + realValues[b];
        }


        return suma;
    }


    private List<Integer> withExactNElements(int n) {

        return map.entrySet().stream()
                .filter(e -> e.getValue().size() == n)
                .map(e -> e.getKey())
                .toList();
    }

    private void crearMapa(int[][] roads) {

        for (int[] road : roads) {
            int a = road[0], b = road[1];
            map.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            map.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }

    }

}
