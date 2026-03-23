package com.leetcode;

import java.util.*;

public class _2101_Detonate_the_Maximum_Bombs {

    public int maximumDetonation(int[][] bombs) {

        int max = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < bombs.length; i++) {

            map.put(i, new ArrayList<>());

            for (int j = 0; j < bombs.length; j++) {
                if (i == j) continue;

                double distancia = calcularDistancia(bombs[i][0], bombs[i][1], bombs[j][0], bombs[j][1]);
                if (distancia <= bombs[i][2]) {
                    map.get(i).add(j);
                }
            }
        }

        for (int i = 0; i < bombs.length; i++) {

            Queue<Integer> colaXBomba = new LinkedList<>();
            Set<Integer> set = new HashSet<>();

            colaXBomba.add(i);
            set.add(i);

            while (!colaXBomba.isEmpty()) {

                List<Integer> bombas = map.get(colaXBomba.poll());

                for (Integer bomba : bombas) {
                    if (!set.contains(bomba)) {
                        set.add(bomba);
                        colaXBomba.add(bomba);
                    }
                }
            }

            max = Math.max(max, set.size());
        }


        return max;
    }


    private double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
