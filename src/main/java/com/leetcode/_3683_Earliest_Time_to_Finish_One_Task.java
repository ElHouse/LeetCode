package com.leetcode;

public class _3683_Earliest_Time_to_Finish_One_Task {


    public int earliestTime(int[][] tasks) {

        int response = Integer.MAX_VALUE;

        for (int[] task : tasks) {
            response = Math.min(response, task[0] + task[1]);
        }

        return (response == Integer.MAX_VALUE) ? 0 : response;
    }


}
