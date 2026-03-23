package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

public class _10_insert_a_node_at_a_specific_position_in_a_linked_list {




    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {

        SinglyLinkedListNode head = llist;
        if (head == null) {
            llist = new SinglyLinkedListNode(data);
            return llist;
        }

        int count = 1;

        while (head.next != null) {

            if (count == position) {
                SinglyLinkedListNode aux = head.next;
                head.next = new SinglyLinkedListNode(data);
                head.next.next = aux;
                break;
            }

            count++;
            head = head.next;
        }

        if (count < position) {
            head.next = new SinglyLinkedListNode(data);
        }

        return llist;
    }
}
