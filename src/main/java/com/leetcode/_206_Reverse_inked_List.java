package com.leetcode;

import com.leetcode.structure.ListNode;

import java.util.Stack;

public class _206_Reverse_inked_List {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode aux = head;

        while (aux.next != null) {

            ListNode n = aux.next; // 2->3
            aux.next = n.next; // 1 -> 3
            n.next = head; // 3-> 1
            head = n;  // 2
            ListNode.imprimir(head);
        }

        return head;
    }

    public ListNode reverseList2(ListNode head) {


        if (head == null) return null;


        Stack<ListNode> pila = new Stack<>();


        ListNode auxHead = head;
        ListNode prev = null;
        while (auxHead != null) {
            pila.add(auxHead);
            auxHead = auxHead.next;
        }

        prev = pila.pop();
        auxHead = prev;

        while (!pila.empty()) {

            ListNode aux = pila.pop();
            prev.next = aux;
            prev = aux;

        }

        prev.next = null;

        return auxHead;
    }

}
