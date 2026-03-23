package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _2206_Divide_Array_Into_Equal_Pairs {

    public boolean divideArray(int[] nums) {

        if (nums.length % 2 != 0) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        for (Integer key : map.keySet()) {

            int count = map.get(key);
            if (count % 2 != 0) {
                return false;
            }
        }


        return true;
    }

}
