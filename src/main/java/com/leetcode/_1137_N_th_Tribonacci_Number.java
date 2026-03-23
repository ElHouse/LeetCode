package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1137_N_th_Tribonacci_Number {


/*
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.



Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2:
Input: n = 25
Output: 1389537
*/

    private Map<Integer, Integer> cache = new HashMap<>();

    {
        cache.put(0, 0);
        cache.put(1, 1);
        cache.put(2, 1);
    }


    public int tribonacci(int n) {

        if(cache.containsKey(n)) return cache.get(n);

        if (!cache.containsKey(n - 1)) tribonacci(n - 1);

        int num = cache.get(n - 1) + cache.get(n - 2) + cache.get(n - 3);

        cache.put(n, num);

        return cache.get(n);
    }


}
