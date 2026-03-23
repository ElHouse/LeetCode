package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.*;

public class _637_Average_of_Levels_in_Binary_Tree {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {

            double size = cola.size();
            double suma = 0.0;

            for (int i = 0; i < size; i++) {

                TreeNode aux = cola.poll();

                if (aux.right != null) cola.add(aux.right);
                if (aux.left != null) cola.add(aux.left);

                suma += aux.val;
            }
             result.add(suma / size);
        }

        return result;
    }
}
