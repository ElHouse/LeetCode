package com.hackerRank;

import java.util.*;

public class _22_Next_Greater_Element_with_Position_Offset {


    public List<List<Integer>> findNextGreaterElementsWithDistance(List<Integer> readings) {

        List<List<Integer>> lists = new ArrayList<>();

        if(readings == null || readings.isEmpty()){
            return lists;
        }

        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        int[][] response = new int[readings.size()][2];


        stack.add(Map.entry(readings.getFirst(), 0));

        for (int i = 1; i < readings.size(); i++) {

            while (!stack.isEmpty() && stack.peek().getKey() < readings.get(i)) {

                Map.Entry<Integer, Integer> entry = stack.pop();
                response[entry.getValue()][0] = readings.get(i);
                response[entry.getValue()][1] = i - entry.getValue();
            }

            stack.add(Map.entry(readings.get(i), i));
        }

        while (!stack.isEmpty()) {
            Map.Entry<Integer, Integer> entry = stack.pop();
            response[entry.getValue()][0] = -1;
            response[entry.getValue()][1] = -1;
        }

        for (int[] pair : response){
            lists.add(List.of(pair[0],pair[1]));
        }

        return lists;
    }


}
