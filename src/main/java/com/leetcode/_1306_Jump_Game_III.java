package com.leetcode;

import java.util.*;

public class _1306_Jump_Game_III {

    public boolean canReach(int[] arr, int start) {

        if (arr[start] == 0) return true;

        int n = arr.length;

        boolean[] visit = new boolean[arr.length];
        Queue<Integer> cola = new LinkedList<>();
        Map<Integer, List<Integer>> routes = new HashMap<>();

        visit[start] = true;
        cola.add(start);

        for (int i = 0; i < n; i++) {

            int x = i + arr[i];
            int y = i - arr[i];

            if (!routes.containsKey(i)) {
                routes.put(i, new ArrayList<>());
            }

            if (x < n) routes.get(i).add(x);
            if (y >= 0) routes.get(i).add(y);
        }

        while (!cola.isEmpty()) {

            int index = cola.poll();
            List<Integer> route = routes.get(index);

            for (Integer r : route) {

                if (!visit[r]) {
                    visit[r] = true;
                    if (arr[r] == 0) {
                        return true;
                    }
                    cola.add(r);
                }
            }
        }

        return false;
    }


}
