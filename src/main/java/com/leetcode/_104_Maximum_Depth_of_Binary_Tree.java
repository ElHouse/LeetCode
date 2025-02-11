package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _104_Maximum_Depth_of_Binary_Tree {

    /*
    Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



    Example 1:


    Input: root = [3,9,20,null,null,15,7]
    Output: 3

    Example 2:

    Input: root = [1,null,2]
    Output: 2

     */
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> cola = new LinkedList<>();
        int countNulls = 0;

        cola.add(root);
        cola.add(null);
        boolean prevNull = false;

        while (!cola.isEmpty()) {

            TreeNode aux = cola.poll();

            if (aux == null && !prevNull) {
                countNulls++;
                cola.add(null);
                prevNull = true;
            } else if(aux != null){
                if (aux.left != null) cola.add(aux.left);
                if (aux.right != null) cola.add(aux.right);
                prevNull = false;
            }

        }

        return countNulls;
    }


}
