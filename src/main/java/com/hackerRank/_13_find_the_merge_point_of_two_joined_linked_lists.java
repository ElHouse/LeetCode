package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class _13_find_the_merge_point_of_two_joined_linked_lists {


    int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {


        Set<SinglyLinkedListNode> set = new HashSet<>();

        while (head1 != null && head2 != null) {

            if (set.contains(head1)) {
                return head1.data;
            }
            set.add(head1);

            if (set.contains(head2)) {
                return head2.data;
            }
            set.add(head2);

            head1 = head1.next;
            head2 = head2.next;
        }


        while (head1 != null) {

            if (set.contains(head1)) {
                return head1.data;
            }
            set.add(head1);
            head1 = head1.next;
        }


        while (head2 != null) {
            if (set.contains(head2)) {
                return head2.data;
            }
            set.add(head2);
            head2 = head2.next;
        }


        return 0;

    }


}
