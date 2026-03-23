package com.hackerRank;

import com.hackerRank.structure.DoublyLinkedListNode;

public class _11_insert_a_node_into_a_sorted_doubly_linked_list {


    public DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {

        DoublyLinkedListNode head = llist;


        if (head == null) {
            head = new DoublyLinkedListNode(data);
            return head;
        }


        if (head.data > data) {
            DoublyLinkedListNode aux = new DoublyLinkedListNode(data);
            aux.next = llist;
            return aux;
        }


        while (head.next != null) {

            if (head.data <= data && data < head.next.data) {
                DoublyLinkedListNode aux = head.next;
                head.next = new DoublyLinkedListNode(data);
                head.next.next = aux;
                return llist;
            }

            head = head.next;
        }

        head.next = new DoublyLinkedListNode(data);

        return llist;
    }
}
