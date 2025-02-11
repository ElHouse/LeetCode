package com.leetcode;

public class _494_Target_Sum {

    private int result = 0;

    public int findTargetSumWays(int[] nums, int target) {
        result = 0;

        recursive(nums, target, 0, 0);
        return result;
    }


    private void recursive(int[] nums, int target, int index, int sum) {

        if (nums.length - 1 == index) {

            int aux = sum;
            sum = aux + nums[index];
            if (target == sum) {
                result++;
            }

            sum = aux - nums[index];
            if (target == sum) {
                result++;
            }
            return;
        }

        //sumar
        int sumAux = sum + nums[index];
        recursive(nums, target, index + 1, sumAux);

        //restar
        sumAux = sum - nums[index];
        recursive(nums, target, index + 1, sumAux);

    }


}
