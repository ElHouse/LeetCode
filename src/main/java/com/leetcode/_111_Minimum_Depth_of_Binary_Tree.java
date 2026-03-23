package com.leetcode;

import com.leetcode.structure.TreeNode;
/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
 */
public class _111_Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        return dfs(root, 1);
    }


    private int dfs(TreeNode root, int level) {

        if (root == null) return Integer.MAX_VALUE;

        if (root.left == null && root.right == null) {
            return level;
        }

        int L = dfs(root.left, level + 1);
        int R = dfs(root.right, level + 1);

        return Math.min(L, R);
    }

}
