package com.leetcode;

import com.leetcode.structure.TreeNode;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 */
public class _101_Symmetric_Tree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return symmetric(root.left, root.right);
    }

    private boolean symmetric(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) return true;
        else if (root1 == null) return false;
        else if (root2 == null) return false;

        if (root1.val != root2.val) {
            return false;
        }

        boolean l = symmetric(root1.left, root2.right);
        boolean r = symmetric(root1.right, root2.left);

        return l && r;
    }
}
