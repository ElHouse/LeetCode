package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _513_Find_Bottom_Left_Tree_ValueTest {

    _513_Find_Bottom_Left_Tree_Value findBottomLeftTreeValue = new _513_Find_Bottom_Left_Tree_Value();

    @Test
    public void case1() {


        System.out.println("-----case1");
//  	    2
//  	   / \
//  	  1   3


        TreeNode root = new TreeNode(2);
        TreeNode rootL = new TreeNode(1);
        TreeNode rootR = new TreeNode(3);

        root.left  = rootL;
        root.right = rootR;

        assertEquals(1, findBottomLeftTreeValue.findBottomLeftValue(root));

    }

    @Test
    public void case2() {

        System.out.println("-----case2");
//        1
//       / \
//      2   3
//     /   / \
//    4   5   6
//       /
//      7
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        TreeNode root7 = new TreeNode(7);

        root1.left  = root2;
        root1.right = root3;

        root2.left = root4;
        root3.left  = root5;
        root3.right = root6;

        root5.left = root7;


        assertEquals(7, findBottomLeftTreeValue.findBottomLeftValue(root1));


    }

    @Test
    public void case3() {


        System.out.println("-----case3");
//      1
//     / \
//    2   3
//   /   / \
//  4   5   6
//       \
//        7
//  	   \
//  		8
//  	   /
//  	  9
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        TreeNode root7 = new TreeNode(7);
        TreeNode root8 = new TreeNode(8);
        TreeNode root9 = new TreeNode(9);

        root1.left  = root2;
        root1.right = root3;

        root2.left = root4;
        root3.left  = root5;
        root3.right = root6;

        root5.right = root7;

        root7.right = root8;
        root8.left = root9;

        assertEquals(9, findBottomLeftTreeValue.findBottomLeftValue(root1));


    }


    @Test
    public void case4() {


        System.out.println("-----case4");
//  	    2
//  	   / \
//  	  1   3


        TreeNode root = new TreeNode(0);

        assertEquals(0, findBottomLeftTreeValue.findBottomLeftValue(root));

    }

    @Test
    public void case5() {


        System.out.println("-----case5");
//  	    2
//  	     \
//  	      3


        TreeNode root = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);

        root.right = rootR;

        assertEquals(3, findBottomLeftTreeValue.findBottomLeftValue(root));

    }
}