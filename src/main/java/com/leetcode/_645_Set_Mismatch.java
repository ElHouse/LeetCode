package com.leetcode;

import java.util.Arrays;


public class _645_Set_Mismatch {

    public int[] findErrorNums(int[] nums) {
        if (nums == null) return new int[2];

        int[] answer = new int[2];
        int numberNotFound = -1;
        int numberRepeated = -1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (numberNotFound == -1 && nums[i] != i + 1) {
                numberNotFound = i + 1;
            }

            if (numberRepeated == -1 && nums[i] == nums[i + 1]) {
                numberRepeated = nums[i];
            }
        }

        answer[0] = numberRepeated;
        answer[1] = numberNotFound;

        return answer;
    }

}
