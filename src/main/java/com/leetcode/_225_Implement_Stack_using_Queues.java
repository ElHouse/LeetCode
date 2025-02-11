package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;


public class _225_Implement_Stack_using_Queues {

//	Runtime: 43 ms, faster than 37.40% of Java online submissions for Implement Stack using Queues.
//	Memory Usage: 33.8 MB, less than 91.67% of Java online submissions for Implement Stack using Queues.

    Queue<Integer> cola = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public _225_Implement_Stack_using_Queues() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        cola.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        int element = 0;
        int i = 0;
        int size = cola.size() - 1;

        while (i < size) {
            i++;
            element = cola.poll();
            cola.add(element);
        }

        element = cola.poll();

        return element;
    }


}
