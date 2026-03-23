package com.hackerRank;

import com.hackerRank.structure.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _32_Reverse_Even_Indexed_Nodes_and_AppendTest_32_Reverse_Even_Indexed_Nodes_and_Append {

    _32_Reverse_Even_Indexed_Nodes_and_Append reverseEvenIndexedNodesAndAppend = new _32_Reverse_Even_Indexed_Nodes_and_Append();


    @Test
    public void test01() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{200, 400, 600, 800, 700, 500, 300, 100});

        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{100, 200, 300, 400, 500, 600, 700, 800});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }

    @Test
    public void test02() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{200, 400, 600, 700, 500, 300, 100});


        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{100, 200, 300, 400, 500, 600, 700});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }

    @Test
    public void test03() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{200, 300});


        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{300, 200});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }

    @Test
    public void test04() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{200});


        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{200});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }


    @Test
    public void test05() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{22, 33, 11});


        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{11, 22, 33});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }

    @Test
    public void test06() {
        SinglyLinkedListNode expected = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{22, 44, 33, 11});


        SinglyLinkedListNode head = SinglyLinkedListNode.crearSinglyLinkedListNodeXLista(new int[]{11, 22, 33, 44});
        SinglyLinkedListNode.print(head);
        assertTrue(SinglyLinkedListNode.iguales(expected, reverseEvenIndexedNodesAndAppend.extractAndAppendSponsoredNodes(head)));
    }
}