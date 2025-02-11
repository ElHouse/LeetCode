package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _617_Merge_Two_Binary_TreesTest {

    _617_Merge_Two_Binary_Trees mergeTwoBinaryTrees = new _617_Merge_Two_Binary_Trees();

    @Test
    public void case1() {

        TreeNode t1 = new TreeNode(1);

        TreeNode t1l1 = new TreeNode(3);
        TreeNode t1l2 = new TreeNode(2);
        TreeNode t1r1 = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);

        TreeNode t2l1 = new TreeNode(1);
        TreeNode t2l2 = new TreeNode(3);
        TreeNode t2r2 = new TreeNode(4);
        TreeNode t2r3 = new TreeNode(7);


        t1.left = t1l1;
        t1l1.left = t1r1;
        t1.right = t1l2;

        t2.left = t2l1;
        t2l1.right = t2r2;
        t2.right = t2l2;
        t2l2.right = t2r3;

        printTree(t1);
        System.out.println("---------------------------------------");
        printTree(t2);
        mergeTwoBinaryTrees.merge(t1, t2);
        System.out.println("+++++++++++++++++++++");

        printTree(t1);
        System.out.println("---------------------------------------");
        printTree(t2);

    }


    public void printTree(TreeNode root) {


        if (root.left != null) {

            printTree(root.left);
        }


        if (root.right != null) {

            printTree(root.right);
        }
        System.out.println(root.val);

        //1 3 5 4 2 8 9 7 6
    }

}