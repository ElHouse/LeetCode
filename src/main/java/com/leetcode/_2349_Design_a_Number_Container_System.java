package com.leetcode;

import java.util.*;

public class _2349_Design_a_Number_Container_System {

    class NumberContainers {

        private final Map<Integer, Integer> mapIndexValue;
        private final Map<Integer, TreeSet<Integer>> mapValueIndexes;

        public NumberContainers() {
            mapIndexValue = new HashMap<>();
            mapValueIndexes = new HashMap<>();
        }

        public void change(int index, int number) {
            if (mapIndexValue.containsKey(index)) {
                int numberAux =  mapIndexValue.get(index);
                mapValueIndexes.get(numberAux).remove(index );
            }

            if (!mapValueIndexes.containsKey(number)) {
                mapValueIndexes.put(number, new TreeSet<>());
            }

            mapIndexValue.put(index, number);
            mapValueIndexes.get(number).add(index);
        }

        public int find(int number) {

            return mapValueIndexes.containsKey(number) && !mapValueIndexes.get(number).isEmpty() ? mapValueIndexes.get(number).getFirst() : -1;
        }
    }


}
