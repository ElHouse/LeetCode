package com.hackerRank;

import com.hackerRank.structure.DoublyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _12_reverse_a_doubly_linked_listTest {

    _12_reverse_a_doubly_linked_list reverseADoublyLinkedList = new _12_reverse_a_doubly_linked_list();


    @Test
    public void test01() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head3 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);
        DoublyLinkedListNode head5 = new DoublyLinkedListNode(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;


        head5.prev = head4;
        head4.prev = head3;
        head3.prev = head2;
        head2.prev = head1;

        DoublyLinkedListNode.print(head1);

        DoublyLinkedListNode response = reverseADoublyLinkedList.reverse(head1);


        DoublyLinkedListNode.print(response);
    }


    @Test
    public void test02() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head3 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        head4.prev = head3;
        head3.prev = head2;
        head2.prev = head1;

        DoublyLinkedListNode.print(head1);

        DoublyLinkedListNode response = reverseADoublyLinkedList.reverse(head1);


        DoublyLinkedListNode.print(response);
    }

}