package com.leetcode;

import com.leetcode.structure.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class _83_Remove_Duplicates_from_Sorted_List {

    //0 ms
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        int number = head.val;
        ListNode newHead = new ListNode(number);
        ListNode dummy = newHead;

        head = head.next;

        while (head != null) {

            int auxNumber = head.val;
            if (auxNumber != number) {
                dummy.next = head;
                dummy = dummy.next;
                number = auxNumber;
            }
            head = head.next;

        }

        dummy.next = null;

        return newHead;
    }

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
//	Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    public ListNode deleteDuplicates2(ListNode head) {


        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        preHead.next = head;

        ListNode aux = head;

        while (aux != null) {

            if (aux.val != preHead.val) {
                aux = aux.next;
                preHead = preHead.next;
            } else {
                if (aux.next != null) {
                    preHead.next = aux.next;
                    aux = preHead.next;
                } else {
                    preHead.next = null;
                    aux = null;
                }
            }

        }

        return head;
    }


}
