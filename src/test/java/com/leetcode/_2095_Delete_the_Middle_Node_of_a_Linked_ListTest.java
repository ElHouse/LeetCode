package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _2095_Delete_the_Middle_Node_of_a_Linked_ListTest {

    private final _2095_Delete_the_Middle_Node_of_a_Linked_List deleteTheMiddleNodeOfALinkedListTest
            = new _2095_Delete_the_Middle_Node_of_a_Linked_List();

    @Test
    public void test01() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 3, 4, 7, 1, 2, 6,});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);
        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 3, 4, 1, 2, 6,}), result));
    }

    @Test
    public void test02() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4,});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 4,}), result));
    }

    @Test
    public void test03() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{2, 1,});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{2}), result));
    }


    @Test
    public void test04() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 4, 5}), result));
    }

    @Test
    public void test05() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 2, 4}), result));
    }

    @Test
    public void test06() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 3});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1, 3}), result));
    }

    @Test
    public void test07() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        ListNode.imprimir(result);

        assertTrue(ListNode.iguales(ListNode.crearListNodeXLista(new int[]{1}), result));
    }

    @Test
    public void test08() {

        ListNode head = ListNode.crearListNodeXLista(new int[]{1});

        ListNode result = deleteTheMiddleNodeOfALinkedListTest.deleteMiddle(head);

        assertNull(result);
    }


}