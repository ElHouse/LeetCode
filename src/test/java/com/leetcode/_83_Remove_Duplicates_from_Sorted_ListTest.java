package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

class _83_Remove_Duplicates_from_Sorted_ListTest {


    _83_Remove_Duplicates_from_Sorted_List removeDuplicatesFromSortedListTest = new _83_Remove_Duplicates_from_Sorted_List();

    @Test
    public void case1() {
        System.out.println("case 1");
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);

        head1.next = head2;
        head2.next = head3;

        printList(head1);
        removeDuplicatesFromSortedListTest.deleteDuplicates(head1);
        printList(head1);
    }

    @Test
    public void case2() {
        System.out.println("case 2");
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(3);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        printList(head1);
        removeDuplicatesFromSortedListTest.deleteDuplicates(head1);
        printList(head1);
    }

    @Test
    public void case3() {
        System.out.println("case 3");
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(1);

        head1.next = head2;
        head2.next = head3;

        printList(head1);
        removeDuplicatesFromSortedListTest.deleteDuplicates(head1);
        printList(head1);
    }

    @Test
    public void case4() {
        System.out.println("case 4");
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(3);

        head1.next = head2;

        printList(head1);
        removeDuplicatesFromSortedListTest.deleteDuplicates(head1);
        printList(head1);
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