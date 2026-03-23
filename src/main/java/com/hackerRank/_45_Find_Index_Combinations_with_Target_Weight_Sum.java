package com.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _45_Find_Index_Combinations_with_Target_Weight_Sum {


    public List<List<Integer>> findCombinationsByWeightIndices(List<Integer> weights, int capacity) {
        // Write your code here
        if (weights == null || capacity < 0) return new ArrayList<>();

        List<List<Integer>> response = new ArrayList<>();

        backTracking(response, weights, capacity, 0, 0, new ArrayList<>());

        for (List<Integer> res : response) {
            Collections.sort(res);
        }
        return response;
    }

    private static void backTracking(List<List<Integer>> response, List<Integer> weights, int capacity, int auxCapacity, int index, List<Integer> indexes) {

        if (capacity == auxCapacity) {
            System.out.println(indexes);
            response.add(indexes);
            return;
        }

        for (int i = index; i < weights.size(); i++) {

            if (auxCapacity + weights.get(i) <= capacity) {
                indexes.add(weights.get(i));
                backTracking(response, weights, capacity, auxCapacity + weights.get(i), i, indexes);
                indexes.removeLast();

                /*
                List<Integer> aux = new ArrayList<>(indexes);
                aux.add(i);
                backTracking(response, weights, capacity, auxCapacity + weights.get(i), i, aux);*/
            }
        }
    }


}
