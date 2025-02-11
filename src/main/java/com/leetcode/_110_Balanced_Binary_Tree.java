package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _110_Balanced_Binary_Tree {

    //	Runtime: 1 ms, faster than 99.92% of Java online submissions for Balanced Binary Tree.
//	Memory Usage: 38.4 MB, less than 90.74% of Java online submissions for Balanced Binary Tree.
    public boolean isBalanced(TreeNode root) {

        algo(root);

        return answer;
    }

    boolean answer = true;

    public int algo(TreeNode node) {

        if (!answer) {

        } else if (node.left == null && node.right == null) {
            return 1;
        } else {

            int l = 0;
            int r = 0;

            if (node.left != null) l = algo(node.left);
            if (node.right != null) r = algo(node.right);

            if (l == r || (l > r && l - r == 1) || (r > l && r - l == 1)) return Math.max(l, r) + 1;
            else answer = false;
        }

        return Integer.MAX_VALUE;
    }

    public TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) return null;

        //ever time a null is found in the nodes array, it is count to skip 2 positions
        int nulls = 0;

        String[] array = data.split(",");

        TreeNode[] nodes = new TreeNode[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i].trim().equals("null")) {
                nodes[i] = null;
            } else {

                int number = Integer.parseInt(array[i].trim());
                TreeNode aux = new TreeNode(number);
                nodes[i] = aux;
            }
        }

        int i = 0;
        while (i < array.length) {

            if (nodes[i] == null) {
                nulls++;
            } else {

                int l = ((2 * i) + 1) - (2 * nulls);
                int r = ((2 * i) + 2) - (2 * nulls);

                if (l < array.length) nodes[i].left = nodes[l];
                if (r < array.length) nodes[i].right = nodes[r];
            }

            i++;
        }

        return nodes[0];
    }
}
