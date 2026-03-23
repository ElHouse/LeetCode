package com.hackerRank;

import java.util.List;

public class _42_Search_Timestamp_in_Rotated_LogTimestamps {


    public int searchRotatedTimestamps(List<Integer> nums, int target) {

        if (nums.isEmpty()) return -1;

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {


            int a = Math.abs(target - nums.get(left));
            int b = Math.abs(target - nums.get(right));

            int mid = left + (right - left) / 2;

            if (nums.get(mid) == target) {
                return mid;
            }

            if (a < b) {
                right = mid;
            } else {
                left = mid + 1;
            }


        }

        return nums.get(left) == target ? left : -1;
    }


}
