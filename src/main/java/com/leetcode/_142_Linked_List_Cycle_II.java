package com.leetcode;

import com.leetcode.structure.ListNode;

public class _142_Linked_List_Cycle_II {

    public static ListNode detectCycle(ListNode head) {

        if (head == null) return null;

        ListNode fix = head;

        while (fix.next != null) {
            System.out.println("_________________________");
            ListNode algo = algo(fix);
            System.out.println("algo->" + algo.val);
            if (algo == null) return null;
            else if (fix.equals(algo)) {
                return fix;
            } else {
                fix = fix.next;
            }

        }

        return null;
    }


    public static ListNode algo(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        System.out.println("head>" + head.val);
        while (slow.next != null) {

            System.out.println("(slow.val>" + slow.val);
            System.out.println("(fast.val>" + fast.val);

            if (fast.next != null && fast.next.next != null) {
                System.out.print(fast.val + "+");
                fast = fast.next.next;
                System.out.println(fast.val);
            } else {
                return null; //no hay ciclo
            }

            slow = slow.next;

            if (slow.equals(fast)) {
                return slow;
            }


            System.out.println("---------------------S-" + slow.val + "-------F" + fast.val);
        }

        return null;
    }


}
