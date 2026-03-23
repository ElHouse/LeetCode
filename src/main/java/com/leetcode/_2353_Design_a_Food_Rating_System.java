package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class _2353_Design_a_Food_Rating_System {


    class FoodRatings {

        private final Map<String, String> mapFoodCuisines;
        private final Map<String, TreeSet<Map.Entry<String, Integer>>> map;
        private final Map<String, Integer> mapFoodRaitings;

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            map = new HashMap<>();
            mapFoodCuisines = new HashMap<>();
            mapFoodRaitings = new HashMap<>();

            for (int i = 0; i < foods.length; i++) {

                mapFoodCuisines.put(foods[i], cuisines[i]);
                mapFoodRaitings.put(foods[i], ratings[i]);

                if (!map.containsKey(cuisines[i])) {
                    map.put(cuisines[i], new TreeSet<>(
                            (a, b) -> {
                                if (b.getValue().equals(a.getValue())) {
                                    return a.getKey().compareTo(b.getKey());
                                }

                                return b.getValue() - a.getValue();
                            }
                    ));
                }

                map.get(cuisines[i]).add(Map.entry(foods[i], ratings[i]));
            }
        }

        public void changeRating(String food, int newRating) {

            if (mapFoodCuisines.containsKey(food)) {

                TreeSet<Map.Entry<String, Integer>> treeSet =  map.get(mapFoodCuisines.get(food));

                treeSet.remove(Map.entry(food, mapFoodRaitings.get(food)));
                treeSet.add(Map.entry(food, newRating));
                mapFoodRaitings.put(food, newRating);
            }
        }

        public String highestRated(String cuisine) {
            return map.containsKey(cuisine) ? map.get(cuisine).getFirst().getKey() : null;
        }
    }


}
