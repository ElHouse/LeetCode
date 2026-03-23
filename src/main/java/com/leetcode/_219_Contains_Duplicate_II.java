package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _219_Contains_Duplicate_II {


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for (int key : map.keySet()) {

            List<Integer> list = map.get(key).stream().sorted().toList();

            if (list.size() > 1) {
                for (int i = 0, j = 1; j < list.size(); i++, j++) {
                    if (Math.abs(list.get(i) - list.get(j)) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
