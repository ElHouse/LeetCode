package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _404_Sum_of_Left_Leaves {

    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;

        if (root == null) return 0;

        process(root, 'R');

        return sum;
    }

    private void process(TreeNode root, char lado) {

        if (lado == 'L' && root.left == null && root.right == null) {
            sum += root.val;
            return;
        }

        if (root.left != null) {
            process(root.left, 'L');
        }
        if (root.right != null) {
            process(root.right, 'R');
        }
    }
}
