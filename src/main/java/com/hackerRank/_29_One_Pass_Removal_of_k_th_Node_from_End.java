package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

public class _29_One_Pass_Removal_of_k_th_Node_from_End {


    public SinglyLinkedListNode removeKthNodeFromEnd(SinglyLinkedListNode head, int k) {
        // Write your code here
        if (k < 0) return head;

        SinglyLinkedListNode aux = new SinglyLinkedListNode(-1);
        aux.next = head;

        SinglyLinkedListNode slow = aux;
        SinglyLinkedListNode fast = aux;

        for (int i = 0; i <= k; i++) {

            if (fast != null) {
                fast = fast.next;
            }
        }


        while (fast != null && fast.next != null) {

            fast = fast.next;
            slow = slow.next;
        }


        if (fast != null) {
            slow.next = slow.next.next;
        }

        return aux.next;
    }

}
