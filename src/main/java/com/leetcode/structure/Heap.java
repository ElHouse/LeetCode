package com.leetcode.structure;

public class Heap {

    private int[] heap;
    private boolean isMax;

    public Heap(boolean isMax) {
        this.heap = new int[0];
        this.isMax = isMax;
    }

    public void sort() {

        for (int i = heap.length - 1; i >= 0; i--) {

            int parent = i % 2 == 0 ? ((i - 1) / 2) : i / 2;

            if(isMax){
                if (heap[parent] < heap[i]) {// for min, chnage to “>”
                    int aux = heap[i];
                    heap[i] = heap[parent];
                    heap[parent] = aux;
                }
            }else{
                if (heap[parent] > heap[i]) {
                    int aux = heap[i];
                    heap[i] = heap[parent];
                    heap[parent] = aux;
                }
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

    public void addElement(int element) {
        int[] aux = new int[heap.length + 1];
        for (int i = 0; i < heap.length; i++) {
            aux[i] = heap[i];
        }
        aux[heap.length] = element;
        heap = aux;
        sort();
    }



    public void printHeap() {

        if(heap.length == 0) System.out.println("Vacio");

        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i]+"->");
        }
        System.out.println();

    }

}
