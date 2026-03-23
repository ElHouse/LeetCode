package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1290_Convert_Binary_Number_in_a_Linked_List_to_IntegerTest {

    private final _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer convertBinaryNumberInALinkedListToInteger = new _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer();


    @Test
    public void test01() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1, 0, 1});
        assertEquals(5, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{0});
        assertEquals(0, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }


    @Test
    public void test03() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1});
        assertEquals(1, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));
    }


    @Test
    public void test04() {
        assertEquals(0, convertBinaryNumberInALinkedListToInteger.getDecimalValue(null));
    }

    @Test
    public void test05() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{1});
        assertEquals(1, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));

    }

    @Test
    public void test06() {
        ListNode head = ListNode.crearListNodeXLista(new int[]{0});
        assertEquals(0, convertBinaryNumberInALinkedListToInteger.getDecimalValue(head));    }

}