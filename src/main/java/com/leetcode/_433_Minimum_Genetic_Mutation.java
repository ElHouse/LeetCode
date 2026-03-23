package com.leetcode;

import java.util.*;

public class _433_Minimum_Genetic_Mutation {

    private static class Movement {

        String gene;
        int step;

        public Movement(String gene, int step) {
            this.gene = gene;
            this.step = step;
        }
    }


    public int minMutation(String startGene, String endGene, String[] bank) {

        if (startGene.equals(endGene)) return 1;

        Queue<Movement> cola = new LinkedList<>();
        Set<String> visit = new HashSet<>();

        cola.add(new Movement(startGene, 0));

        List<String> list = new ArrayList<>(Arrays.asList(bank));

        while (!cola.isEmpty()) {

            Movement current = cola.poll();
            Iterator<String> iter = list.iterator();

            for (Iterator<String> it = iter; it.hasNext(); ) {

                String gene = it.next();

                if (!visit.contains(gene) && valid(gene, current.gene)) {

                    visit.add(gene);

                    if (endGene.equals(gene)) {
                        return current.step + 1;
                    }

                    cola.add(new Movement(gene, current.step + 1));
                    it.remove();
                }
            }
        }

        return -1;
    }


    private boolean valid(String A, String B) {

        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
