package com.leetcode;

import java.util.*;

/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.



Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */
public class _239_Sliding_Window_Maximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1 || k == 1) return nums;

        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && i - k + 1 > stack.peekFirst()) {
                stack.pollFirst();
            }

            while (!stack.isEmpty() && nums[stack.peekLast()] < nums[i]) {
                stack.pollLast();
            }

            stack.add(i);

            if (i + 1 >= k) {
                ans[i - k + 1] = nums[stack.getFirst()];
            }

        }

        return ans;
    }
}
