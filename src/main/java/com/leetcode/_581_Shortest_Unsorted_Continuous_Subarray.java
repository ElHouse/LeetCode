package com.leetcode;

import java.util.Stack;

/**
 * Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.
 * <p>
 * Return the shortest such subarray and output its length.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,6,4,8,10,9,15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 0
 */
public class _581_Shortest_Unsorted_Continuous_Subarray {


    public int findUnsortedSubarray(int[] nums) {

        int num = nums[0];
        int min = nums.length;
        int max = 0;
        boolean cambio = false;

        for (int i = nums.length - 1; i >= 0; i--) {
            num = nums[i];

            boolean repeated = false;
            int count = 0;
            int originalI = i;

            while (i - 1 >= 0 && nums[i - 1] == num) {
                i--;
                repeated = true;
            }

            while (i - 1 >= 0 && num < nums[i - 1]) {
                count++;
                i--;
            }

            if (count > 0) {
                cambio = true;
                System.out.println("cambio");
                if (repeated) {
                    min = Math.min(min, i);
                } else {

                    min = Math.min(min, originalI - count);
                }
                max = Math.max(max, originalI);
            }

        }


        System.out.println(max);
        System.out.println(min);

        return !cambio ? 0 : max - min + 1;
    }

    public int findUnsortedSubarray2(int[] nums) {

        if (nums.length == 1) return 0;
        boolean needSort = false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Stack<Integer> mono = new Stack<>();

        mono.add(0);

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];
            boolean change = false;
            int aux = -1;
            int initI = i;

            while (i + 1 < nums.length && nums[i + 1] == num) {
                i++;
            }

            while (!mono.isEmpty() && nums[mono.peek()] > num) {
                change = true;
                aux = mono.pop();
            }

            if (change) {
                needSort = true;
                max = Math.max(max, initI);
                min = Math.min(min, aux);
            }

            mono.add(i);
        }

        return mono.size() == 1 ?
                nums.length :
                !needSort ? 0
                        : max - min + 1;
    }


}
