package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _563_Binary_Tree_Tilt {

    private int result = 0;

    public int findTilt(TreeNode root) {
        result = 0;

        process(root);

        return result;
    }


    private int process(TreeNode root) {

        if (root == null) return 0;

        int izq = process(root.left);
        int der = process(root.right);

        result += Math.abs(izq - der);

        return izq + der + root.val;
    }

}
