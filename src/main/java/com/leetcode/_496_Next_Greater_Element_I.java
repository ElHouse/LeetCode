package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.



Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */
public class _496_Next_Greater_Element_I {


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        Map<Integer, Integer> mapNums1PositionInNums2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            mapNums1PositionInNums2.put(nums1[i], -1);
        }

        int[] monotonicNums2 = monotonic(nums2, mapNums1PositionInNums2);

        for (int i = 0; i < nums1.length; i++) {

            int index = mapNums1PositionInNums2.get(nums1[i]);

            if (index >= 0) {
                int indexNums2 = monotonicNums2[index];
                result[i] = nums2[indexNums2 + index];
            }else {
                result[i] = -1;
            }
        }

        return result;
    }


    private int[] monotonic(int[] nums2, Map<Integer, Integer> mapNums1PositionInNums2) {

        int[] result = new int[nums2.length];
        Stack<Integer> pila = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < nums2.length; i++) {

            while (!pila.isEmpty() && nums2[pila.peek()] < nums2[i]) {
                int j = pila.pop();
                result[j] = i - j;
                if (mapNums1PositionInNums2.containsKey(nums2[j])) {
                    mapNums1PositionInNums2.put(nums2[j], j);
                }
            }
            pila.add(i);
        }

        return result;
    }


}
