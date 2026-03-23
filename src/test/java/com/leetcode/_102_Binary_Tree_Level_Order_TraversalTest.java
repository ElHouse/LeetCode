package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _102_Binary_Tree_Level_Order_TraversalTest {


    private final _102_Binary_Tree_Level_Order_Traversal binaryTreeLevelOrderTraversal = new _102_Binary_Tree_Level_Order_Traversal();

    @Test
    public void test01(){
        TreeNode head = TreeNode.buildTree(Arrays.asList(3,9,20,null,null,15,7));
        List<List<Integer>> listaAnidada = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        assertEquals(listaAnidada, binaryTreeLevelOrderTraversal.levelOrder(head));

    }


    @Test
    public void test02(){
        TreeNode head = TreeNode.buildTree(Arrays.asList(1));
        List<List<Integer>> listaAnidada = Arrays.asList(
                Arrays.asList(1)
        );

        assertEquals(listaAnidada, binaryTreeLevelOrderTraversal.levelOrder(head));

    }
}