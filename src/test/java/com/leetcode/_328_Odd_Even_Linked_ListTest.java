package com.leetcode;

import com.leetcode.structure.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class _328_Odd_Even_Linked_ListTest {

//TODO poner asserts
    _328_Odd_Even_Linked_List oddEvenLinkedList = new _328_Odd_Even_Linked_List();
    public void test1() {

        ListNode h = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        ListNode h6 = new ListNode(6);


//		h.next  = h2;
//		h2.next = h3;
//		h3.next = h4;
//		h4.next = h5;
//		h5.next = h6;

        print(h);

        System.out.println("--------------------------------");

        ListNode result = oddEvenLinkedList.oddEvenList(h);

        print(result);

    }


    public static void print(ListNode head) {

        if(head==null) System.out.println("vacio");

        while(head!=null) {

            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();

    }
}