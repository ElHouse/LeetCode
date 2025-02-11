package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _938_Range_Sum_of_BSTTest {

    _938_Range_Sum_of_BST rangeSumOfBst = new _938_Range_Sum_of_BST();

    @Test
    public void case1() {

        TreeNode root1 = new TreeNode(10);

        TreeNode root5 = new TreeNode(5);
        TreeNode root15 = new TreeNode(15);


        TreeNode root3 = new TreeNode(3);
        TreeNode root7 = new TreeNode(7);


        TreeNode root18 = new TreeNode(18);


        root1.left = root5;
        root1.right = root15;

        root5.left = root3;
        root5.right = root7;

        root7.right = root18;


        assertEquals(32, rangeSumOfBst.rangeSumBST(root1, 7, 15));

    }

    @Test
    public void case2() {

        TreeNode root1 = new TreeNode(10);

        TreeNode root5 = new TreeNode(5);
        TreeNode root15 = new TreeNode(15);


        TreeNode root3 = new TreeNode(3);
        TreeNode root7 = new TreeNode(7);

        TreeNode root13 = new TreeNode(13);
        TreeNode root18 = new TreeNode(18);

        TreeNode root2 = new TreeNode(2);
        TreeNode root6 = new TreeNode(6);


        root1.left = root5;
        root1.right = root15;

        root5.left = root3;
        root5.right = root7;

        root7.left = root13;
        root7.right = root18;


        root13.left = root2;
        root13.right = root6;


        assertEquals(23, rangeSumOfBst.rangeSumBST(root1, 6, 10));

    }
}