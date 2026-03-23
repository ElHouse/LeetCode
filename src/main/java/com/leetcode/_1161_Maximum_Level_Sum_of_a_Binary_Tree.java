package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class _1161_Maximum_Level_Sum_of_a_Binary_Tree {


    public int maxLevelSum(TreeNode root) {

        int max = Integer.MIN_VALUE;
        int level = 0;
        int count = 0;
        if (root == null) return 0;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {

            int size = cola.size();
            int suma = 0;
            count++;
            for (int i = 0; i < size; i++) {

                TreeNode node = cola.poll();

                if (node.left != null) cola.add(node.left);
                if (node.right != null) cola.add(node.right);
                suma += node.val;
            }


            if (suma > max) {
                max = suma;
                level = count;
            }

        }

        return level;
    }
}
