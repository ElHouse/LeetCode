package com.leetcode.structure;


public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    public static ListNode crearListNodeXLista(int[] array) {

        ListNode head = new ListNode(array[0]);

        ListNode aux = head;

        for (int i = 1; i < array.length; i++) {

            ListNode aux2 = new ListNode(array[i]);
            aux.next = aux2;
            aux = aux2;
        }

        return head;
    }

    public static void imprimir(ListNode head) {

        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }

        System.out.println();
    }

    public static boolean iguales(ListNode head, ListNode head2) {

        while (head != null && head2 != null) {
            if (head.val != head2.val) return false;

            head = head.next;
            head2 = head2.next;
        }

        if(head == null && head2 != null) return false;
        if(head != null && head2 == null) return false;


        return true;
    }
}
