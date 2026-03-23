package com.leetcode;

public class _3289_The_Two_Sneaky_Numbers_of_Digitville {


    public int[] getSneakyNumbers(int[] nums) {

        int[] array = new int[100];
        int[] response = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            array[nums[i]]++;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                response[index++] = i;
            }
        }

        return response;
    }


}
