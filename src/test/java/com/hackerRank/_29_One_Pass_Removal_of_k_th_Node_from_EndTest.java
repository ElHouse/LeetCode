package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _29_One_Pass_Removal_of_k_th_Node_from_EndTest {
    _29_One_Pass_Removal_of_k_th_Node_from_End onePassRemovalOfKThNodeFromEnd = new _29_One_Pass_Removal_of_k_th_Node_from_End();

    @Test
    void removeKthNodeFromEnd1() {
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode head7 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head8 = new SinglyLinkedListNode(8);

        head5.next = head6;
        head6.next = head7;
        head7.next = head8;

        SinglyLinkedListNode.print(head5);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head5, 3);

        SinglyLinkedListNode.print(response);
    }

    @Test
    void removeKthNodeFromEnd2() {
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(2);

        head5.next = head6;

        SinglyLinkedListNode.print(head5);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head5, 0);

        SinglyLinkedListNode.print(response);
    }

    @Test
    void removeKthNodeFromEnd3() {
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);

        SinglyLinkedListNode.print(head5);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head5, 1);

        SinglyLinkedListNode.print(response);
    }


    @Test
    void removeKthNodeFromEnd4() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode head4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode head7 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head8 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode head9 = new SinglyLinkedListNode(9);
        SinglyLinkedListNode head10 = new SinglyLinkedListNode(10);
        SinglyLinkedListNode head11 = new SinglyLinkedListNode(11);
        SinglyLinkedListNode head12 = new SinglyLinkedListNode(12);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;
        head9.next = head10;
        head10.next = head11;
        head11.next = head12;

        SinglyLinkedListNode.print(head1);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head1, 4);

        SinglyLinkedListNode.print(response);

    }

    @Test
    void removeKthNodeFromEnd5() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode head4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode head7 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head8 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode head9 = new SinglyLinkedListNode(9);
        SinglyLinkedListNode head10 = new SinglyLinkedListNode(10);
        SinglyLinkedListNode head11 = new SinglyLinkedListNode(11);
        SinglyLinkedListNode head12 = new SinglyLinkedListNode(12);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;
        head9.next = head10;
        head10.next = head11;
        head11.next = head12;

        SinglyLinkedListNode.print(head1);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head1, 8);

        SinglyLinkedListNode.print(response);

    }

    @Test
    void removeKthNodeFromEnd6() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode head4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode head7 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head8 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode head9 = new SinglyLinkedListNode(9);
        SinglyLinkedListNode head10 = new SinglyLinkedListNode(10);
        SinglyLinkedListNode head11 = new SinglyLinkedListNode(11);
        SinglyLinkedListNode head12 = new SinglyLinkedListNode(12);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;
        head9.next = head10;
        head10.next = head11;
        head11.next = head12;

        SinglyLinkedListNode.print(head1);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head1, 12);

        SinglyLinkedListNode.print(response);

    }


    @Test
    void removeKthNodeFromEnd7() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode head4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode head5 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode head6 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode head7 = new SinglyLinkedListNode(7);
        SinglyLinkedListNode head8 = new SinglyLinkedListNode(8);
        SinglyLinkedListNode head9 = new SinglyLinkedListNode(9);
        SinglyLinkedListNode head10 = new SinglyLinkedListNode(10);
        SinglyLinkedListNode head11 = new SinglyLinkedListNode(11);
        SinglyLinkedListNode head12 = new SinglyLinkedListNode(12);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;
        head9.next = head10;
        head10.next = head11;
        head11.next = head12;

        SinglyLinkedListNode.print(head1);

        SinglyLinkedListNode response = onePassRemovalOfKThNodeFromEnd.removeKthNodeFromEnd(head1, 0);

        SinglyLinkedListNode.print(response);

    }
}