package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _203_Remove_Linked_List_ElementsTest {

    private final _203_Remove_Linked_List_Elements removeLinkedListElements = new _203_Remove_Linked_List_Elements();

    @Test
    public void test01() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{1, 2, 3, 4, 5});

        ListNode result = removeLinkedListElements.removeElements(head, 6);

        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test02() {
        ListNode result = removeLinkedListElements.removeElements(null, 6);

        assertNull(result);
    }

    @Test
    public void test03() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{7, 7, 7, 7, 7});
        ListNode result = removeLinkedListElements.removeElements(head, 7);
        assertNull(result);
    }


    @Test
    public void test04() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{7, 7, 7, 7, 7});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{7, 7, 7, 7, 7});
        ListNode result = removeLinkedListElements.removeElements(head, 1);
        assertTrue(ListNode.iguales(expected, result));

    }


    @Test
    public void test05() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{7,});
        ListNode expected = ListNode.crearListNodeXLista(new int[]{7});
        ListNode result = removeLinkedListElements.removeElements(head, 1);
        assertTrue(ListNode.iguales(expected, result));
    }

    @Test
    public void test06() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{7,});
        ListNode result = removeLinkedListElements.removeElements(head, 7);
        assertNull(result);
    }


}