package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103_Binary_Tree_Zigzag_Level_Order_Traversal {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> response = new ArrayList<>();
        if (root == null) return response;

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);

        boolean invert = false;

        while (!cola.isEmpty()) {

            int colaSize = cola.size();
            List<Integer> listPerLevel = new ArrayList<>();

            for (int i = 0; i < colaSize; i++) {

                TreeNode auxNode = cola.poll();

                listPerLevel.add(auxNode.val);

                if (auxNode.left != null) cola.add(auxNode.left);
                if (auxNode.right != null) cola.add(auxNode.right);
            }


            response.add((invert) ? listPerLevel.reversed() : listPerLevel);
            invert = !invert;
        }


        return response;
    }
}
