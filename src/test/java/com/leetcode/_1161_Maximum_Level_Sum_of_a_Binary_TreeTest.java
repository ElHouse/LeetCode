package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _1161_Maximum_Level_Sum_of_a_Binary_TreeTest {


    private final _1161_Maximum_Level_Sum_of_a_Binary_Tree maximumLevelSumOfABinaryTree = new _1161_Maximum_Level_Sum_of_a_Binary_Tree();


    @Test
    public void test01() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, 7, 0, 7, -8, null, null));

        assertEquals(2, maximumLevelSumOfABinaryTree.maxLevelSum(head));
    }

    @Test
    public void test02() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(989, null, 10250, 98693, -89388, null, null, null, -32127));

        assertEquals(2, maximumLevelSumOfABinaryTree.maxLevelSum(head));
    }

    @Test
    public void test03() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, 7, 0, 7, -8, null, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1, 1));

        assertEquals(4, maximumLevelSumOfABinaryTree.maxLevelSum(head));
    }

    @Test
    public void test04() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, 7, 0, 7, -8, null, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));

        assertEquals(2, maximumLevelSumOfABinaryTree.maxLevelSum(head));
    }

    @Test
    public void test05() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(-100,-200,-300,-20,-5,-10,null));

        assertEquals(3, maximumLevelSumOfABinaryTree.maxLevelSum(head));
    }

}