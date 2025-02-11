package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1038_Binary_Search_Tree_to_Greater_Sum_TreeTest {


    private final _1038_Binary_Search_Tree_to_Greater_Sum_Tree binarySearchTreeToGreaterSumTree = new _1038_Binary_Search_Tree_to_Greater_Sum_Tree();

    @Test
    public void case1() {

        TreeNode root4 = new TreeNode(4);

        TreeNode root1 = new TreeNode(1);
        TreeNode root6 = new TreeNode(6);

        TreeNode root0 = new TreeNode(0);
        TreeNode root2 = new TreeNode(2);
        TreeNode root5 = new TreeNode(5);
        TreeNode root7 = new TreeNode(7);

        TreeNode root3 = new TreeNode(3);
        TreeNode root8 = new TreeNode(8);


        root4.left = root1;
        root4.right = root6;

        root1.left = root0;
        root1.right = root2;
        root6.left = root5;
        root6.right = root7;


        root2.right = root3;
        root7.right = root8;

        print(root4);

        assertEquals(root4, binarySearchTreeToGreaterSumTree.bstToGst(root4));

        print(root4);
    }

    private void print(TreeNode root) {

        System.out.println(root.val);

        if (root.left != null) {
            print(root.left);
        }

        if (root.right != null) {
            print(root.right);
        }
    }


}