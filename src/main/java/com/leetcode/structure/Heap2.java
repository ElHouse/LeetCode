package com.leetcode.structure;

import java.util.PriorityQueue;

public class Heap2 {

    private int[] heap;
//borrar? el         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a); lo hace todo mejor y ya viene por defecto

    public int removeMax(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);

        int n = nums.length;
        int max = nums[0];
        int i = 0;
        while (i < k) {
            max = nums[0];
            nums[0] = nums[n - 1];
            heapify(nums, 0, n);
            n--;
            i++;
        }
        return max;
    }

    public void buildHeap(int[] nums) {
        int n = nums.length;

        for (int i = n / 2; i >= 0; i--) {
            heapify(nums, i, n);
        }
    }

    public void heapify(int[] nums, int i, int n) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        System.out.println("###############  " + i + "---N >" + n);

        System.out.println("l>" + l);
        System.out.println("r>" + r);


        int max = i;

        if (l < n && nums[l] > nums[max]) max = l;
        if (r < n && nums[r] > nums[max]) max = r;

        System.out.println("max>" + max);


        if (max != i) {
            swap(nums, i, max);
            heapify(nums, max, n);
        }
        for (int ii = 0; ii <nums.length; ii++) {
            System.out.print(nums[ii]+"->");
        }
        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
