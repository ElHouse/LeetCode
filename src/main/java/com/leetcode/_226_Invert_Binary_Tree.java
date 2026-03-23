package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _226_Invert_Binary_Tree {


    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        invert(root);
        return root;
    }


    private void invert(TreeNode root) {

        if (root == null) return;

        TreeNode r = root.right;

        root.right = root.left;
        root.left = r;

        if (root.left != null) invert(root.left);
        if (root.right != null) invert(root.right);
    }


}
