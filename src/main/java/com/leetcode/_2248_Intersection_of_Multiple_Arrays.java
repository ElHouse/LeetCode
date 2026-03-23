package com.leetcode;

import java.util.*;

public class _2248_Intersection_of_Multiple_Arrays {


    public List<Integer> intersection(int[][] nums) {

        List<Integer> response = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == nums.length) {
                response.add(key);
            }

        }

        Collections.sort(response);

        return response;
    }


}
