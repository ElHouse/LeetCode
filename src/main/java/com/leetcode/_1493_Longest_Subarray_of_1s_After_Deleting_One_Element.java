package com.leetcode;

public class _1493_Longest_Subarray_of_1s_After_Deleting_One_Element {

    /*


    Given a binary array nums, you should delete one element from it.

    Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.



    Example 1:

    Input: nums = [1,1,0,1]
    Output: 3
    Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
    Example 2:

    Input: nums = [0,1,1,1,0,1,1,0,1]
    Output: 5
    Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
    Example 3:

    Input: nums = [1,1,1]
    Output: 2
    Explanation: You must delete one element.


     */


    public int longestSubarray(int[] nums) {

        int max = 0;
        int count = 0;
        int skip = -1;


        for (int i = 0; i < nums.length; ) {

            count = 0;
            skip = -1;
            boolean parado = false;
            for (int j = i; j < nums.length; j++) {

                int num = nums[j];
                if (num == 0) {
                    if (skip == -1) {
                        skip = j;
                    } else {
                        i = skip + 1;
                        parado = true;
                        break;
                    }
                } else {
                    count++;
                }

            }

            if (count > max) {
                max = count;
            }

            if (!parado) {
                break;
            }


        }

        if (count > max) {
            max = count;
        }

        return skip == -1 ? (max > 0) ? max - 1 : 0 : max;
    }
}
