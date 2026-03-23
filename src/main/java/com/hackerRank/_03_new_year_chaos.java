package com.hackerRank;

import java.util.List;

public class _03_new_year_chaos {

    public void minimumBribes(List<Integer> q) {

        int count = 0;

        int u = 1, v = 2;
        for (int i = 0; i < q.size(); i++) {
            int w = i + 3;

            if (q.get(i) > i + 3) {
                System.out.println("Too chaotic");
                return;
            }


            if (q.get(i) == w) {
                count += 2;
            } else if (q.get(i) == v) {
                count += 1;
                v = w;
            } else if (q.get(i) == u) {
                u = v;
                v = w;
            }

        }


        System.out.printf("%d\n", count);
    }


}




