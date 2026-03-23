package com.leetcode;

import java.util.*;

public class _2542_Maximum_Subsequence_Score {


    public long maxScore(int[] nums1, int[] nums2, int k) {

        long result = 0;

        ListaLimitada nums1Limitada = new ListaLimitada(k);
        ListaLimitada nums2Limitada = new ListaLimitada(nums2.length);


        for (int i = 0; i < nums1.length; i++) {
            nums1Limitada.add(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2Limitada.add(nums2[i], i);
        }

        nums1Limitada.getData(nums2);
        NumberIndex aux = null;

        while (nums2Limitada.size() > 0) {

            aux = nums2Limitada.poll();
            long suma;
            if (nums1Limitada.containsInPositions(aux.posicion)) {
                suma = nums1Limitada.getSuma() * nums1Limitada.getMinPosition();
            } else {
                suma = ((nums1Limitada.getSumaN1() + nums1[aux.posicion]) * aux.valor);
            }

            if (result < suma) {
                result = suma;
            }

        }


        return result;
    }

    private class ListaLimitada {

        private final PriorityQueue<NumberIndex> minHeap;
        private final int maxSize;
        private long suma;
        private long sumaN1;
        private final List<Integer> positions = new ArrayList<>();
        private int minPosition = Integer.MAX_VALUE;

        public ListaLimitada(int maxSize) {
            this.maxSize = maxSize;
            this.minHeap = new PriorityQueue<>();
        }

        public void add(int num, int index) {
            if (minHeap.size() < maxSize) {
                minHeap.add(new NumberIndex(num, index));
            } else if (num > peek()) {
                minHeap.poll();
                minHeap.add(new NumberIndex(num, index));
            }
        }

        public Integer peek() {
            if (minHeap.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            return minHeap.peek().valor;
        }

        public int size() {
            return minHeap.size();
        }

        public NumberIndex poll() {
            return this.minHeap.poll();
        }

        public long getSuma() {
            return suma;
        }

        public long getSumaN1() {
            return sumaN1;
        }

        public long getMinPosition() {
            return minPosition;
        }

        public boolean containsInPositions(int position) {
            return this.positions.contains(position);
        }

        public void getData(int[] nums2) {

            int first = minHeap.peek().valor;

            while (!minHeap.isEmpty()) {
                NumberIndex aux = minHeap.poll();
                suma += aux.valor;
                positions.add(aux.posicion);
                minPosition = Math.min(minPosition, nums2[aux.posicion]);
                if (minHeap.isEmpty()) {
                    sumaN1 = suma - first;
                }
            }

        }


        @Override
        public String toString() {
            return minHeap.toString();
        }
    }


    private class NumberIndex implements Comparable<NumberIndex> {

        int valor;
        int posicion;

        public NumberIndex(int valor, int posicion) {
            this.valor = valor;
            this.posicion = posicion;
        }

        @Override
        public String toString() {
            return "NumberIndex{" +
                    "valor=" + valor +
                    ", posicion=" + posicion +
                    '}';
        }

        @Override
        public int compareTo(NumberIndex o) {

            if (o.valor != this.valor) {
                return this.valor - o.valor;
            } else {
                return this.posicion - o.posicion;
            }
        }
    }

}
