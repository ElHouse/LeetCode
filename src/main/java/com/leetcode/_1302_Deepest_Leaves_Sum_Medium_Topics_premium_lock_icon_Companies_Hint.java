package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _1302_Deepest_Leaves_Sum_Medium_Topics_premium_lock_icon_Companies_Hint {


    public int deepestLeavesSum(TreeNode root) {

        if (root == null) return 0;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);
        int suma = 0;

        while (!cola.isEmpty()) {

            int sizeCola = cola.size();

            suma = 0;
            for (int i = 0; i < sizeCola; i++) {

                TreeNode aux = cola.poll();
                suma += aux.val;

                if (aux.left != null) cola.add(aux.left);
                if (aux.right != null) cola.add(aux.right);
            }

        }

        return suma;
    }
}
