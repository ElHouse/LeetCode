package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _236_Lowest_Common_Ancestor_of_a_Binary_TreeTest {

    private final _236_Lowest_Common_Ancestor_of_a_Binary_Tree lowestCommonAncestorOfABinaryTree = new _236_Lowest_Common_Ancestor_of_a_Binary_Tree();


    @Test
    public void test01() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

        TreeNode result = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(head, p, q);

        assertEquals(3, result.val);
    }


    @Test
    public void test02() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);

        assertEquals(5, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(head, p, q).val);
    }

    @Test
    public void test03() {

        TreeNode head = new TreeNode(1, new TreeNode(2), null);

        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);

        assertEquals(1, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(head, p, q).val);
    }

    @Test
    public void test04() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(
                37,
                -34, -48,
                null, -100, -101, 48,
                null, null, null, null, -54, null, -71, -22,
                null, null, null, 8));

        TreeNode p = new TreeNode(-71);
        TreeNode q = new TreeNode(8);

        assertEquals(-54, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(head, p, q).val);
    }

    @Test
    public void test05() {
        List<Integer> lista = new ArrayList<>();

        for (int i = -1; i < 10_000; i++) {
            lista.add(i);
            lista.add(null);
        }

        TreeNode head = TreeNode.crearArbol(lista);
        lista.clear();
        TreeNode p = new TreeNode(9998);
        TreeNode q = new TreeNode(9997);

        assertEquals(-54, lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(head, p, q).val);
    }

}

