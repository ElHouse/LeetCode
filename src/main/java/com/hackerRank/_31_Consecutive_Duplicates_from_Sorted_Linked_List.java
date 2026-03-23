package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

public class _31_Consecutive_Duplicates_from_Sorted_Linked_List {


    public  SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
        // Write your code here
        if(head == null) return null;

        SinglyLinkedListNode prev = head;
        SinglyLinkedListNode next = head.next;

        while (next != null) {

            if(prev.data != next.data){
                prev.next = next;
                prev = next;
            }

            next = next.next;
        }

        prev.next = next;

        return head;
    }
}
