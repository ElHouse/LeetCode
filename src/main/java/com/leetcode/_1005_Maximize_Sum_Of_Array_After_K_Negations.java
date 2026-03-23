package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
Given an integer array nums and an integer k, modify the array in the following way:

choose an index i and replace nums[i] with -nums[i].
You should apply this process exactly k times. You may choose the same index i multiple times.

Return the largest possible sum of the array after modifying it in this way.


 */
public class _1005_Maximize_Sum_Of_Array_After_K_Negations {


    public int largestSumAfterKNegations(int[] nums, int k) {

        int suma = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        for (int i = 0; i < k; i++) {
            Integer aux = pq.poll() * -1;
            pq.add(aux);
        }

        while (!pq.isEmpty()) {
            suma += pq.poll();
        }

        return suma;
    }
}
