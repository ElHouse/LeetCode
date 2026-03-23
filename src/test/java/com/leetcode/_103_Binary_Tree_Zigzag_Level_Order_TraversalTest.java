package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _103_Binary_Tree_Zigzag_Level_Order_TraversalTest {


    private final _103_Binary_Tree_Zigzag_Level_Order_Traversal binaryTreeZigzagLevelOrderTraversal = new _103_Binary_Tree_Zigzag_Level_Order_Traversal();

    @Test
    public void test01() {

        TreeNode head = TreeNode.buildTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(20, 9),
                Arrays.asList(15, 7)
        );


        assertEquals(expected, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(head));
    }

    @Test
    public void test02() {

        TreeNode head = TreeNode.buildTree(Arrays.asList(1));
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );


        assertEquals(expected, binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(head));
    }




}