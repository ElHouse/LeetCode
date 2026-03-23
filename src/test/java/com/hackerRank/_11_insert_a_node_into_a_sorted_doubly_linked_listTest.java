package com.hackerRank;

import com.hackerRank.structure.DoublyLinkedListNode;
import org.junit.jupiter.api.Test;

import static com.hackerRank.structure.DoublyLinkedListNode.print;

class _11_insert_a_node_into_a_sorted_doubly_linked_listTest {
    _11_insert_a_node_into_a_sorted_doubly_linked_list insertANodeIntoASortedDoublylinkedList = new _11_insert_a_node_into_a_sorted_doubly_linked_list();


    @Test
    public void test01() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);


        head1.next = head2;
        head2.next = head4;


        print(head1);

        DoublyLinkedListNode response = insertANodeIntoASortedDoublylinkedList.sortedInsert(head1, 3);


        print(response);

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


        print(head1);

        DoublyLinkedListNode response = insertANodeIntoASortedDoublylinkedList.sortedInsert(head1, 5);


        print(response);

    }

    @Test
    public void test03() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head3 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);


        head1.next = head2;
        head2.next = head3;
        head3.next = head4;


        print(head1);

        DoublyLinkedListNode response = insertANodeIntoASortedDoublylinkedList.sortedInsert(head1, 0);


        print(response);

    }


    @Test
    public void test04() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head11 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head22 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head3 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head33 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);
        DoublyLinkedListNode head44 = new DoublyLinkedListNode(4);


        head1.next = head11;
        head11.next = head2;
        head2.next = head22;

        head22.next = head3;
        head3.next = head33;

        head33.next = head4;
        head4.next = head44;

        print(head1);

        DoublyLinkedListNode response = insertANodeIntoASortedDoublylinkedList.sortedInsert(head1, 3);


        print(response);

    }



    @Test
    public void test05() {

        DoublyLinkedListNode head1 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head11 = new DoublyLinkedListNode(1);
        DoublyLinkedListNode head2 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head22 = new DoublyLinkedListNode(2);
        DoublyLinkedListNode head3 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head33 = new DoublyLinkedListNode(3);
        DoublyLinkedListNode head4 = new DoublyLinkedListNode(4);
        DoublyLinkedListNode head44 = new DoublyLinkedListNode(4);


        head1.next = head11;
        head11.next = head2;
        head2.next = head22;

        head22.next = head3;
        head3.next = head33;

        head33.next = head4;
        head4.next = head44;

        print(head1);

        DoublyLinkedListNode response = insertANodeIntoASortedDoublylinkedList.sortedInsert(head1, 4);


        print(response);

    }
}