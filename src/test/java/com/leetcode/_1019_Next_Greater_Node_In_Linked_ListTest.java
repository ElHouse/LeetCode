package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1019_Next_Greater_Node_In_Linked_ListTest {

    private final _1019_Next_Greater_Node_In_Linked_List nextGreaterNodeInLinkedList = new _1019_Next_Greater_Node_In_Linked_List();

    @Test
    public void case1() {


        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;


        int[] answer = {5, 5, 0};

        assertEquals(Arrays.toString(answer), Arrays.toString(nextGreaterNodeInLinkedList.nextLargerNodes(head1)));

    }


    @Test
    public void case2() {


        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(7);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;


        int[] answer = {7, 0, 5, 5, 0};

        assertEquals(Arrays.toString(answer), Arrays.toString(nextGreaterNodeInLinkedList.nextLargerNodes(head1)));

    }


    @Test
    public void case3() {


        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(7);
        ListNode head3 = new ListNode(5);
        ListNode head4 = new ListNode(1);
        ListNode head5 = new ListNode(9);
        ListNode head6 = new ListNode(2);
        ListNode head7 = new ListNode(5);
        ListNode head8 = new ListNode(1);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;


        int[] answer = {7, 9, 9, 9, 0, 5, 0, 0};

        assertEquals(Arrays.toString(answer), Arrays.toString(nextGreaterNodeInLinkedList.nextLargerNodes(head1)));

    }

}