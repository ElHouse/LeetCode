package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static com.hackerRank.structure.SinglyLinkedListNode.print;
import static org.junit.jupiter.api.Assertions.*;

class _10_insert_a_node_at_a_specific_position_in_a_linked_listTest {
    _10_insert_a_node_at_a_specific_position_in_a_linked_list insertANodeAtASpecificPositionInALinkedList = new _10_insert_a_node_at_a_specific_position_in_a_linked_list();

    @Test
    public void test01() {

        SinglyLinkedListNode head1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode head2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode head3 = new SinglyLinkedListNode(3);

        head2.next = head3;
        head1.next = head2;

        print(head1);

        SinglyLinkedListNode response = insertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition(head1, 4, 2);

        print(response);
    }

}