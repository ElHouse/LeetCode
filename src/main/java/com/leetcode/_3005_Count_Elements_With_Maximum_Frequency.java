package com.leetcode;

import java.util.*;
/*
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.



Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 */
public class _3005_Count_Elements_With_Maximum_Frequency {


    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> mapa = new HashMap<>();
        int maxFreq = 0;
        int result = 0;

        for (int num : nums) {
            int freq = mapa.getOrDefault(num, 0) + 1;
            maxFreq = Math.max(maxFreq, freq);
            mapa.put(num, freq);
        }

        for (int key : mapa.keySet()) {
            if (mapa.get(key) == maxFreq) {
                result++;
            }
        }

        return result*maxFreq;
    }


}
