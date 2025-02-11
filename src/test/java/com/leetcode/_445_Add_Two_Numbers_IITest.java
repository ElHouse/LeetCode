package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

class _445_Add_Two_Numbers_IITest {

    _445_Add_Two_Numbers_II addTwoNumbersIi = new _445_Add_Two_Numbers_II();

    @Test
    public void case1() {

        ListNode head0 = new ListNode(3);
        ListNode head1 = new ListNode(9);
        ListNode head2 = new ListNode(9);
        ListNode head3 = new ListNode(9);
        ListNode head4 = new ListNode(9);
        ListNode head5 = new ListNode(9);
        ListNode head6 = new ListNode(9);
        ListNode head7 = new ListNode(9);
        ListNode head8 = new ListNode(9);
        ListNode head9 = new ListNode(9);

        head0.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;

        ListNode h = new ListNode(7);

        System.out.println("----");
        printList(addTwoNumbersIi.addTwoNumbers(head0, h));

    }


    @Test
    public void case2() {


        ListNode head0 = new ListNode(9);
        ListNode head1 = new ListNode(0);


        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(0);


        head0.next = head1;

        head2.next = head3;


        printList(addTwoNumbersIi.addTwoNumbers(head0, head2));

    }


    @Test
    public void case3() {


        ListNode head0 = new ListNode(7);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);

        ListNode heada = new ListNode(5);
        ListNode headb = new ListNode(6);
        ListNode headc = new ListNode(4);

        head0.next = head1;
        head1.next = head2;
        head2.next = head3;

        heada.next = headb;
        headb.next = headc;

        printList(addTwoNumbersIi.addTwoNumbers(head0, heada));

    }

    private void printList(ListNode head) {


        ListNode aux = head;
        while(aux != null) {
            System.out.print(aux.val+",");
            aux = aux.next;
        }
        System.out.println();
    }
}