package com.leetcode;

import com.leetcode.structure.TreeNode;
/*
You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them
 */
public class _701_Insert_into_a_Binary_Search_Tree {

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
//	Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (root.val < val) {

            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                insertIntoBST(root.right, val);
            }

        } else {

            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                insertIntoBST(root.left, val);
            }
        }

        return root;
    }


}



























