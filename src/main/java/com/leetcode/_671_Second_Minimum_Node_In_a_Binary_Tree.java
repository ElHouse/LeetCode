package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _671_Second_Minimum_Node_In_a_Binary_Tree {

    int aux = Integer.MAX_VALUE;
    boolean found = false;

    public int findSecondMinimumValue(TreeNode root) {

        if (root == null) return -1;

        found = false;
        int min = root.val;
        aux = Integer.MAX_VALUE;

        process(root, min);

        if (aux != min && found) {
            return aux;
        }

        return -1;
    }


    private void process(TreeNode root, int min) {


        if (root.left != null) {
            process(root.left, min);
        }

        if (root.right != null) {
            process(root.right, min);
        }

        if (min < root.val && root.val <= aux) {
            aux = root.val;
            found = true;
        }
    }

}
