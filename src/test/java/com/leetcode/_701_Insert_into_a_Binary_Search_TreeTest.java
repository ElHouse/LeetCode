package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _701_Insert_into_a_Binary_Search_TreeTest {


    _701_Insert_into_a_Binary_Search_Tree insertIntoABinarySearchTree = new _701_Insert_into_a_Binary_Search_Tree();

//	@Test
//	public void case1() {
//
//		TreeNode root = new TreeNode(4);
//
//		TreeNode l1 = new TreeNode(2);
//		TreeNode l2 = new TreeNode(1);
//		TreeNode l3 = new TreeNode(3);
//
//		TreeNode r1 = new TreeNode(7);
//
//
//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//
//		root.right = r1;
//
//		insertIntoBST(root, 5);
//	}


    @Test
    public void case2() {

        TreeNode root = new TreeNode(10);

        TreeNode l1 = new TreeNode(5);
        TreeNode l2 = new TreeNode(3);
        TreeNode l3 = new TreeNode(7);

        TreeNode r1 = new TreeNode(15);
        TreeNode r2 = new TreeNode(18);
        TreeNode r3 = new TreeNode(13);


//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//
//		root.right = r1;
//		r1.left  = r3;
//		r1.right = r2;
//

        insertIntoABinarySearchTree.insertIntoBST(root, 2);
    }


//	@Test
//	public void case3() {
//
//		TreeNode root = new TreeNode(10);
//
//		TreeNode l1 = new TreeNode(5);
//		TreeNode l2 = new TreeNode(3);
//		TreeNode l3 = new TreeNode(7);
//
//		TreeNode r1 = new TreeNode(15);
//		TreeNode r2 = new TreeNode(13);
//		TreeNode r3 = new TreeNode(17);
//
//
//		root.left = l1;
//		l1.right  = l3;
//		l1.left   = l2;
//
//		root.right = r1;
//		r1.left = r2;
//		r3.right = r3;
//
//
//		insertIntoBST(root, 1);
//	}
}