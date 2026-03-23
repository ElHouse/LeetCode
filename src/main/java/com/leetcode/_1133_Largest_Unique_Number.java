package com.leetcode;

import java.util.*;

/*
Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.



Example 1:

Input: nums = [5,7,3,9,4,9,8,3,1]
Output: 8
Explanation: The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it is the answer.
Example 2:

Input: nums = [9,9,8,8]
Output: -1
Explanation: There is no number that occurs only once.


Constraints:

1 <= nums.length <= 2000
0 <= nums[i] <= 1000
 */
public class _1133_Largest_Unique_Number {

    public int largestUniqueNumber(int[] nums) {

        int response = -1;
        Map<Integer, Integer> counting = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            counting.put(nums[i], counting.getOrDefault(nums[i], 0) + 1);
        }

        for(int key: counting.keySet()){

            int count= counting.get(key);
            if(count == 1){
                response = Math.max(response, key);
            }
        }

        return response;
    }

}
