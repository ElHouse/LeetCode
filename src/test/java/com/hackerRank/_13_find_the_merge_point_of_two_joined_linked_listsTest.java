package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _13_find_the_merge_point_of_two_joined_linked_listsTest {


    _13_find_the_merge_point_of_two_joined_linked_lists findTheMergePointOfTwoJoinedLinkedLists = new _13_find_the_merge_point_of_two_joined_linked_lists();

    @Test
    public void test01() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);


        SinglyLinkedListNode head21 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head22 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head23 = new SinglyLinkedListNode(3);

        head1.next = head22;

        head21.next = head22;
        head22.next = head23;

        SinglyLinkedListNode.print(head1);
        SinglyLinkedListNode.print(head21);

        assertEquals(2, findTheMergePointOfTwoJoinedLinkedLists.findMergeNode(head1, head21));
    }

    @Test
    public void test02() {
        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);


        SinglyLinkedListNode head21 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head23 = new SinglyLinkedListNode(3);

        head1.next = head2;
        head2.next = head23;

        head21.next = head23;

        SinglyLinkedListNode.print(head1);
        SinglyLinkedListNode.print(head21);

        assertEquals(3, findTheMergePointOfTwoJoinedLinkedLists.findMergeNode(head1, head21));
    }
}