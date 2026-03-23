package com.hackerRank;

import com.hackerRank.structure.DoublyLinkedListNode;

public class _12_reverse_a_doubly_linked_list {


    public DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here

        DoublyLinkedListNode head = llist;
        DoublyLinkedListNode tail = llist;
        int count = 0;
        int times = 0;

        if (llist == null) {
            return null;
        }

        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        while (count / 2 >= times) {
            int aux = tail.data;
            tail.data = head.data;
            head.data = aux;

            head = head.next;
            tail = tail.prev;
            times++;
        }

        return llist;
    }
}
