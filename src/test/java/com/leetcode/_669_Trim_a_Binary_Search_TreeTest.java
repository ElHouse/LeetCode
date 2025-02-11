package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _669_Trim_a_Binary_Search_TreeTest {

    _669_Trim_a_Binary_Search_Tree trimABinarySearchTree = new _669_Trim_a_Binary_Search_Tree();
    @Test
    public void case1() {
        System.out.println("---------case 1");
//	    3
//	    / \
//	   0   4
//	    \
//	     2
//	    /
//	   1


        TreeNode root3 = new TreeNode(3);
        TreeNode root0 = new TreeNode(0);
        TreeNode root4 = new TreeNode(4);
        TreeNode root2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1);


        root3.left  = root0;
        root3.right = root4;
        root0.right = root2;
        root2.left = root1;

        System.out.println("antes");
        System.out.println(print(root3));

        TreeNode answer = trimABinarySearchTree.trimBST(root3, 1, 3);

        System.out.println("despues");
        System.out.println(print(answer));

    }


    @Test
    public void case2() {
        System.out.println("---------case 2");
//	    3
//	    / \
//	   0   4
//	    \
//	     2
//	    /
//	   1


        TreeNode root0 = new TreeNode(0);
        TreeNode root2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1);


        root1.left  = root0;
        root1.right = root2;

        System.out.println("antes");
        System.out.println(print(root1));

        TreeNode answer =  trimABinarySearchTree.trimBST(root1, 1, 3);

        System.out.println("despues");
        System.out.println(print(answer));

    }


    public String print(TreeNode root) {

        if(root == null) return "x";

        StringBuilder sb = new StringBuilder(String.valueOf(root.val));

        sb.append(" ");

        if(root.left!= null) {
            sb.append( print(root.left));
        }



        if(root.right!= null) {
            sb.append( print(root.right));
        }

        return sb.toString();
    }
}