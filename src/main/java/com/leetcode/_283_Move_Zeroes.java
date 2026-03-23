package com.leetcode;

import java.util.Arrays;

public class _283_Move_Zeroes {



    public void moveZeroes(int[] nums) {

        int left = 0;
        for (int right = 0; right < nums.length ; right++) {

            int aux = nums[right];

            if(aux == 0){
                left = right+1;
                while (aux == 0 && left< nums.length){
                    aux = nums[left];
                    left++;

                    if(aux != 0){
                        nums[right] = aux;
                        nums[left-1] = 0;
                    }
                }

            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes2(int[] nums) {

        if (nums == null) return;
        if (nums.length <= 1) return;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {

                        nums[i] = nums[j];
                        nums[j] = 0;
                        j = nums.length;

                    }
                }
            }
        }
    }

}
