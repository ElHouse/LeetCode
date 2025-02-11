package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _1448_Count_Good_Nodes_in_Binary_Tree {

    private int count = 0;

    public int goodNodes(TreeNode root) {

        count = 0;

        process(root, root.val);

        return count ;
    }


    private void process(TreeNode root, int max) {

        if (root == null) return;

        if (root.val >= max) {
            count++;
            max = root.val;
        }

        if (root.left != null) process(root.left, max);
        if (root.right != null) process(root.right, max);
    }


}
