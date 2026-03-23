package com.leetcode;

import com.leetcode.structure.ListNode;

public class _1721_Swapping_Nodes_in_a_Linked_List {


    public ListNode swapNodes(ListNode head, int k) {

        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode aux = head;

        for (int i = 0; i < k && fast != null; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        for (int i = 0; i < k - 1 && aux != null; i++) {
            aux = aux.next;
        }

        int number = aux.val;
        aux.val = slow.val;
        slow.val = number;

        return head;
    }


}
