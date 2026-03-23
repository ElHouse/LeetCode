package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _270_Closest_Binary_Search_Tree_Value {


    private int node;
    private double minDiff;

    public int closestValue(TreeNode root, double target) {

        if (root == null) return 0;

        minDiff = Integer.MAX_VALUE;
        node = Integer.MAX_VALUE;

        bts(root, target);

        return node;
    }


    private void bts(TreeNode root, double target) {

        if (root == null) return;

        double diff = Math.abs(target - root.val);

        if (diff < minDiff) {
            minDiff = diff;
            node = root.val;
        } else if (diff == minDiff) {
            node = Math.min(root.val, node);
        }

        bts(root.left, target);
        bts(root.right, target);
    }
}
