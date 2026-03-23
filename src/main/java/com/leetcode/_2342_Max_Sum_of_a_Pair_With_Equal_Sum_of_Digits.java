package com.leetcode;

import java.util.*;

/*
You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].

Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions. If no such pair of indices exists, return -1.
 */
public class _2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {


    public int maximumSum(int[] nums) {

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int result = -1;

        for (int num : nums) {

            int sum = sumDigits(num);

            if (!map.containsKey(sum)) {
                map.put(sum, new PriorityQueue<>());
            }

            map.get(sum).add(num);

            if (map.get(sum).size() > 2) {
                map.get(sum).poll();
            }

        }

        for (Integer key : map.keySet()) {
            PriorityQueue<Integer> aux = map.get(key);
            if (aux.size() <= 1) continue;
            int a = aux.poll();
            int b = aux.poll();
            result = Math.max(result, a + b);
        }

        return result;
    }

    private static int sumDigits(int aux) {

        int suma = 0;

        while (aux > 0) {
            suma += aux % 10;
            aux = (aux / 10);

        }

        return suma;
    }
}
