package com.leetcode;

public class _80_Remove_Duplicates_from_Sorted_Array_II {


    public int removeDuplicates(int[] nums) {


        int prev = nums[0];
        int count = 1;
        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == prev) {
                count++;
                if (count < 3) {
                    nums[j] = nums[i];
                    j++;
                }
            } else {
                nums[j] = nums[i];
                prev = nums[i];
                count = 1;
                j++;
            }
        }

        if (count == 2 && j < nums.length) {
            nums[j] = prev;
        }

        return j;
    }


}
