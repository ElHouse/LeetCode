package com.leetcode;

import com.leetcode.structure.ListNode;
/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 */
public class _234_Palindrome_Linked_List {

    private ListNode newHead;
    private boolean isPalindrome = true;


    public boolean isPalindrome(ListNode head) {

        if (head == null) return false;

        newHead = head;
        revert(head);
        return isPalindrome;
    }


    private ListNode revert(ListNode head) {

        if (head == null) return head;

        ListNode aux = revert(head.next);

        //System.out.println(head.val + "----" + newHead.val);
        if (head.val != newHead.val) {
            isPalindrome = false;
        }
        newHead = newHead.next;


        return head;
    }


}
