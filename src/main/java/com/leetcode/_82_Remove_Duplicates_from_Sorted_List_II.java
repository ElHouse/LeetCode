package com.leetcode;

import com.leetcode.structure.ListNode;

/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.
 */
public class _82_Remove_Duplicates_from_Sorted_List_II {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode newHead = new ListNode(-1);
        ListNode newHead2 = newHead;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {

            if (slow.val == fast.val) {
                while (fast != null && slow.val == fast.val) {
                    fast = fast.next;
                }
            } else {
                newHead.next = slow;
                newHead = slow;
            }
            slow = fast;
            if (fast != null) {
                fast = fast.next;
            }
        }

        newHead.next = slow;
        newHead = slow;
        if (newHead != null) {
            newHead.next = null;
        }

        return newHead2.next;
    }

}
