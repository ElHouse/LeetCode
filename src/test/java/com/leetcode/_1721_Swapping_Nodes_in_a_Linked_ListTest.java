package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1721_Swapping_Nodes_in_a_Linked_ListTest {


    private final _1721_Swapping_Nodes_in_a_Linked_List swappingNodesInALinkedList = new _1721_Swapping_Nodes_in_a_Linked_List();

    @Test
    public void test01() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = swappingNodesInALinkedList.swapNodes(head, 2);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 4, 3, 2, 5}), result));
    }

    @Test
    public void test02() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5});

        ListNode result = swappingNodesInALinkedList.swapNodes(head, 5);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{7, 9, 6, 6, 8, 7, 3, 0, 9, 5}), result));
    }

    @Test
    public void test03() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5});

        ListNode result = swappingNodesInALinkedList.swapNodes(head, 1);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{5, 9, 6, 6, 7, 8, 3, 0, 9, 7}), result));
    }

    @Test
    public void test04() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5});

        ListNode result = swappingNodesInALinkedList.swapNodes(head, 3);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{7, 9, 0, 6, 7, 8, 3, 6, 9, 5}), result));
    }

    @Test
    public void test05() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{7});

        ListNode result = swappingNodesInALinkedList.swapNodes(head, 1);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{7}), result));
    }

    @Test
    public void test06() {
        ListNode result = swappingNodesInALinkedList.swapNodes(null, 1);
        assertNull(result);
    }
}