package com.leetcode;

import com.leetcode.structure.ListNode;

public class _160_Intersection_of_Two_Linked_Lists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        if (headA == headB) return headA;

        ListNode aux = headB;

        do {
            do {
                if (headA.equals(headB)) {
                    return headA;
                }
                headB = headB.next;

            } while (headB != null);

            headA = headA.next;
            headB = aux;
        } while (headA != null);

        return null;
    }


}
