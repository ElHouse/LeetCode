package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _235_Lowest_Common_Ancestor_of_a_Binary_Search_TreeTest {


    private final _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree lowestCommonAncestorOfABinarySearchTree = new _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree();

    @Test
    public void case1() {
//	       13
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30
//	/ \   / \
//	3 8  10 12
//   \
// 	  6
        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root51 = new TreeNode(10);
        TreeNode root52 = new TreeNode(12);
        TreeNode root6 = new TreeNode(15);

        TreeNode rootx = new TreeNode(3);
        TreeNode rooty = new TreeNode(6);

        TreeNode roota = new TreeNode(14);
        TreeNode rootb = new TreeNode(30);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root5.left = root51;
        root5.right = root52;

        root3.left = rootx;
        rootx.right = rooty;

        root6.left = roota;
        root6.right = rootb;


        assertEquals(13, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, rooty, rootb).val);
    }


    @Test
    public void case2() {
//	       13
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30
//	/ \   / \
//	3 8  10 12
//   \
// 	  6
        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root51 = new TreeNode(10);
        TreeNode root52 = new TreeNode(12);
        TreeNode root6 = new TreeNode(15);

        TreeNode rootx = new TreeNode(3);
        TreeNode rooty = new TreeNode(6);

        TreeNode roota = new TreeNode(14);
        TreeNode rootb = new TreeNode(30);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root5.left = root51;
        root5.right = root52;

        root3.left = rootx;
        rootx.right = rooty;

        root6.left = roota;
        root6.right = rootb;


        assertEquals(7, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, rootx, root4).val);
    }


    @Test
    public void case3() {
//	       13
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30
//	/ \   / \
//	3 8  10 12
//   \
// 	  6
        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root51 = new TreeNode(10);
        TreeNode root52 = new TreeNode(12);
        TreeNode root6 = new TreeNode(15);

        TreeNode rootx = new TreeNode(3);
        TreeNode rooty = new TreeNode(6);

        TreeNode roota = new TreeNode(14);
        TreeNode rootb = new TreeNode(30);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root5.left = root51;
        root5.right = root52;

        root3.left = rootx;
        rootx.right = rooty;

        root6.left = roota;
        root6.right = rootb;


        assertEquals(9, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, rootx, root5).val);
    }


    @Test
    public void case4() {
//	       13
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30
//	/ \   / \
//	3 8  10 12
//   \
// 	  6
        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root51 = new TreeNode(10);
        TreeNode root52 = new TreeNode(12);
        TreeNode root6 = new TreeNode(15);

        TreeNode rootx = new TreeNode(3);
        TreeNode rooty = new TreeNode(6);

        TreeNode roota = new TreeNode(14);
        TreeNode rootb = new TreeNode(30);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root5.left = root51;
        root5.right = root52;

        root3.left = rootx;
        rootx.right = rooty;

        root6.left = roota;
        root6.right = rootb;


        assertEquals(15, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, roota, rootb).val);
    }

    @Test
    public void case5() {
//	       13
//	     /     \
//	    9       15
//    /   \	   /  \
//	 7    11  14   30
//	/ \   / \
//	3 8  10 12
//   \
// 	  6
        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root51 = new TreeNode(10);
        TreeNode root52 = new TreeNode(12);
        TreeNode root6 = new TreeNode(15);

        TreeNode rootx = new TreeNode(3);
        TreeNode rooty = new TreeNode(6);

        TreeNode roota = new TreeNode(14);
        TreeNode rootb = new TreeNode(30);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        root5.left = root51;
        root5.right = root52;

        root3.left = rootx;
        rootx.right = rooty;

        root6.left = roota;
        root6.right = rootb;


        assertEquals(7, lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root1, root3, root4).val);
    }

}