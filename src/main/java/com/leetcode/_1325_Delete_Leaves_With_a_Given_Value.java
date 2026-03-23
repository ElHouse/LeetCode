package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _1325_Delete_Leaves_With_a_Given_Value {


    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null) return null;

        TreeNode head = new TreeNode(-1);
        head.left = root;

        remove2(head, target);


        /*
                TreeNode head = new TreeNode(-1);
        head.left = root;
        while (remove(head, target)) {
        }

         */

        return head.left;
    }
    //solucion rapida
    private TreeNode remove2(TreeNode root, int target) {

        if (root == null) return null;

        root.left = remove2(root.left, target);
        root.right = remove2(root.right, target);

        if (root.right == null && root.left == null && root.val == target) {
            return null;
        }

        return root;
    }

    //Solucion lenta
    private boolean remove(TreeNode root, int target) {

        if (root == null) return false;

        TreeNode nextLeft = root.left;
        TreeNode nextRight = root.right;


        boolean l = remove(root.left, target);
        boolean r = remove(root.right, target);

        if (nextLeft != null && nextLeft.right == null && nextLeft.left == null && nextLeft.val == target) {
            root.left = null;
            return true;
        }

        if (nextRight != null && nextRight.right == null && nextRight.left == null && nextRight.val == target) {
            root.right = null;
            return true;
        }

        if (l || r) {
            remove(root, target);
        }

        return l || r;
    }
}
