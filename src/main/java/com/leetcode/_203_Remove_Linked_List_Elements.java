package com.leetcode;


import com.leetcode.structure.ListNode;

/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class _203_Remove_Linked_List_Elements {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;

        ListNode slow = new ListNode(-9, head);
        ListNode newHead = slow;
        ListNode fast = head;

        while (fast != null) {

            while (fast != null && fast.val == val) {
                fast = fast.next;
            }

            slow.next = fast;
            slow = (fast == null) ? null : slow.next;
            fast = (fast == null) ? null : fast.next;
        }

        return newHead.next;
    }
}
