package com.leetcode;

import java.util.PriorityQueue;

public class _973_K_Closest_Points_to_Origin {

    public int[][] kClosest(int[][] points, int k) {

        int[][] response = new int[k][2];

        if (points == null) return response;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {

            double distA = distanciaToOrigin(a[0], a[1]);
            double distB = distanciaToOrigin(b[0], b[1]);

            if (distB > distA) {
                return 1;
            } else if (distB < distA) {
                return -1;
            }
            return 0;
        });


        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = 0; i < k; i++) {

            int[] aux = pq.isEmpty() ? new int[]{0, 0} : pq.poll();
            response[i][0] = aux[0];
            response[i][1] = aux[1];
        }

        return response;
    }


    private double distanciaToOrigin(int x, int y) {

        double a = Math.pow(x, 2);
        double b = Math.pow(y, 2);

        return Math.sqrt(a + b);

    }

}
