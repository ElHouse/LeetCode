package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _700_Search_in_a_Binary_Search_TreeTest {

    _700_Search_in_a_Binary_Search_Tree searchInABinarySearchTree = new _700_Search_in_a_Binary_Search_Tree();

    @Test
    public void case1() {

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertEquals(root3, searchInABinarySearchTree.searchBST(root1, 7));

    }


    @Test
    public void case2() {

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertEquals(null, searchInABinarySearchTree.searchBST(root1, 71));

    }


    @Test
    public void case3() {

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertEquals(root6, searchInABinarySearchTree.searchBST(root1, 15));

    }


    @Test
    public void case4() {

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        assertEquals(root6.val, searchInABinarySearchTree.searchBST(root1, 15).val);

    }

    @Test
    public void case5() {


        assertEquals(null, searchInABinarySearchTree.searchBST(null, 0));
    }


}