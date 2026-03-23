package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.

Return the maximum score you can get by erasing exactly one subarray.

An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).



Example 1:

Input: nums = [4,2,4,5,6]
Output: 17
Explanation: The optimal subarray here is [2,4,5,6].
Example 2:

Input: nums = [5,2,1,2,5,2,1,2,5]
Output: 8
Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 */
public class _1695_Maximum_Erasure_Value {


    public int maximumUniqueSubarray(int[] nums) {

        int suma = 0;
        int max = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            suma += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.get(nums[i]) > 1) {
                suma -= nums[left];

                int newValue = map.get(nums[left]) - 1;
                map.put(nums[left], newValue);
                if (newValue <= 0) {
                    map.remove(newValue);
                }
                left++;
            }

            max = Math.max(max, suma);
        }

        return max;
    }


}
