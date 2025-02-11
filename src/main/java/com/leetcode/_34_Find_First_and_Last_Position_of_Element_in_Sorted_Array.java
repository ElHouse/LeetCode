package com.leetcode;

public class _34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {


    public int[] searchRange(int[] nums, int target) {

        int[] response = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return response;
        if (nums.length == 1) {

            if (nums[0] == target) {
                response[0] = 0;
                response[1] = 0;
                return response;
            }
            return response;
        }


        int a = 0;
        int b = nums.length - 1;
        int mitad = (a + b + 1) / 2;

        //Primer numero igual a target
        while (a + 1 != b) {

            if (nums[mitad] == target) {

                if ((nums[mitad - 1] == target)) {
                    b = mitad;
                } else {
                    a = mitad;
                    break;
                }
            } else if (nums[mitad] < target) {
                a = mitad;
            } else {
                b = mitad;
            }

            mitad = (a + b + 1) / 2;
        }

        if (nums[a] != target) {

            if (nums[b] == target) {
                response[0] = b;
                response[1] = b;

                return response;
            }

            return response;
        }

        int ax = a;
        b = nums.length - 1;

        //segundo numero igual a target
        while (a + 1 != b) {

            if (nums[mitad] == target) {

                if ((nums[mitad + 1] == target)) {
                    a = mitad;
                } else {
                    b = mitad;
                    break;
                }
            } else if (nums[mitad] < target) {
                a = mitad;
            } else {
                b = mitad;
            }

            mitad = (a + b + 1) / 2;
        }
        if (nums[b] != target) {
            response[0] = ax;
            response[1] = ax;

            return response;
        }

        response[0] = ax;
        response[1] = b;

        return response;
    }
}
