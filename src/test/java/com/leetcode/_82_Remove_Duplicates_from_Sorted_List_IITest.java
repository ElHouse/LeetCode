package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _82_Remove_Duplicates_from_Sorted_List_IITest {

    private final _82_Remove_Duplicates_from_Sorted_List_II removeDuplicatesFromSortedListI = new _82_Remove_Duplicates_from_Sorted_List_II();

    @Test
    public void test01() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 3, 4, 4, 5});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 5}), result));
    }

    @Test
    public void test02() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 1, 1, 2, 3});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{2, 3}), result));
    }

    @Test
    public void test03() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 1, 1, 1, 3, 3});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertNull(result);
    }


    @Test
    public void test04() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 1, 1, 1, 1, 1});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertNull(result);
    }


    @Test
    public void test05() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2}), result));
    }

    @Test
    public void test06() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1});

        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1}), result));
    }

    @Test
    public void test07() {


        ListNode result = removeDuplicatesFromSortedListI.deleteDuplicates(null);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1}), result));
    }
}
