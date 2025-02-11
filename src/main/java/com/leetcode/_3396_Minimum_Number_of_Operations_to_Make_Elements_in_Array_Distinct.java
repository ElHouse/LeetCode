package com.leetcode;

import java.util.HashSet;

public class _3396_Minimum_Number_of_Operations_to_Make_Elements_in_Array_Distinct {

    public int minimumOperations(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int response = 0;

        while (true) {

            boolean hasRepetedNumbers = false;
            for (int i = 0; i < nums.length; i++) {

                if (set.contains(nums[i])) {
                    hasRepetedNumbers = true;
                    set = new HashSet<>();
                    break;
                } else {
                    set.add(nums[i]);
                }
            }

            if (!hasRepetedNumbers) {
                return response;
            }


            if(nums.length  >= 3){
                int[] auxNums = new int[nums.length - 3];

                for (int i = 0, j = 0; i < nums.length; i++) {
                    if (i < 3) continue;

                    auxNums[j++] = nums[i];
                }
                nums = auxNums;
            }else{
                nums = new int[0];
            }

            response++;
        }
    }

}
