package com.leetcode;

import com.leetcode.structure.ListNode;

public class _24_Swap_Nodes_in_Pairs {


    public ListNode swapPairs(ListNode head) {

        if (head == null) return null;

        ListNode auxHead = head.next;

        ListNode p = new ListNode(0);

        p.next = head;

        while (p.next != null && p.next.next != null) {

            ListNode a = p.next;
            ListNode b = p.next.next;

            p.next = b;
            a.next = b.next;
            b.next = a;

            p = p.next.next;

        }


        return auxHead == null ? head : auxHead;
    }

}
