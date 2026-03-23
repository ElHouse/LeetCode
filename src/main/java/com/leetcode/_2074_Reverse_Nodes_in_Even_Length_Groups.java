package com.leetcode;


import com.leetcode.structure.ListNode;

/*
You are given the head of a linked list.

The nodes in the linked list are sequentially assigned to non-empty groups whose lengths form the sequence of the natural numbers (1, 2, 3, 4, ...). The length of a group is the number of nodes assigned to it. In other words,

The 1st node is assigned to the first group.
The 2nd and the 3rd nodes are assigned to the second group.
The 4th, 5th, and 6th nodes are assigned to the third group, and so on.
Note that the length of the last group may be less than or equal to 1 + the length of the second to last group.

Reverse the nodes in each group with an even length, and return the head of the modified linked list.


 */
public class _2074_Reverse_Nodes_in_Even_Length_Groups {

    private int count = 0;

    public ListNode reverseEvenLengthGroups(ListNode head) {

        if (head == null) return null;

        ListNode from = head;
        ListNode prev = head;

        int i = 0;
        while (from != null) {

            ListNode to = elementInXPosition(from, i);

            if (count % 2 == 1) {
                ListNode next = to.next;
                to.next = null;
                prev.next = null;
                prev.next = revert(from);
                from.next = next;
                prev = from;
                from = from.next;
            } else {
                prev = to;
                from = to.next;
            }

            i++;
            count = 0;
        }
        return head;
    }


    private ListNode elementInXPosition(ListNode head, int i) {

        for (int j = 0; j < i && head.next != null; j++) {
            head = head.next;
            count++;
        }

        return head;
    }

    private ListNode revert(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

}
