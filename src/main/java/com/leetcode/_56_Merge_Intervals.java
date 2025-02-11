package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_Merge_Intervals {

    /*
    Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

        Example 1:

        Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]
        Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
        Example 2:

        Input: intervals = [[1,4],[4,5]]
        Output: [[1,5]]
        Explanation: Intervals [1,4] and [4,5] are considered overlapping.
     */

    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) return null;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> auxList = new ArrayList<>();
        int auxA;
        int auxB;

        for (int i = 0; i < intervals.length; i++) {

            auxA = intervals[i][0];
            auxB = intervals[i][1];

            while (i + 1 < intervals.length && (
                    (auxA <= intervals[i + 1][0] && intervals[i + 1][0] <= auxB) ||
                            (auxA <= intervals[i + 1][1] && intervals[i + 1][1] <= auxB) ||
                            (intervals[i + 1][0] <= auxA && auxA <= intervals[i + 1][1]) ||
                            (intervals[i + 1][0] <= auxB && auxB <= intervals[i + 1][1])
            )) {
                auxA = Math.min(auxA, intervals[i + 1][0]);
                auxB = Math.max(auxB, intervals[i + 1][1]);

                i++;
            }

            auxList.add(new int[]{auxA, auxB});
        }

        int[][] response = new int[auxList.size()][2];

        for (int i = 0; i < auxList.size(); i++) {
            response[i] = auxList.get(i);
        }


        return response;
    }


}
