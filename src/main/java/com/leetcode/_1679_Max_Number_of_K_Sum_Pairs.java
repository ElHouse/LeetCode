package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1679_Max_Number_of_K_Sum_Pairs {
/*

You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.



Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 109
1 <= k <= 109
 */


    public int maxOperations(int[] nums, int k) {

        if (nums == null) return 0;

        int count = 0;
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int aux = k - nums[i];

            if (cache.containsKey(nums[i])) {

                int repeatedTimes = cache.get(nums[i]);
                if (repeatedTimes == 1) {
                    cache.remove(nums[i]);
                } else {
                    cache.put(nums[i], repeatedTimes - 1);
                }
                count++;
            } else {
                cache.put(aux, cache.getOrDefault(aux, 0) + 1);
            }

        }

        return count;
    }


}
