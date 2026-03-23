package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _92_Reverse_Linked_List_IITest {


    private final _92_Reverse_Linked_List_II reverseLinkedListIi = new _92_Reverse_Linked_List_II();

    @Test
    public void test01() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 4, 3, 2, 5});

        ListNode result = reverseLinkedListIi.reverseBetween(head, 2, 4);
        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{5});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{5});
        ListNode result = reverseLinkedListIi.reverseBetween(head, 1, 1);

        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test03() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 5, 4, 3, 2});

        ListNode result = reverseLinkedListIi.reverseBetween(head, 2, 5);
        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test04() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{5, 4, 3, 2, 1});

        ListNode result = reverseLinkedListIi.reverseBetween(head, 1, 5);
        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test05() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = reverseLinkedListIi.reverseBetween(head, 3, 3);
        assertTrue(ListNode.iguales(expected, result));
    }

}