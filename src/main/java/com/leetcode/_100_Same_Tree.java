package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _100_Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return dfs(p,q);
    }

    private boolean dfs(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null) return false;
        if (q == null) return false;

        if (p.val != q.val) return false;

        boolean L = dfs(p.left, q.left);
        boolean R = dfs(p.right, q.right);

        return L && R;
    }

}
