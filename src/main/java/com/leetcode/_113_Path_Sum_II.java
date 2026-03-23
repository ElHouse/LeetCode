package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.


 */
public class _113_Path_Sum_II {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> paths = new ArrayList<>();

        if (root == null) return paths;

        paths(root, targetSum, paths, 0, new ArrayList<>());

        return paths;
    }


    private void paths(TreeNode root, int targetSum, List<List<Integer>> paths, int suma, List<Integer> path) {

        if (root == null) return;

        suma += root.val;
        List<Integer> newList = new ArrayList<>(path);
        newList.add(root.val);

        if (root.left == null && root.right == null && suma == targetSum) {
            paths.add(newList);
        } else {

            paths(root.left, targetSum, paths, suma, newList);
            paths(root.right, targetSum, paths, suma, newList);
        }
    }

}
