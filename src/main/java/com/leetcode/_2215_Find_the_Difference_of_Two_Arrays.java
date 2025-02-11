package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2215_Find_the_Difference_of_Two_Arrays {
/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].

*/

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> response = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        response.add(lista1);
        response.add(lista2);

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while (true) {

            if (i >= nums1.length && j >= nums2.length) {
                break;
            }


            if (i >= nums1.length && j < nums2.length) {

                for (int k = j; k < nums2.length; k++) {
                    int num2 = nums2[k];
                    lista2.add(nums2[k]);
                    while (k + 1 < nums2.length && num2 == nums2[k + 1]) {
                        k++;
                    }
                }

                break;
            } else if (i < nums1.length && j >= nums2.length) {

                for (int k = i; k < nums1.length; k++) {
                    int num1 = nums1[k];
                    lista1.add(nums1[k]);
                    while (k + 1 < nums1.length && num1 == nums1[k + 1]) {
                        k++;
                    }
                }
                break;
            } else {

                int num1 = nums1[i];
                int num2 = nums2[j];

                if (num1 > num2) {
                    j++;
                    lista2.add(num2);
                    while (j < nums2.length && num2 == nums2[j]) {
                        j++;
                    }
                } else if (num1 < num2) {
                    i++;
                    lista1.add(num1);
                    while (i < nums1.length && num1 == nums1[i]) {
                        i++;
                    }
                } else {
                    i++;
                    j++;
                    while (i < nums1.length && num1 == nums1[i]) {
                        i++;
                    }
                    while (j < nums2.length && num2 == nums2[j]) {
                        j++;
                    }
                }

            }

        }


        return response;
    }


}
