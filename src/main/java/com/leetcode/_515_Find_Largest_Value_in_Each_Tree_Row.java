package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

 */
public class _515_Find_Largest_Value_in_Each_Tree_Row {


    public List<Integer> largestValues(TreeNode root) {

        List<Integer> response = new ArrayList<>();

        if (root == null) return response;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {


            int sizeCola = cola.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < sizeCola; i++) {


                TreeNode node = cola.poll();

                if (max < node.val) {
                    max = node.val;
                }

                if (node.left != null) {
                    cola.add(node.left);
                }


                if (node.right != null) {
                    cola.add(node.right);
                }

            }

            response.add(max);
        }

        return response;
    }


}
