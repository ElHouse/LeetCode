package com.leetcode;

public class _3190_Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {


    public int minimumOperations(int[] nums) {

        int total = 0;

        for (int num : nums) {
            if (num % 3 != 0) {
                total++;
            }
        }

        return total;
    }

}
