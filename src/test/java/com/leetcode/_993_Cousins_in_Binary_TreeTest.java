package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _993_Cousins_in_Binary_TreeTest {


    _993_Cousins_in_Binary_Tree cousinsInBinaryTreeTest = new _993_Cousins_in_Binary_Tree();

    @Test
    public void case1() {

        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);

        root1.left  = root2;
        root1.right = root3;

        root2.left  = root4;

        assertFalse(cousinsInBinaryTreeTest.isCousins(root1, 4, 3));
    }


    @Test
    public void case2() {

        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);

        root1.left  = root2;
        root1.right = root3;

        root2.left  = root4;

        assertFalse(cousinsInBinaryTreeTest.isCousins(root1, 2, 3));
    }

    @Test
    public void case3() {

        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);

        root1.left  = root2;
        root1.right = root3;

        root2.left  = root4;

        root3.right = root5;

        assertTrue(cousinsInBinaryTreeTest.isCousins(root1, 5, 4));
    }

    @Test
    public void case4() {

        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);

        root1.left  = root2;
        root1.right = root3;

        root2.left  = root4;

        root3.right = root5;

        assertFalse(cousinsInBinaryTreeTest.isCousins(root1, 15, 4));
    }

}