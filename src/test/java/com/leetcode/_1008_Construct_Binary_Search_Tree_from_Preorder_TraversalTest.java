package com.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _1008_Construct_Binary_Search_Tree_from_Preorder_TraversalTest {


    private final _1008_Construct_Binary_Search_Tree_from_Preorder_Traversal bstFromPreorder = new _1008_Construct_Binary_Search_Tree_from_Preorder_Traversal();

    @Test
    public void case1() {
        int[] nums = {8, 5, 1, 7, 10, 12};
        TreeNode root = bstFromPreorder.bstFromPreorder(nums);

        printTree(root);
    }

    private static boolean hasRight(TreeNode root) {

        return root.right != null;
    }

    private static boolean hasLeft(TreeNode root) {

        return root.left != null;
    }

    private static void printTree(TreeNode root) {

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

}