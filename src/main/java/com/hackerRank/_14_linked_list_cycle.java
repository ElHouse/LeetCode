package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class _14_linked_list_cycle {


    public boolean linked_list_cycle(SinglyLinkedListNode head1) {


        Set<SinglyLinkedListNode> set = new HashSet<>();


        while (head1 != null) {

            if (set.contains(head1)) {
                return true;
            }

            set.add(head1);

            head1 = head1.next;
        }


        return false;
    }


}
