package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.


 */
public class _746_Min_Cost_Climbing_Stairs {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {

        cache.clear();

        cache.put(0, cost.length>0?cost[0]:0);
        cache.put(1, cost.length>1?cost[1]:0);

        return dp(cost, cost.length);
    }

    private int dp(int[] costs, int n) {

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        cache.put(n, Math.min(
                dp(costs, n - 1) + (n >= costs.length ? 0 : costs[n]),
                dp(costs, n - 2) + (n >= costs.length ? 0 : costs[n])
        ));


        return cache.get(n);
    }


}
