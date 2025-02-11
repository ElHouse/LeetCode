package com.leetcode.pendientes;

public class _703_Kth_Largest_Element_in_a_Stream {


    class Heap {
        private int[] heap;

        public Heap(int[] heap) {

            this.heap = new int[0];
            for (Integer i : heap) {
                addElement(i);
            }
        }

        public void addElement(int element) {
            int[] aux = new int[heap.length + 1];
            for (int i = 0; i < heap.length; i++) {
                aux[i] = heap[i];
            }
            aux[heap.length] = element;
            heap = aux;
            sort();
        }

        private void sort() {

            for (int i = heap.length - 1; i >= 0; i--) {

                int parent = i % 2 == 0 ? ((i - 1) / 2) : i / 2;

                if (heap[parent] < heap[i]) {
                    int aux = heap[i];
                    heap[i] = heap[parent];
                    heap[parent] = aux;
                }
            }
        }

        public int getElement() {

            if (heap.length == 0) return 0;

            int[] aux = new int[heap.length - 1];
            int max = heap[0];

            for (int i = 1; i < heap.length; i++) {
                aux[i - 1] = heap[i];
            }

            heap = aux;
            sort();
            return max;
        }
    }

    private int k = 0;
    private Heap heap;

    public _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.heap = new Heap(nums);
        this.k = k;
    }

    public int add(int val) {

        heap.addElement(val);

        int[] auxArray = new int[k - 1];

        for (int i = 0; i < k-1; i++) {
            auxArray[i] = heap.getElement();
        }

        int aux = heap.getElement();

        for (int i = 0; i < auxArray.length; i++) {
            heap.addElement(auxArray[i]);
        }

        heap.addElement(aux);

        return aux;
    }

}
