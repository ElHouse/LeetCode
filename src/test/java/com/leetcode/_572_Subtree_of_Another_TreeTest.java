package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _572_Subtree_of_Another_TreeTest {
    _572_Subtree_of_Another_Tree subtreeOfAnotherTree = new _572_Subtree_of_Another_Tree();


    @Test
    public void case1() {

        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);


        root3.left = root4;
        root3.right = root5;
        root4.left = root1;
        root4.right = root2;


        TreeNode roo4 = new TreeNode(4);
        TreeNode roo1 = new TreeNode(1);
        TreeNode roo2 = new TreeNode(2);

        roo4.left = roo1;
        roo4.right = roo2;

        assertTrue(subtreeOfAnotherTree.isSubtree(root3, roo4));


    }

    @Test
    public void case2() {

        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root0 = new TreeNode(0);

        root3.left = root4;
        root3.right = root5;
        root4.left = root1;
        root4.right = root2;
        root2.left = root0;

        TreeNode roo4 = new TreeNode(4);
        TreeNode roo1 = new TreeNode(1);
        TreeNode roo2 = new TreeNode(2);

        roo4.left = roo1;
        roo4.right = roo2;

        assertFalse(subtreeOfAnotherTree.isSubtree(root3, roo4));
    }


    @Test
    public void case3() {

        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root0 = new TreeNode(0);

        root3.left = root4;
        root3.right = root5;
        root4.left = root1;
        root4.right = root2;
        root2.left = root0;

        TreeNode roo4 = new TreeNode(4);
        TreeNode roo1 = new TreeNode(1);
        TreeNode roo2 = new TreeNode(2);
        TreeNode roo0 = new TreeNode(0);

        roo4.left = roo1;
        roo4.right = roo2;
        roo2.left = roo0;

        assertTrue(subtreeOfAnotherTree.isSubtree(root3, roo4));
    }


    @Test
    public void case4() {

        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root0 = new TreeNode(0);

        root3.left = root4;
        root3.right = root5;
        root4.left = root1;
        root4.right = root2;
        root2.left = root0;

        TreeNode roo4 = new TreeNode(4);
        TreeNode roo1 = new TreeNode(1);
        TreeNode roo2 = new TreeNode(2);
        TreeNode roo0 = new TreeNode(0);

        roo4.left = roo1;
        roo4.right = roo2;
        roo2.left = roo0;

        assertTrue(subtreeOfAnotherTree.isSubtree(root3, root3));
    }


    @Test
    public void case5() {

        TreeNode root3 = new TreeNode(3);


        TreeNode roo4 = new TreeNode(3);


        assertTrue(subtreeOfAnotherTree.isSubtree(root3, roo4));
    }
}