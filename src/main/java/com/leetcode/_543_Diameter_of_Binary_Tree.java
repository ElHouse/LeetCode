package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _543_Diameter_of_Binary_Tree {

    private int result = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        result = -1;

        process(root);

        return result;
    }


    private int process(TreeNode root) {

        if (root == null) return 0;

        int izq = process(root.left);
        int der = process(root.right);

        result = Math.max(izq + der, result);

        return 1 + Math.max(izq, der);
    }


}
