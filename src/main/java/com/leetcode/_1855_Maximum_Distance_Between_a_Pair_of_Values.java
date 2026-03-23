package com.leetcode;

public class _1855_Maximum_Distance_Between_a_Pair_of_Values {


    public int maxDistance(int[] nums1, int[] nums2) {

        int dist = 0;

        for (int i = 0; i < nums2.length; i++) {

            int distFromI = maxDist(nums1, nums2, i);
            dist = Math.max(dist, distFromI);
        }

        return dist;
    }


    public int maxDist(int[] nums1, int[] nums2, int j) {

        int dist = 0;
        int left = 0;
        int right = Math.min(j, nums1.length-1);

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums2[j] >= nums1[mid]) {
                dist = Math.max(dist, j - mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return dist;
    }

}
