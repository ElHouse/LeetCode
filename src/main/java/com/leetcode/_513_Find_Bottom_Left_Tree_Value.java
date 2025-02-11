package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _513_Find_Bottom_Left_Tree_Value {


    int maxLevel = 0;
    int leftest = 0;

    //	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Bottom Left Tree Value.
//	Memory Usage: 39 MB, less than 78.26% of Java online submissions for Find Bottom Left Tree Value.
    public int findBottomLeftValue(TreeNode root) {

        leftest = root.val;
        leftTheMost(root, 1);


        return leftest;
    }


    public void leftTheMost(TreeNode root, int level) {


        if (root == null) return;

        if (level > maxLevel) {
            maxLevel = level;
            leftest = root.val;
        }

        if (root.left != null) leftTheMost(root.left, level + 1);
        if (root.right != null) leftTheMost(root.right, level + 1);

    }


}
