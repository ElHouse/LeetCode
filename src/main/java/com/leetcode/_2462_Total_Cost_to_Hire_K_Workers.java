package com.leetcode;

import java.util.PriorityQueue;

/*

You are given a 0-indexed integer array costs where costs[i] is the cost of hiring the ith worker.

You are also given two integers k and candidates. We want to hire exactly k workers according to the following rules:

You will run k sessions and hire exactly one worker in each session.
In each hiring session, choose the worker with the lowest cost from either the first candidates workers or the last candidates workers. Break the tie by the smallest index.
For example, if costs = [3,2,7,7,1,2] and candidates = 2, then in the first hiring session, we will choose the 4th worker because they have the lowest cost [3,2,7,7,1,2].
In the second hiring session, we will choose 1st worker because they have the same lowest cost as 4th worker but they have the smallest index [3,2,7,7,2]. Please note that the indexing may be changed in the process.
If there are fewer than candidates workers remaining, choose the worker with the lowest cost among them. Break the tie by the smallest index.
A worker can only be chosen once.
Return the total cost to hire exactly k workers.

*/
public class _2462_Total_Cost_to_Hire_K_Workers {


    public long totalCost(int[] costs, int k, int candidates) {

        long total = 0;
        PriorityQueue<Pair> front = new PriorityQueue<>();
        PriorityQueue<Pair> back = new PriorityQueue<>();

        int count = 0;
        int i = 0;
        int j = costs.length - 1;

        for (; i < candidates && i < costs.length; i++) {
            front.add(new Pair(i, costs[i]));
            count++;
        }

        for (; j >= 0 && count < costs.length && j >= costs.length - candidates; j--) {
            back.add(new Pair(j, costs[j]));
            count++;
        }


        for (int c = 0; c < k && (!front.isEmpty() || !back.isEmpty()); c++) {

            Pair candidateFront = front.isEmpty() ? new Pair(999, Integer.MAX_VALUE) : front.peek();
            Pair candidateBack = back.isEmpty() ? new Pair(999, Integer.MAX_VALUE) : back.peek();

            if (candidateFront.compareTo(candidateBack) <= 0) {
                total += candidateFront.value;
                front.poll();
                if (count < costs.length) {
                    count++;
                    front.add(new Pair(i, costs[i]));
                    i++;
                }
            } else {
                total += candidateBack.value;
                back.poll();
                if (count < costs.length) {
                    count++;
                    back.add(new Pair(j, costs[j]));
                    j--;
                }
            }
        }




        return total;
    }


    private class Pair implements Comparable<Pair> {

        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Pair o) {

            if (value == o.value) {
                return index - o.index;
            }

            return value - o.value;
        }
    }


}
