package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _703_Kth_Largest_Element_in_a_Stream {

    private int k;
    private final PriorityQueue<Integer> heap;

    public _703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.heap = new PriorityQueue<>();
        this.k = k;

        for (int i = 0; i < nums.length; i++) {

            if (heap.size() >= k) {

                if (heap.peek() < nums[i]) {
                    heap.poll();
                    heap.add(nums[i]);
                }
            } else {
                heap.add(nums[i]);
            }
        }


    }

    public int add(int val) {

        if (heap.size() < k) {
            heap.add(val);
        } else {

            if (heap.peek() < val) {
                heap.poll();
                heap.add(val);
            }
        }

        return heap.peek();
    }

}
