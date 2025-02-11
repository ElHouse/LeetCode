package com.leetcode;

import com.leetcode.structure.ListNode;

public class _328_Odd_Even_Linked_List {


//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
//	Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Odd Even Linked List.
//	Next challenges: 

    public static ListNode oddEvenList(ListNode head) {


        if (head == null) return null;
        if (head.next == null) return head;


        ListNode odd = head;
        ListNode pair = head.next;

        if (pair.next == null) return head;

        ListNode aux = pair.next;
        ListNode oddAux = odd;
        ListNode pairAux = pair;
        boolean isOdd = true;

        while (aux != null) {

            if (isOdd) {
                oddAux.next = aux;
                oddAux = oddAux.next;
            } else {
                pairAux.next = aux;
                pairAux = pairAux.next;
            }
            aux = aux.next;
            isOdd = !isOdd;
        }

        pairAux.next = null;
        oddAux.next = pair;


        return odd;
    }


}