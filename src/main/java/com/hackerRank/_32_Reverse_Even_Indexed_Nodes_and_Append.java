package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

import java.util.Stack;

public class _32_Reverse_Even_Indexed_Nodes_and_Append {


    public SinglyLinkedListNode extractAndAppendSponsoredNodes(SinglyLinkedListNode head) {

        if (head == null) return null;

        Stack<SinglyLinkedListNode> stack = new Stack<>();
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode aux = new SinglyLinkedListNode(-1);

        aux.next = head;
        head = head.next;

        while (aux != null) {

            SinglyLinkedListNode next = aux.next;
            prev = aux;

            if (next != null) {
                stack.add(next);
                aux.next = next.next;
                next.next = null;
            }

            aux = aux.next;
        }


        while (!stack.isEmpty()) {
            SinglyLinkedListNode next = stack.pop();
            System.out.println(next.data);
            prev.next = next;
            prev = next;
        }


        return head == null ? prev : head;
    }
}
