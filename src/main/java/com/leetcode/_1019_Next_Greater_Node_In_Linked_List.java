package com.leetcode;


import com.leetcode.structure.ListNode;

import java.util.ArrayList;
import java.util.List;

//TODO MOVER TEST

public class _1019_Next_Greater_Node_In_Linked_List {

//	Runtime: 1133 ms, faster than 5.01% of Java online submissions for Next Greater Node In Linked List.
//	Memory Usage: 40.2 MB, less than 97.30% of Java online submissions for Next Greater Node In Linked List.
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return null;

        List<Integer> answer = new ArrayList<>();

        while (head != null) {

            int val = head.val;

            if (head.next != null) {

                ListNode aux = head.next;

                while (aux != null) {
                    if (aux.val > val) {
                        answer.add(aux.val);
                        break;
                    }
                    aux = aux.next;
                }

                if (aux == null) {
                    answer.add(0);
                }
            }

            head = head.next;
        }

        answer.add(0);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}