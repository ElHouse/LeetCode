package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _617_Merge_Two_Binary_Trees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        merge(t1, t2);
        return t1;
    }

    public TreeNode merge(TreeNode t1, TreeNode t2) {

        if (t1 != null && t2 != null) {

            t1.val = t1.val + t2.val;
            t2.val = 0;
        }

        if (t1.left != null && t2.left != null) {

            merge(t1.left, t2.left);
        }

        if (t1.right != null && t2.right != null) {

            merge(t1.right, t2.right);
        }

        if (t1.right == null && t2.right != null) {

            t1.right = t2.right;
        }

        if (t1.left == null && t2.left != null) {

            t1.left = t2.left;
        }

        return t1;
    }


}
