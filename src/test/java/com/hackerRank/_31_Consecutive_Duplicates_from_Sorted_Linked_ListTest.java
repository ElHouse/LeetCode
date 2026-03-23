package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _31_Consecutive_Duplicates_from_Sorted_Linked_ListTest {

    _31_Consecutive_Duplicates_from_Sorted_Linked_List consecutiveDuplicatesFromSortedLinkedList = new _31_Consecutive_Duplicates_from_Sorted_Linked_List();

    @Test
    public void test01() {
        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1, 2, 2, 2, 3, 4, 4, 5});
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1, 2, 3, 4, 5});

        assertTrue(SinglyLinkedListNode.iguales(expected, consecutiveDuplicatesFromSortedLinkedList.deleteDuplicates(head)));
    }


    @Test
    public void test02() {
        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1, 1, 1, 1, 1});
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1});

        assertTrue(SinglyLinkedListNode.iguales(expected, consecutiveDuplicatesFromSortedLinkedList.deleteDuplicates(head)));
    }


    @Test
    public void test03() {
        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1});
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{1});

        assertTrue(SinglyLinkedListNode.iguales(expected, consecutiveDuplicatesFromSortedLinkedList.deleteDuplicates(head)));
    }

    @Test
    public void test04() {

        assertNull(consecutiveDuplicatesFromSortedLinkedList.deleteDuplicates(null));
    }
}