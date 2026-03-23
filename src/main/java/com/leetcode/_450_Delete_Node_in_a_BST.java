package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _450_Delete_Node_in_a_BST {

    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode prev = new TreeNode(9999);
        prev.right = root;

        dfs(prev, key);

        return prev.right;
    }

    private TreeNode dfs(TreeNode root, int key) {

        if (root == null) return null;

        if (root.val == key) {
            return root;
        }

        TreeNode L = dfs(root.left, key);
        TreeNode R = dfs(root.right, key);

        if (L != null) {
            if (L.left == null && L.right == null) {//una leaf
                root.left = null;
            } else if (L.left != null && L.right == null) {
                root.left = L.left;
            } else if (L.left == null) {
                root.left = L.right;
            } else {
                TreeNode newL = L.left;
                TreeNode newR = L.right;

                TreeNode aux = buscarMasGrande(newL);
                aux.right = newR;
                root.left = newL;
            }
        } else if (R != null) {
            if (R.left == null && R.right == null) {//una leaf
                root.right = null;
            } else if (R.left != null && R.right == null) {
                root.right = R.left;
            } else if (R.left == null) {
                root.right = R.right;
            } else {
                TreeNode newL = R.left;
                TreeNode newR = R.right;

                TreeNode aux = buscarMasGrande(newL);
                aux.right = newR;
                root.right = newL;
            }
        }

        return null;
    }


    public TreeNode buscarMasGrande(TreeNode root) {

        TreeNode element = root;

        while (element.right != null) {
            element = element.right;
        }

        return element;
    }


}
