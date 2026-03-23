package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _437_Path_Sum_III {
    /*
    Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

    The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

    Example 1:
    Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
    Output: 3
    Explanation: The paths that sum to 8 are shown.

    Example 2:
    Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
    Output: 3
     */
    private int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        count = 0;

        long[] paths = new long[0];

        process(root, targetSum, paths);

        return count;
    }


    private void process(TreeNode root, int targetSum, long[] paths) {

        long[] aux = new long[paths.length + 1];

        for (int i = 0; i < paths.length; i++) {
            aux[i] = paths[i] + root.val;
            if (aux[i] == targetSum) {
                count++;
            }
        }

        aux[paths.length] = root.val;
        if (root.val == targetSum) {
            count++;
        }

        if (root.left != null) process(root.left, targetSum, aux);
        if (root.right != null) process(root.right, targetSum, aux);
    }


}
