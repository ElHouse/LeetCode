package com.hackerRank;

import java.util.List;

public class _44_Remove_Elements_Within_K_Distance {


    public int debounceTimestamps(List<Integer> timestamps, int K) {

        if(timestamps.isEmpty()) return 0;
        if(timestamps.size() == 1) return 1;

        int count = 0;
        int prev = timestamps.get(0);

        for (int i = 1; i < timestamps.size(); i++) {

            int curr = timestamps.get(i);

            if (curr - prev < K) {
                count++;
            }else {
                prev = timestamps.get(i);
            }
        }

        return timestamps.size() - count;
    }


    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int count = 0;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            if (curr - prev <= val) {
                count++;
            }else {
                prev =  nums[i];
            }
        }

        return nums.length - count;
    }
}
