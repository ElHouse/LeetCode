package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _530_Minimum_Absolute_Difference_in_BST {


    public int getMinimumDifference(TreeNode root) {

        if (root == null)
            return 0;

        List<Integer> lista = new ArrayList<>();

        process(root, lista);

        Collections.sort(lista);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size() - 1; i++) {
            min = Math.min(min, Math.abs(lista.get(i) - lista.get(i + 1)));
        }

        return min;
    }

    private void process(TreeNode root, List<Integer> lista) {

        lista.add(root.val);

        if (root.left != null) {
            process(root.left, lista);
        }

        if (root.right != null) {
            process(root.right, lista);
        }

    }

}
