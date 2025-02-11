package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _98_Validate_Binary_Search_Tree {

    //	Runtime: 1 ms, faster than 49.58% of Java online submissions for Validate Binary Search Tree.
//	Memory Usage: 38.9 MB, less than 82.33% of Java online submissions for Validate Binary Search Tree.
    int lasDigit = Integer.MIN_VALUE + 1;

    public boolean isValidBST(TreeNode root) {

        try {
            algo(root);
        } catch (Exception e) {
            return false;
        }

        return true;
    }


    public void algo(TreeNode root) throws Exception {


        if (root.left != null) {
            algo(root.left);
        }

        if (lasDigit == Integer.MIN_VALUE + 1) {
            lasDigit = root.val;
        } else if (lasDigit > root.val) {

            System.out.println("ex root>" + root.val);
            System.out.println("ex last>" + lasDigit);
            throw new Exception("nop");
        } else {
            lasDigit = root.val;
        }

        if (root.right != null) {
            algo(root.right);
        }


    }



}
