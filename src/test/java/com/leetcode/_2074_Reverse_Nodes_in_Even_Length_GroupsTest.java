package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2074_Reverse_Nodes_in_Even_Length_GroupsTest {


    private _2074_Reverse_Nodes_in_Even_Length_Groups reverseNodesInEvenLengthGroups = new _2074_Reverse_Nodes_in_Even_Length_Groups();


    @Test
    public void test01() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 3, 2, 4, 5, 6, 10, 9, 8, 7, 11, 12, 13, 14, 15, 17, 16});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{5, 2, 6, 3, 9, 1, 7, 3, 8, 4});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{5, 6, 2, 3, 9, 1, 4, 8, 3, 7});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test03() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 1, 0, 6});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 0, 1, 6});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test04() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 1, 0, 6, 5});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 0, 1, 5, 6});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test05() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 2});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test06() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test07() {

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(null);

        assertNull(newHead);
    }

    @Test
    public void test08() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 3, 2, 4, 5, 6, 10, 9, 8, 7, 11, 12, 13, 14, 15, 16, 17, 18});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }

    @Test
    public void test09() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21});
        ListNode.imprimir(head);
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 3, 2, 4, 5, 6, 10, 9, 8, 7, 11, 12, 13, 14, 15, 21, 20, 19, 18, 17, 16});

        ListNode newHead = reverseNodesInEvenLengthGroups.reverseEvenLengthGroups(head);

        assertTrue(ListNode.iguales(expected, newHead));
    }
}