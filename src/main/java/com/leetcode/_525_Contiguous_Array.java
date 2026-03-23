package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _525_Contiguous_Array {


    public int findMaxLength(int[] nums) {

        int suma = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            suma += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(suma)) {
                max = Math.max(max, i - map.get(suma));
            } else {
                map.put(suma, i);
            }
        }

        return max;
    }


}
