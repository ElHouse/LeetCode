package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _817_Linked_List_ComponentsTest {

    _817_Linked_List_Components linkedListComponents = new _817_Linked_List_Components();


    @Test
    public void case1() {

        System.out.println("-------------case1");

        ListNode head0 = new ListNode(0);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);

        head0.next = head1;
        head1.next = head2;
        head2.next = head3;

        int[] G = {0, 1, 3};

        assertEquals(1, linkedListComponents.numComponents(head0, G));
    }


    @Test
    public void case2() {

        System.out.println("-------------case2");

        ListNode head0 = new ListNode(0);
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);

        head0.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        int[] G = {0, 3, 1, 4};

        assertEquals(2, linkedListComponents.numComponents(head0, G));
    }
}