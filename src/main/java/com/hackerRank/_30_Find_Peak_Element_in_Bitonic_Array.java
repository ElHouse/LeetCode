package com.hackerRank;

import java.util.List;

public class _30_Find_Peak_Element_in_Bitonic_Array {


    public int findPeakIndex(List<Integer> counts) {

        if (counts == null || counts.isEmpty()) {
            return 0;
        }

        if (counts.size() == 1) {
            return counts.get(0);
        }

        int left = 0;
        int right = counts.size() - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (counts.get(mid) > counts.get(mid + 1)) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }
}
