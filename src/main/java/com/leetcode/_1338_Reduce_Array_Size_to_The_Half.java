package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/*
You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the array are removed.
 */
public class _1338_Reduce_Array_Size_to_The_Half {


    public int minSetSize(int[] arr) {

        if (arr == null) return 0;

        int count = 0;
        int goal = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>>  pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        pq.addAll(map.entrySet());

        while (goal > arr.length / 2) {

            goal -= pq.poll().getValue();
            count++;
        }

        return count;
    }

}
