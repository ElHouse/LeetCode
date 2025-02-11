package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _98_Validate_Binary_Search_TreeTest {

    _98_Validate_Binary_Search_Tree validateBinarySearchTree = new _98_Validate_Binary_Search_Tree();

    @Test
    public void case1() {

        TreeNode root1 = new TreeNode(10);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertFalse(validateBinarySearchTree.isValidBST(root1));


    }

    @Test
    public void case2() {
        System.out.println("case 2");

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertTrue(validateBinarySearchTree.isValidBST(root1));
    }


    @Test
    public void case3() {

        System.out.println("case 3");

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);
        TreeNode root7 = new TreeNode(12);
        TreeNode root8 = new TreeNode(20);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root6.left = root7;
        root6.right = root8;

        assertFalse(validateBinarySearchTree.isValidBST(root1));


    }
}