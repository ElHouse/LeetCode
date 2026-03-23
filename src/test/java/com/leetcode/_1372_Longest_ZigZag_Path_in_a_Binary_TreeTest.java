package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1372_Longest_ZigZag_Path_in_a_Binary_TreeTest {

    private final _1372_Longest_ZigZag_Path_in_a_Binary_Tree longestZigZagPathInABinaryTree = new _1372_Longest_ZigZag_Path_in_a_Binary_Tree();


    @Test
    public void test01() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(1, null, 2, 3, 4, null, null, 5, 6, null, 7, null, null, null, 8));

        TreeNode.imprimirPorNiveles(head);

        assertEquals(3, longestZigZagPathInABinaryTree.longestZigZag(head));
    }


    @Test
    public void test02() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(1, 2, 3, null, 4, null, null, 5, 6, null, 7));

        TreeNode.imprimirPorNiveles(head);

        assertEquals(4, longestZigZagPathInABinaryTree.longestZigZag(head));
    }

    @Test
    public void test03() {

        TreeNode head = TreeNode.crearArbol(List.of(1));

        TreeNode.imprimirPorNiveles(head);

        assertEquals(0, longestZigZagPathInABinaryTree.longestZigZag(head));
    }



}