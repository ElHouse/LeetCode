package com.leetcode;

public class _215_Kth_Largest_Element_in_an_Array {


    private int[] array = new int[0];

    private void sort() {

        for (int i = array.length - 1; i >=0; i--) {

            int parent = i % 2 == 0 ? ((i - 1) / 2) : i / 2;

            if (array[parent] < array[i]) {
                int aux = array[i];
                array[i] = array[parent];
                array[parent] = aux;
            }
        }
    }

    private int get() {

        if (array.length == 0) return -1;

        int[] auxArray = new int[array.length - 1];
        int aux = array[0];

        for (int i = 1; i < array.length; i++) {
            auxArray[i-1] = array[i];
        }

        array = auxArray;

        sort();

        return aux;
    }


    public int findKthLargest(int[] nums, int k) {

        array = nums;
        sort();

        for (int i = 0; i < k - 1; i++) {
            int aux = get();
            System.out.println(aux);
        }

        return get();
    }


}
