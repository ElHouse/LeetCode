package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _230_Kth_Smallest_Element_in_a_BSTTest {


    private final _230_Kth_Smallest_Element_in_a_BST kthSmallestElementInABst = new _230_Kth_Smallest_Element_in_a_BST();

    @Test
    void test() {

        List<Integer> lista = Arrays.asList(3, 1, 4, null, 2);

        TreeNode head = TreeNode.crearArbol(lista);

        assertEquals(1, kthSmallestElementInABst.kthSmallest(head, 1));
        assertEquals(2, kthSmallestElementInABst.kthSmallest(head, 2));
        assertEquals(3, kthSmallestElementInABst.kthSmallest(head, 3));
        assertEquals(4, kthSmallestElementInABst.kthSmallest(head, 4));
    }


    @Test
    void test2() {
//TODO el arbol no se crea corretamente
        List<Integer> lista = Arrays.asList(5,3,6,2,4,null,null,1);

        TreeNode head = TreeNode.crearArbol(lista);

        head.left.left.left = new TreeNode(1);

        assertEquals(1, kthSmallestElementInABst.kthSmallest(head, 1));
        assertEquals(2, kthSmallestElementInABst.kthSmallest(head, 2));
        assertEquals(3, kthSmallestElementInABst.kthSmallest(head, 3));
        assertEquals(4, kthSmallestElementInABst.kthSmallest(head, 4));
        assertEquals(5, kthSmallestElementInABst.kthSmallest(head, 5));
        assertEquals(6, kthSmallestElementInABst.kthSmallest(head, 6));

    }


    @Test
    void test3() {

        List<Integer> lista = Arrays.asList(9);

        TreeNode head = TreeNode.crearArbol(lista);

        assertEquals(9, kthSmallestElementInABst.kthSmallest(head, 1));
    }
}