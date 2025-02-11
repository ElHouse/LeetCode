package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1448_Count_Good_Nodes_in_Binary_TreeTest {

    private final _1448_Count_Good_Nodes_in_Binary_Tree countGoodNodesInBinaryTree = new _1448_Count_Good_Nodes_in_Binary_Tree();

    @Test
    public void test01() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3,1,4,3,null,1,5));

        assertEquals(4, countGoodNodesInBinaryTree.goodNodes(head));
    }

    @Test
    public void test02() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3,3, null, 4,2));

        assertEquals(3, countGoodNodesInBinaryTree.goodNodes(head));
    }


    @Test
    public void test03() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3,9,4,3,null,1,5));

        assertEquals(4, countGoodNodesInBinaryTree.goodNodes(head));
    }


    @Test
    public void test04() {

        TreeNode head = TreeNode.crearArbol(Arrays.asList(3,9,4,11,null,1,5));

        assertEquals(5, countGoodNodesInBinaryTree.goodNodes(head));
    }
}