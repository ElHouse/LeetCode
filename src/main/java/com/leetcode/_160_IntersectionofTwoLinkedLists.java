package com.leetcode;


import com.leetcode.structure.ListNode;

public class _160_IntersectionofTwoLinkedLists {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {



        int sizeA = 0;
        int sizeB = 0;

        ListNode aux = headA;
        while (aux.next != null) {
            sizeA++;
            aux = aux.next;
        }


        aux = headB;
        while (aux.next != null) {
            sizeB++;
            aux = aux.next;
        }


        ListNode auxA = headA;
        ListNode auxB = headB;

        if (sizeA > sizeB) {

            for (int i = 0; i < sizeA - sizeB; i++) {
                if (auxA == auxB) {
                    return auxA;
                } else {
                    auxA = auxA.next;
                }
            }

        } else {

            for (int i = 0; i < sizeB - sizeA; i++) {
                if (auxB == auxA) {
                    return auxA;
                } else {
                    auxB = auxB.next;
                }
            }
        }


        while (auxB.next != null || auxA.next != null) {

            if (auxB == auxA) {
                return auxA;
            } else {
                auxB = auxB.next;
                auxA = auxA.next;
            }

        }


        return null;

    }

}
