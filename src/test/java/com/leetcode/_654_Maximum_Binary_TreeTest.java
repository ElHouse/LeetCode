package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _654_Maximum_Binary_TreeTest {

    _654_Maximum_Binary_Tree maximumBinaryTree = new _654_Maximum_Binary_Tree();

    /// todo poner un asserts
    @Test
    public void case1() {

        int[] nums = {6, 2, 7, 3, 5, 10, 1, 8, 9, 4};

        TreeNode root = maximumBinaryTree.constructMaximumBinaryTree(nums);

        printTree(root);

    }


    public static void printTree(TreeNode root) {

        boolean isLeaf = true;
        if (hasLeft(root)) {
            System.out.println(root.val);
            isLeaf = false;
            printTree(root.left);
        }
        if (hasRight(root)) {
            System.out.println(root.val);
            isLeaf = false;
            printTree(root.right);
        }

        if (isLeaf) {
            System.out.println(root.val);
            System.out.println("----------------");
        }

    }

    public static boolean hasRight(TreeNode root) {

        return root.right != null;
    }

    public static boolean hasLeft(TreeNode root) {

        return root.left != null;
    }
}