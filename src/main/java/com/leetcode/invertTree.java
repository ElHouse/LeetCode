package com.leetcode;


import com.leetcode.structure.ListNode;

public class invertTree {


    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        addAtEnd(head, new ListNode(1));
        printNodes(head);
        addAtEnd(head, new ListNode(2));
        printNodes(head);
        addAtEnd(head, new ListNode(3));
        printNodes(head);
        addAtEnd(head, new ListNode(4));
        printNodes(head);
        addAtEnd(head, new ListNode(5));
        printNodes(head);
        addAtEnd(head, new ListNode(6));
        printNodes(head);
        addAtEnd(head, new ListNode(7));
        printNodes(head);


        System.out.println("---------------------------Revert");

        ListNode dummy =   revert(head);

        printNodes(dummy);

        System.out.println("---------------------------findXPostion");
        ListNode node3 =   findXPostion(dummy, 3);
        printNodes(node3);

        printNodes(revert(node3));

    }


    public static ListNode findXPostion(ListNode head, int i) {

        int count = 0;

        while (head != null) {
            count++;
            if (count == i) {
                return head;
            }
            head = head.next;
        }

        return head;
    }


    public static ListNode revert(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;
        }
        return prev;
    }


    public static void printNodes(ListNode head) {
        while (head != null && head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        if(head != null) System.out.println(head.val);
    }

    public static void addAtEnd(ListNode head, ListNode newNode) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }

    public static void addAtEndIndexI(ListNode head, ListNode newNode, int val) {

        if (head.val == val) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode prev = head;
        head = head.next;


        while (head != null) {

            if (head.val == val) {
                newNode.next = prev.next;
                prev.next = newNode;
            }

            head = head.next;
            prev = prev.next;
        }

    }


}
