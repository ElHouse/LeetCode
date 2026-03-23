package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _560_Subarray_Sum_Equals_K {

    public int subarraySum(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] += nums[i] + prefix[i - 1];
        }

        map.put(nums[0], 0);
        if(nums[0] == k) {
            count++;
        }

        for (int i = 1; i < nums.length; i++) {

            int search = k - nums[i];

            if(nums[i] == k) {
                count++;
            }else if (map.containsKey(search)) {
                int index = map.get(search);
                int sum = prefix[i] - prefix[index] + nums[index];
                if(sum == k){
                    count++;
                }
            }

            map.put(nums[i], i);
        }

        return count;
    }

    public int subarraySum2(int[] nums, int k) {

        int l = 0;
        int count = 0;
        int suma = nums[0];

        for (int r = 1; r < nums.length; r++) {

            suma += nums[r];

            while (suma > k) {
                suma -= nums[l];
                l++;
            }

            if (suma == k) {
                count++;
            }
        }

        return count;
    }
}
