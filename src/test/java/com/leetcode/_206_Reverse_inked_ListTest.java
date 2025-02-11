package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class _206_Reverse_inked_ListTest {

    _206_Reverse_inked_List reverseInkedList = new _206_Reverse_inked_List();

    @Test
    public void test00() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5,6});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{6, 5, 4, 3, 2, 1}), response));
    }

    @Test
    public void test01() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{5, 4, 3, 2, 1}), response));
    }

    @Test
    public void test02() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{4, 3, 2, 1}), response));
    }

    @Test
    public void test03() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1, 2, 3});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{3, 2, 1}), response));
    }

    @Test
    public void test04() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1, 2});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{2, 1}), response));
    }

    @Test
    public void test05() {

        ListNode ln = ListNode.crearListNodeXLista(new int[]{1});

        ListNode response = reverseInkedList.reverseList(ln);
        ListNode.imprimir(response);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1}), response));
    }



}