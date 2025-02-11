package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _114_Flatten_Binary_Tree_to_Linked_List {


//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
//	Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.

    public void flatten(TreeNode root) {

        if (root == null) return;

        while (!isValid(root)) {

            algo(root);
        }

    }


    public void algo(TreeNode root) {

        System.out.println("algo->" + root.val);


        if (root.left != null && root.right != null) {
            TreeNode max = getMax(root.left);
            max.right = root.right;
            root.right = null;
            algo(root.left);
        } else if (root.left != null) {
            root.right = root.left;
            root.left = null;
            algo(root.right);
        } else if (root.right != null) {
            algo(root.right);
        }

    }


    public boolean isValid(TreeNode node) {

        boolean valid = true;
        if (node.left != null) return false;
        if (node.right != null) {
            valid = isValid(node.right);
        }

        return valid;
    }

    public TreeNode getMax(TreeNode root) {

        TreeNode max = null;

        if (root.right != null) {
            max = getMax(root.right);
        } else {
            return root;
        }

        return max;
    }


    public String serialize(TreeNode root) {

        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> cola = new LinkedList<>();

        cola.add(root);

        while (!cola.isEmpty()) {

            TreeNode node = cola.poll();
            if (node != null) {
                cola.add(node.left);
                cola.add(node.right);
                sb.append(node.val);
            } else {
                sb.append("null");
            }
            sb.append(",");
        }

        return sb.toString();
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
