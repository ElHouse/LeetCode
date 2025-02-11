package com.leetcode;

import java.util.Stack;


public class _232_Implement_Queue_using_Stacks {

    Stack<Integer> pila = new Stack<>();
    Stack<Integer> aux = new Stack<>();

//	Runtime: 43 ms, faster than 38.61% of Java online submissions for Implement Queue using Stacks.
//	Memory Usage: 33.8 MB, less than 20.83% of Java online submissions for Implement Queue using Stacks.

    public _232_Implement_Queue_using_Stacks() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {

        aux.clear();


        while (!pila.isEmpty()) {
            aux.add(pila.pop());
        }
        aux.add(x);

        while (!aux.isEmpty()) {
            pila.add(aux.pop());
        }

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {

        return pila.pop();
    }


}
