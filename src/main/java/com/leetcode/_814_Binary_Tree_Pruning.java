package com.leetcode;

import com.leetcode.structure.TreeNode;


public class _814_Binary_Tree_Pruning {

//	POST ORDER 

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
//	Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Binary Tree Pruning.
    public TreeNode pruneTree(TreeNode root) {

        delete(root);

        return root;
    }

    //
    public boolean delete(TreeNode root) {

        if (root.left != null) {


            boolean delete = delete(root.left);
            if (delete) root.left = null;

        }


        if (root.right != null) {

            boolean delete = delete(root.right);
            if (delete) root.right = null;
        }

        if (root.right == null && root.left == null && root.val == 0) {
            return true;
        }

        return false;
    }


}
