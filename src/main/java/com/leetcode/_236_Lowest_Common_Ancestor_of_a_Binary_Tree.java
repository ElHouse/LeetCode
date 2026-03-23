package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.*;

public class _236_Lowest_Common_Ancestor_of_a_Binary_Tree {
    /*
    Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
    */
    //uso de heap
    //version con lista

    //solucion de leetcode
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: null node
        if (root == null) return null;

        // If the current node is either p or q, return it
        if (root == p || root == q) return root;

        // Recur for left and right children
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right return a non-null value, current node is LCA
        if (left != null && right != null) return root;

        // Otherwise, return the non-null child (or null if both are null)
        return left != null ? left : right;
    }


    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {

        int i = -1;
        int j = -1;
        int count = 0;
        List<TreeNode> treeNodeList = new ArrayList<>(100_000);

        treeNodeList.add(root);

        while (i == -1 || j == -1) {

            TreeNode aux = treeNodeList.get(count);

            if (aux != null) {
                treeNodeList.add(aux.left);
                treeNodeList.add(aux.right);

                if (aux.val == p.val) {
                    i = count;
                } else if (aux.val == q.val) {
                    j = count;
                }
            } else {
                treeNodeList.add(null);
                treeNodeList.add(null);
            }
            count++;
        }


        while (i != j) {
            if (i < j) {
                j = j % 2 == 0 ? ((j - 1) / 2) : j / 2;
            } else {
                i = i % 2 == 0 ? ((i - 1) / 2) : i / 2;
            }
        }

        return treeNodeList.get(i);
    }

    //version con cola y lista
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {

        int i = -1;
        int j = -1;
        int count = 0;

        List<TreeNode> treeNodeList = new ArrayList<>();
        Queue<TreeNode> cola = new LinkedList<>();

        cola.add(root);

        while (i == -1 || j == -1) {

            TreeNode aux = cola.poll();

            treeNodeList.add(aux);

            if (aux != null) {
                cola.add(aux.left);
                cola.add(aux.right);

                if (aux.val == p.val) {
                    i = count;
                } else if (aux.val == q.val) {
                    j = count;
                }
            } else {
                cola.add(null);
                cola.add(null);
            }
            count++;
        }

        cola.clear();

        while (i != j) {
            if (i < j) {
                j = j % 2 == 0 ? ((j - 1) / 2) : j / 2;
            } else {
                i = i % 2 == 0 ? ((i - 1) / 2) : i / 2;
            }
        }

        return treeNodeList.get(i);
    }


}
