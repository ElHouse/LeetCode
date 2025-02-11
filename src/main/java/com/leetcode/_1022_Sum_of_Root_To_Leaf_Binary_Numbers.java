package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _1022_Sum_of_Root_To_Leaf_Binary_Numbers {

    private int response = 0;

    public int sumRootToLeaf(TreeNode root) {

        if (root == null) return 0;

        suma(root, "");

        return response;
    }

    private void suma(TreeNode root, String number) {

        if (root == null) return;

        if (root.left == null && root.right == null) {

            response += Integer.valueOf(number + root.val, 2);
            return;
        }

        suma(root.left, number + root.val);
        suma(root.right, number + root.val);
    }


}
