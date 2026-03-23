package com.hackerRank;

import java.util.List;

public class _34_Lookup_with_Binary_Search {

    public int binarySearch(List<Integer> nums, int target) {

        if(nums == null || nums.isEmpty()){
            return -1;
        }

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (target == nums.get(mid)) {
                return mid;
            }

            if (nums.get(mid) > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums.get(left) == target) {
            return left;
        }

        return -1;

    }
}
