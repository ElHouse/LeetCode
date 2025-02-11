package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _876_Middle_of_the_Linked_ListTest {

    _876_Middle_of_the_Linked_List middleOfTheLinkedList = new _876_Middle_of_the_Linked_List();


    @Test
    public void case1() {

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;


        assertEquals(3, middleOfTheLinkedList.middleNode(head1).val);
    }


    @Test
    public void case2() {


        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = null;

        assertEquals(4, middleOfTheLinkedList.middleNode(head1).val);


    }
}