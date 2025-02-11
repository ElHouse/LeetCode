package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _897_Increasing_Order_Search_TreeTest {

    _897_Increasing_Order_Search_Tree increasingOrderSearchTree = new _897_Increasing_Order_Search_Tree();

    @Test
    public void case1() {

        TreeNode root = new TreeNode(5);

        TreeNode root11 = new TreeNode(3);
        TreeNode root12 = new TreeNode(6);

        TreeNode root21 = new TreeNode(2);
        TreeNode root22 = new TreeNode(4);
        TreeNode root23 = new TreeNode(8);

        TreeNode root31 = new TreeNode(1);
        TreeNode root32 = new TreeNode(7);
        TreeNode root33 = new TreeNode(9);

        root.left  = root11;
        root.right = root12;

        root11.left = root21;
        root11.right = root22;

        root12.right = root23;

        root21.left = root31;

        root23.left = root32;
        root23.right = root33;

//
        System.out.println("---------INICIA");
        printRight(root);

        root = increasingOrderSearchTree.increasingBST(root);

        System.out.println("-----FINAL");
        printRight(root);

    }


    public void printRight(TreeNode root) {
        if(root.left != null) {
            System.out.println("mal>"+root.left.val);
            printRight(root.left);

        }
        System.out.println(root.val);

        if(root.right != null) {
            printRight(root.right);
        }
    }

    public void printInOrder(TreeNode root) {
        if(root.left != null) {
            printRight(root.left);
        }
        System.out.println(root.val);

        if(root.right != null) {
            printRight(root.right);
        }
    }

}