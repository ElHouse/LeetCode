package com.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class _373_Find_K_Pairs_with_Smallest_Sums {

    private static class Pair implements Comparable<Pair> {
        int suma;
        List<Integer> lista;

        public Pair(int a, int b) {
            suma = a + b;
            lista = List.of(a, b);
        }

        @Override
        public int compareTo(Pair o) {
            return suma - o.suma;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> response = new ArrayList<>();
        PriorityQueue<Pair> parejas = new PriorityQueue<>();


        for (int i = 0; i < k && i < nums1.length; i++) {
            for (int j = 0; j < k && j < nums2.length; j++) {
                Pair par = new Pair(nums1[i], nums2[j]);
                parejas.add(par);
            }
        }


        for (int i = 0; i < k && !parejas.isEmpty(); i++) {
            response.add(parejas.poll().lista);
        }


        return response;
    }
}