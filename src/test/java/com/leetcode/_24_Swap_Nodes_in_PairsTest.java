package com.leetcode;

import com.leetcode.structure.ListNode;
import org.junit.jupiter.api.Test;

import static com.leetcode.structure.ListNode.crearListNodeXLista;

class _24_Swap_Nodes_in_PairsTest {

    private final _24_Swap_Nodes_in_Pairs swapNodesInPairs = new _24_Swap_Nodes_in_Pairs();


    @Test
    public void test1() {

        ListNode head = crearListNodeXLista(new int[]{1, 2, 3, 4, 5, 6});
        ListNode.imprimir(head);
        ListNode response = swapNodesInPairs.swapPairs(head);
        ListNode.imprimir(response);

    }

    @Test
    public void test2() {

        ListNode head = crearListNodeXLista(new int[]{1, 2, 3, 4, 5});
        ListNode.imprimir(head);
        ListNode response = swapNodesInPairs.swapPairs(head);
        ListNode.imprimir(response);
    }

    @Test
    public void test3() {

        ListNode head = crearListNodeXLista(new int[]{1, 2});
        ListNode.imprimir(head);
        ListNode response = swapNodesInPairs.swapPairs(head);
        ListNode.imprimir(response);

    }

    @Test
    public void test4() {

        ListNode head = crearListNodeXLista(new int[]{1});
        ListNode.imprimir(head);
        ListNode response = swapNodesInPairs.swapPairs(head);
        ListNode.imprimir(response);

    }

    @Test
    public void test5() {
        ListNode response = swapNodesInPairs.swapPairs(null);
        ListNode.imprimir(response);
    }


}



