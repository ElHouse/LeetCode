package com.leetcode;

import com.leetcode.structure.ListNode;

public class _19_Remove_Nth_Node_From_End_of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        for (int i = 0; i < n && fast.next != null; i++) {
            fast = fast.next;
            count++;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            count++;
        }

        if (n == 1 && count == 0) {
            if (fast != slow) {
                slow.next = slow.next.next;
            } else {
                return null;
            }
        } else if (n - 1 == count) {
            head = head.next;
        } else if (slow.next != null) {
            slow.next = slow.next.next;
        }


        return head;
    }
}
