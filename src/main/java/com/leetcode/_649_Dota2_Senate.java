package com.leetcode;

import java.util.*;

public class _649_Dota2_Senate {


    public String predictPartyVictory(String senate) {

        Queue<Integer> cola = new LinkedList<>();


        for (int i = 0; i < senate.length(); i++) {
            cola.add((int) senate.charAt(i));
        }

        cola.add(null);


        int countRemoveR = 0;
        int countRemoveD = 0;

        while (true) {

            int countR = 0;
            int countD = 0;

            while (true) {

                Integer aux = cola.poll();
                if (aux == null) break;

                if (aux == 82) {
                    countR++;
                    if (countRemoveR > 0) {
                        countRemoveR--;
                    } else {
                        cola.add(aux);
                        countRemoveD++;
                    }
                } else {
                    countD++;
                    if (countRemoveD > 0) {
                        countRemoveD--;
                    } else {
                        cola.add(aux);
                        countRemoveR++;
                    }
                }

            }

            cola.add(null);

            if (countR > 0 && countD == 0) {
                return "Radiant";
            }
            if (countD > 0 && countR == 0) {
                return "Dire";
            }
        }


    }


}
