package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _671_Second_Minimum_Node_In_a_Binary_TreeTest {

    private final _671_Second_Minimum_Node_In_a_Binary_Tree secondMinimumNodeInABinaryTree = new _671_Second_Minimum_Node_In_a_Binary_Tree();

    @Test
    public void test01() {

        TreeNode head = new TreeNode(2);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(7);

        head.left = n1;
        head.right = n2;
        n2.left = n3;
        n2.right = n4;

        assertEquals(5, secondMinimumNodeInABinaryTree.findSecondMinimumValue(head));

    }

    @Test
    public void test02() {

        TreeNode head = new TreeNode(2);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);

        head.left = n1;
        head.right = n2;

        assertEquals(-1, secondMinimumNodeInABinaryTree.findSecondMinimumValue(head));

    }

    @Test
    public void test03() {

        TreeNode head = new TreeNode(2);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(2);
        TreeNode n7 = new TreeNode(4);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(2);
        TreeNode n10 = new TreeNode(2);
        TreeNode n11 = new TreeNode(2);
        TreeNode n12 = new TreeNode(2);
        TreeNode n13 = new TreeNode(2);
        TreeNode n14 = new TreeNode(3);


        head.left = n1;
        head.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.right = n6;

        n3.left = n7;//3
        n3.right = n8;

        n4.left = n9;
        n4.right = n10;

        n5.left = n11;
        n5.right = n12;

        n6.left = n13;
        n6.right = n14;


        assertEquals(3, secondMinimumNodeInABinaryTree.findSecondMinimumValue(head));

    }


    @Test
    public void test04() {

        TreeNode head = new TreeNode(2);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(Integer.MAX_VALUE);

        head.left = n1;
        head.right = n2;

        assertEquals(Integer.MAX_VALUE, secondMinimumNodeInABinaryTree.findSecondMinimumValue(head));

    }

}