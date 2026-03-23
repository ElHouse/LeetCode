package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.



Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are:
"D" -> "B" -> "C" -> "A".
"B" -> "C" -> "A".
"C" -> "A".
"A".
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"
 */
public class _1436_Destination_City {

    public String destCity(List<List<String>> paths) {

        Map<String, List<String>> routes = new HashMap<>();

        for (List<String> path : paths) {

            String origin = path.get(0);
            String destination = path.get(1);

            if (routes.containsKey(origin)) {
                routes.get(origin).add(destination);
            } else {
                routes.put(origin, new ArrayList<>());
                routes.get(origin).add(destination);
            }

            if (routes.containsKey(destination)) {
                routes.get(destination).add(destination);
            } else {
                routes.put(destination, new ArrayList<>());
            }

            routes.get(origin).add(destination);
        }

        for (String key : routes.keySet()) {
            int size = routes.get(key).size();
            if (size == 0) {
                return key;
            }
        }

        return "";
    }

}
