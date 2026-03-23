package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _98_Validate_Binary_Search_Tree {

    int lasDigit = Integer.MIN_VALUE + 1;
    boolean isValid;

    public boolean isValidBST(TreeNode root) {

        if (root == null) return false;

        isValid = true;

        bt(root);

        return isValid;
    }

    private void bt(TreeNode node) {

        if (!isValid) return;
        if (node == null) return;

        if (node.left != null) bt(node.left);

        if (lasDigit < node.val) {
            lasDigit = node.val;
        } else {
            isValid = false;
        }

        if (node.right != null) bt(node.right);

    }


}
