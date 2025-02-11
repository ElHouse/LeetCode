package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _230_Kth_Smallest_Element_in_a_BST {

    private boolean found = false;
    private int count = 0;
    private int response = 0;

    public int kthSmallest(TreeNode root, int k) {

        count = 0;
        found = false;

        if (root == null) return 0;

        process(root, k);

        return response;
    }


    private void process(TreeNode root, int k) {

        if (found) return;

        if (root.left != null) {
            process(root.left, k);
        }


        count++;
        if (count == k) {
            found = true;
            response = root.val;
        }

        if (root.right != null) {
            process(root.right, k);
        }

    }
}
