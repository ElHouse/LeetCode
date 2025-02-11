package com.leetcode.structure;

import com.leetcode.structure.Heap;
import org.junit.jupiter.api.Test;

class HeapTest {


    @Test
    public void testMaxHeap() {


        Heap heap = new Heap(true);

        heap.addElement(4);
        heap.addElement(8);
        heap.addElement(2);
        heap.addElement(5);

        heap.printHeap();

        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
    }


    @Test
    public void testMinHeap() {

        Heap heap = new Heap(false);

        heap.addElement(4);
        heap.addElement(5);
        heap.addElement(8);
        heap.addElement(2);

        heap.printHeap();

        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
    }



    @Test
    public void testMinHeapRepeatedNumbers() {

        Heap heap = new Heap(true);

        heap.addElement(4);
        heap.addElement(2);
        heap.addElement(8);
        heap.addElement(2);
        heap.addElement(4);
        heap.addElement(2);
        heap.addElement(8);
        heap.addElement(2);

        heap.printHeap();

        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
        System.out.println(heap.getElement());
        heap.printHeap();
    }


}