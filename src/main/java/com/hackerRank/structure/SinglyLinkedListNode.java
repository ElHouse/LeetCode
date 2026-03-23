package com.hackerRank.structure;



public class SinglyLinkedListNode {

    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public static void print(SinglyLinkedListNode node) {

        SinglyLinkedListNode head = node;

        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static SinglyLinkedListNode crearSinglyLinkedListNodeXLista(int[] array) {

        SinglyLinkedListNode head = new SinglyLinkedListNode(array[0]);

        SinglyLinkedListNode aux = head;

        for (int i = 1; i < array.length; i++) {

            SinglyLinkedListNode aux2 = new SinglyLinkedListNode(array[i]);
            aux.next = aux2;
            aux = aux2;
        }

        return head;
    }

    public static boolean iguales(SinglyLinkedListNode head, SinglyLinkedListNode head2) {

        System.out.println("Iguales");
        System.out.print("A>");
        print(head);
        System.out.print("B>");
        print(head2);

        while (head != null && head2 != null) {
            if (head.data != head2.data) return false;

            head = head.next;
            head2 = head2.next;
        }

        if (head == null && head2 != null) return false;
        if (head != null) return false;


        return true;
    }
}
