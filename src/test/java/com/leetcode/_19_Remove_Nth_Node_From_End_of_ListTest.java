package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _19_Remove_Nth_Node_From_End_of_ListTest {

    private final _19_Remove_Nth_Node_From_End_of_List removeNthNodeFromEndOfList = new _19_Remove_Nth_Node_From_End_of_List();


    @Test
    public void test01() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 2);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 3, 5}), result));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        ListNode.imprimir(result);
        assertNull(result);
    }


    @Test
    public void test03() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1}), result));
    }


    @Test
    public void test04() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 3);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 4, 5}), result));
    }

    @Test
    public void test05() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 4);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 3, 4, 5}), result));
    }

    @Test
    public void test06() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 1);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4}), result));
    }

    @Test
    public void test07() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, 5);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{2, 3, 4, 5}), result));
    }
}