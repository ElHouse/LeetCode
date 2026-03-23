package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _57_Insert_Interval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][]{
                    {newInterval[0], newInterval[1]}
            };
        }

        List<Integer> cache = new ArrayList<>();
        boolean cambio = false;

        if ( newInterval[1] < intervals[0][0]  && newInterval[1] < intervals[0][1]) {

        }

        for (int i = 0; i < intervals.length; i++) {

            int min = newInterval[0];
            int max = newInterval[1];

            if (intervals[i][0] <= min && min <= intervals[i][1]) {
                cambio = true;
                int newMin = Math.min(min, intervals[i][0]);

                int j = i;

                for (; j < intervals.length; j++) {
                    if (intervals[j][0] <= max && max <= intervals[j][1]) {
                        break;
                    }
                }
                if (j >= intervals.length) j--;

                if (intervals[j][0] > max) j = i;

                int newMax = Math.max(max, intervals[j][1]);


                i = j;
                cache.add(newMin);
                cache.add(newMax);
            } else {
                cache.add(intervals[i][0]);
                cache.add(intervals[i][1]);
            }

        }

        if (cambio) {
            int min = newInterval[0];
            int max = newInterval[1];
            cache.add(min);
            cache.add(max);
        }

        int j = 0;
        int[][] response = new int[cache.size() >>> 1][2];

        for (int i = 0; i < (cache.size() >>> 1); i++) {
            response[i][0] = cache.get(j++);
            response[i][1] = cache.get(j++);
        }

        System.out.println(Arrays.deepToString(response));

        return response;
    }

}
