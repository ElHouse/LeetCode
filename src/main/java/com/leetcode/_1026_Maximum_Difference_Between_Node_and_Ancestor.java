package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _1026_Maximum_Difference_Between_Node_and_Ancestor {

    public int maxAncestorDiff(TreeNode root) {

        if (root == null) return 0;

        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode root, int max, int min) {

        if (root == null) return 0;

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        int val = Math.max(
                Math.abs(max - root.val),
                Math.abs(min - root.val)
        );

        int L = dfs(root.left, max, min);
        int R = dfs(root.right, max, min);

        int LRMAX = Math.max(L, R);

        return Math.max(val, LRMAX);

    }

}
