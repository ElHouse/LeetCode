package com.hackerRank;

import java.util.*;

public class _19_Roads_and_Libraries {

    public long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {

        Set<Integer> visited = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        long response = 0;
        int countCity =0;

        for (List<Integer> city : cities) {
            int cityOrigin = city.get(0);
            int cityDestination = city.get(1);

            if (!map.containsKey(cityOrigin)) {
                map.put(cityOrigin, new ArrayList<>());
            }
            if (!map.containsKey(cityDestination)) {
                map.put(cityDestination, new ArrayList<>());
            }

            map.get(cityOrigin).add(cityDestination);
            map.get(cityDestination).add(cityOrigin);
        }


        for (Integer key : map.keySet()) {

            if (!visited.contains(key)) {
                visited.add(key);
                int count = getNumberOfUniqueRoads(map, key, visited);
                countCity+=count+1;
                response += Math.min((count+1) * c_lib, count * c_road + c_lib);
            }
        }


        if(countCity < n){
            response += (long) c_lib * (n-countCity);
        }

        return response;
    }


    private static int getNumberOfUniqueRoads(Map<Integer, List<Integer>> map, int city, Set<Integer> visited) {

        Queue<Integer> cola = new LinkedList<>();
        int count =0;
        cola.add(city);

        while (!cola.isEmpty()) {

            int cityAux = cola.poll();
            List<Integer> nodos = map.get(cityAux);

            for (Integer nodo : nodos) {
                if (!visited.contains(nodo)) {
                    cola.add(nodo);
                    visited.add(nodo);
                    count++;
                }
            }
        }

         return count;
    }


}
