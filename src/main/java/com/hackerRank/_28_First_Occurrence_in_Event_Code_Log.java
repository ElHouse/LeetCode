package com.hackerRank;

import java.util.List;

public class _28_First_Occurrence_in_Event_Code_Log {

    public int findFirstOccurrence(List<Integer> nums, int target) {

        if (nums == null || nums.isEmpty()) return -1;

        int left = 0;
        int right = nums.size() - 1;


        while (left < right) {

            int mid = left + (right - left) / 2;
            if (nums.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums.get(left) == target ? left : -1;
    }


}
