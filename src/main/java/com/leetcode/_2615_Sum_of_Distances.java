package com.leetcode;

import java.util.*;

/*
You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.

Return the array arr.
 */
public class _2615_Sum_of_Distances {


    public long[] distance2(int[] nums) {

        long[] response = new long[nums.length];

        Map<Integer, List<Integer>> mapPrefix = new HashMap<>();
        Map<Integer, List<Integer>> mapPositions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!mapPrefix.containsKey(nums[i])) {
                mapPrefix.put(nums[i], new ArrayList<>());
            }
            if (!mapPositions.containsKey(nums[i])) {
                mapPositions.put(nums[i], new ArrayList<>());
            }

            List<Integer> list = mapPrefix.get(nums[i]);

            if (list.isEmpty()) {
                list.add(i);
            } else {
                list.add(i + list.getLast());
            }

            mapPositions.get(nums[i]).add(i);
        }

        for (int i = 0; i < nums.length; i++) {

            long sum = 0L;

            int position = mapPositions.get(nums[i]).indexOf(i);

            List<Integer> prefix = mapPrefix.get(nums[i]);

            if (prefix.size() == 1) {
                response[i] = sum;
                continue;
            }

            int minSum = position - 1 >= 0 ? prefix.get(position - 1) : 0;
            int maxSum = prefix.getLast() - prefix.get(position);
            System.out.println("a-------->" + minSum + "----" + maxSum);

            int auxMax = maxSum - (i * (prefix.size() - position - 1));
            int auxMin = (position * i) - minSum;
            System.out.println("b-------->" + auxMin + "----" + auxMax);
            System.out.println("--------------------------------");

            response[i] = auxMax + auxMin;
        }


        System.out.println(Arrays.toString(response));
        return response;
    }

    public long[] distance(int[] nums) {

        long[] response = new long[nums.length];

        Map<Integer, List<Integer>> mapPositions = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!mapPositions.containsKey(nums[i])) {
                mapPositions.put(nums[i], new ArrayList<>());
            }
            mapPositions.get(nums[i]).add(i);
        }

        for (Integer key : mapPositions.keySet()) {

            List<Integer> positions = mapPositions.get(key);
            int size = positions.size();
            long[] prefix = new long[positions.size()];
            prefix[0] = positions.getFirst();
            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + positions.get(i);
            }



            for (int i = 0; i < prefix.length; i++) {
                int pos = positions.get(i);


                response[pos] = (i * (long) pos - (i > 0 ? prefix[i - 1] : 0))
                        +
                        ((prefix[size - 1] - prefix[i]) - (long) pos * (size - i - 1));
            }
        }

        return response;
    }


}
