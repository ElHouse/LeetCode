package com.leetcode;

import com.leetcode.structure.ListNode;

public class _92_Reverse_Linked_List_II {


    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode newHead  = new ListNode(-1);
        newHead.next = head;
        ListNode prev = nodeInXPosition(newHead, left );
        ListNode to = prev.next;
        ListNode to2 = to;
        ListNode from = nodeInXPosition(head, right);
        ListNode next = from.next;

        from.next = null;
        prev.next = null;

        to = revert(to);
        prev.next = to;
        to2.next = next;


        return newHead.next;
    }

    private ListNode revert(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
        }
        return prev;
    }

    private ListNode nodeInXPosition(ListNode head, int i) {

        int count = 1;

        while (head != null) {
            if (count == i) {
                return head;
            }
            count++;

            head = head.next;
        }

        return head;
    }


}
