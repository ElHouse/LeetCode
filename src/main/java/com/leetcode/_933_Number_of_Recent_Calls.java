package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _933_Number_of_Recent_Calls {
/*
You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.



Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
 */

    private final int[] range = new int[2];
    List<Integer> list;

    public _933_Number_of_Recent_Calls() {
        range[0] = -3000;
        list = new ArrayList<>();
    }

    public int ping(int t) {

        list.add(t);

        range[0] = -3000 + t;
        range[1] = t;

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {

            int aux = iter.next();
            if (!(range[0] <= aux && aux <= range[1])) {
                iter.remove();
            }
        }

        return list.size();
    }


}
