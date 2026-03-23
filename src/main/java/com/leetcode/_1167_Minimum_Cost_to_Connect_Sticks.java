package com.leetcode;

import java.util.PriorityQueue;
import java.util.Set;

public class _1167_Minimum_Cost_to_Connect_Sticks {


    public int connectSticks(int[] sticks) {

        if (sticks == null) return 0;
        if (sticks.length == 1) return 0;

        int suma = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < sticks.length; i++) {
            pq.add(sticks[i]);
        }

        while (pq.size() >= 2) {

            int a = pq.poll();
            int b = pq.poll();

            suma += a + b;
            pq.add(a + b);
        }

        return suma;
    }


}
