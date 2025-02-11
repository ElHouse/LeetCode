package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _1038_Binary_Search_Tree_to_Greater_Sum_Tree {

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
//	Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Binary Search Tree to Greater Sum Tree.
    public TreeNode bstToGst(TreeNode root) {

        if (root == null) return null;

        process(root);

        return root;
    }

    int sum = Integer.MIN_VALUE;

    public void process(TreeNode root) {


        if (root.right != null) {
            process(root.right);
        }

        if (sum == Integer.MIN_VALUE) {
            sum = root.val;
        } else {
            sum += root.val;
            root.val = sum;
        }

        if (root.left != null) {
            process(root.left);
        }

    }
}
