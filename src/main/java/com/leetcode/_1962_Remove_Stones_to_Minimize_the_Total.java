package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1962_Remove_Stones_to_Minimize_the_Total {

    public int minStoneSum(int[] piles, int k) {

        if (piles == null) return 0;

        int suma = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < piles.length; i++) {
            int aux = piles[i];
            suma += aux;
            pq.add(aux);
        }


        for (int i = 0; i < k; i++) {

            int max = pq.poll();
            int aux = (max + 1) / 2;
            pq.add(aux);
            suma += aux - max;
        }


        return suma;
    }

}