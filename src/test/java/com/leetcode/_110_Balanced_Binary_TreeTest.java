package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _110_Balanced_Binary_TreeTest {

    private final _110_Balanced_Binary_Tree balancedBinaryTree = new _110_Balanced_Binary_Tree();

    @Test
    public void case3() {

        TreeNode r1 = balancedBinaryTree.deserialize("1,2,22,3,33,333,3333,4,44,444,4444,44444,444444,null,null,5,55");
        assertTrue(balancedBinaryTree.isBalanced(r1));
    }

    @Test
    public void case4() {

        TreeNode r1 = balancedBinaryTree.deserialize("1,null,2,null,3");
        assertFalse(balancedBinaryTree.isBalanced(r1));
    }

    @Test
    public void case1() {


        TreeNode r3 = new TreeNode(3);
        TreeNode r9 = new TreeNode(3);
        TreeNode r20 = new TreeNode(3);
        TreeNode r15 = new TreeNode(3);
        TreeNode r7 = new TreeNode(3);

        r3.left = r9;
        r3.right = r20;

        r20.left = r15;
        r20.right = r7;

        assertTrue(balancedBinaryTree.isBalanced(r3));

    }


    @Test
    public void case2() {

        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r22 = new TreeNode(22);
        TreeNode r3 = new TreeNode(3);
        TreeNode r33 = new TreeNode(33);
        TreeNode r4 = new TreeNode(4);
        TreeNode r44 = new TreeNode(44);


        r1.left = r2;
        r1.right = r22;

        r2.left = r3;
        r2.right = r33;

        r3.left = r4;
        r3.right = r44;

        assertFalse(balancedBinaryTree.isBalanced(r1));

    }
}