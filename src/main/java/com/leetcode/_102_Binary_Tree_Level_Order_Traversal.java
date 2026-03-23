package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class _102_Binary_Tree_Level_Order_Traversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> response = new ArrayList<>();

        if (root == null) return response;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {

            int size = cola.size();
            List<Integer> nodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = cola.poll();

                if (node.left != null) cola.add(node.left);
                if (node.right != null) cola.add(node.right);
                nodes.add(node.val);
            }

            response.add(nodes);
        }


        return response;
    }

}
