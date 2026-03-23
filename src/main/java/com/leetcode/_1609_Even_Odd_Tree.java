package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
A binary tree is named Par-Impar if it meets the following conditions:

The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
For every Índice par level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
For every Indexado en impares level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return fals
 */
public class _1609_Even_Odd_Tree {

    public boolean isEvenOddTree(TreeNode root) {

        if (root == null) return false;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        boolean par = true;
        while (!cola.isEmpty()) {

            int prev = par ? 0 : Integer.MAX_VALUE;
            int size = cola.size();

            for (int i = 0; i < size; i++) {

                TreeNode aux = cola.poll();

                if (!(aux.val % 2 == (par ? 1 : 0))) {
                    return false;
                }

                if (par && prev >= aux.val) {
                    return false;
                }

                if (!par && prev <= aux.val) {
                    return false;
                }

                if (aux.left != null) cola.add(aux.left);
                if (aux.right != null) cola.add(aux.right);

                prev = aux.val;
            }
            par = !par;
        }

        return true;
    }


}
