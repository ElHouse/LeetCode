package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _1372_Longest_ZigZag_Path_in_a_Binary_Tree {
    /*

    You are given the root of a binary tree.

    A ZigZag path for a binary tree is defined as follows:

        * Choose any node in the binary tree and a direction (right or left).
        * If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
        * Change the direction from right to left or from left to right.
        * Repeat the second and third steps until you can't move in the tree.

    Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

    Return the longest ZigZag path contained in that tree.

    */

    private int max = 0;

    public int longestZigZag(TreeNode root) {

        if (root == null) return 0;

        max = 0;

        process(root, 0, true);

        return max;
    }

    private void process(TreeNode root, int count, boolean left) {

        max = Math.max(max, count);

        if (left) {
            if (root.right != null) process(root.right, count + 1, false);
            if (root.left != null) process(root.left, 1, true);

        } else {
            if (root.left != null) process(root.left, count + 1, true);
            if (root.right != null) process(root.right, 1, false);
        }


    }


}