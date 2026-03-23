package com.hackerRank;

import java.util.List;

public class _38_Count_Number_Pairs {


    public int countAffordablePairs(List<Integer> prices, int budget) {

        if (budget < 0 || prices == null || prices.size() < 2) return 0;

        int count = 0;
        int size = prices.size();

        for (int i = 0; i < size; i++) {
            int index = binarySearch(i+1, size, prices, prices.get(i), budget);
             count += Math.max((index - i), 0);
        }

        return count;
    }


    private static int binarySearch(int l, int r, List<Integer> prices, int val, int target) {

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (prices.get(mid) + val > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l-1;
    }


}
