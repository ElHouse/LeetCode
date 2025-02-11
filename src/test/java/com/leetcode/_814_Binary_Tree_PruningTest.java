package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _814_Binary_Tree_PruningTest {

    _814_Binary_Tree_Pruning binaryTreePruning = new _814_Binary_Tree_Pruning();
//    @Test
//    public void case1() {
//
//    	TreeNode root = new TreeNode(0);
//
//    	TreeNode l1 = new TreeNode(1);
//    	TreeNode l2 = new TreeNode(1);
//    	TreeNode l3 = new TreeNode(1);
//    	TreeNode l4 = new TreeNode(0);
//
//    	TreeNode r1 = new TreeNode(0);
//    	TreeNode r2 = new TreeNode(1);
//    	TreeNode r3 = new TreeNode(0);
//
//    	root.right = r1;
//    	r1.right = r2;
//    	r1.left  = r3;
//
//    	root.left = l1;
//    	l1.left   = l2;
//    	l1.right  = l3;
//
//    	l2.left = l4;
//
//    	printTree(root);
//    	pruneTree(root);
//    	System.out.println("+++++++++++++++++++++");
//    	printTree(root);
//
//
//    }

//    @Test
//    public void case1() {
//
//    	TreeNode root = new TreeNode(1);
//
//    	TreeNode l1 = new TreeNode(0);
//    	TreeNode l2 = new TreeNode(0);
//    	TreeNode l3 = new TreeNode(0);
//
//    	TreeNode r1 = new TreeNode(1);
//    	TreeNode r2 = new TreeNode(1);
//    	TreeNode r3 = new TreeNode(0);
//
//
//    	root.left = l1;
//    	l1.left = l2;
//    	l1.right = l3;
//
//    	root.right = r1;
//    	r1.left = r3;
//    	r1.right = r2;
//
//    	printTree(root);
//    	pruneTree(root);
//    	System.out.println("+++++++++++++++++++++");
//    	printTree(root);
//
//
//    }


    @Test
    public void case1() {

        TreeNode root = new TreeNode(1);

        TreeNode l2 = new TreeNode(0);
        TreeNode l3 = new TreeNode(0);
        TreeNode r1 = new TreeNode(1);

        root.right = l2;
        l2.left = l3;
        l2.right = r1;


        printTree(root);
        binaryTreePruning.pruneTree(root);
        System.out.println("+++++++++++++++++++++");
        printTree(root);


    }

    public void printTree(TreeNode root) {


        if (root.left != null) {

            printTree(root.left);
        }


        if (root.right != null) {

            printTree(root.right);
        }
        System.out.println(root.val + "-- " + root);

        //1 3 5 4 2 8 9 7 6
    }
}