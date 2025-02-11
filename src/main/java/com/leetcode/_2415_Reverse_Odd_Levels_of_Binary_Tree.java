package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.*;

public class _2415_Reverse_Odd_Levels_of_Binary_Tree {


    private final Map<Integer, List<TreeNode>> niveles = new HashMap<>();

    public TreeNode reverseOddLevels(TreeNode root) {
        System.out.println("------------------------------------");
        printInOrder(root);
        System.out.println("------------------------------------");

        process(root, 0);

        niveles.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(vv -> System.out.println("----" + vv.val));
        });

        niveles.forEach((k, v) -> {
            if (k % 2 != 0) {

                for (int i = 0, j = v.size() - 1; i < j; i++, j--) {
                    int auxVal = v.get(i).val;
                    v.get(i).val = v.get(j).val;
                    v.get(j).val = auxVal;
                }

                //niveles.put(k, v.reversed());
            }
        });

        niveles.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(vv -> System.out.println("----" + vv.val));
        });

        System.out.println("------------------------------------");
        printInOrder(root);
        System.out.println("------------------------------------");

        return root;
    }


    private static void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    private void process(TreeNode root, int nivel) {

        if (niveles.containsKey(nivel)) {
            List<TreeNode> auxNivel = niveles.get(nivel);
            auxNivel.add(root);
            niveles.put(nivel, auxNivel);
        } else {
            List<TreeNode> auxNivel = new ArrayList<>();
            auxNivel.add(root);
            niveles.put(nivel, auxNivel);
        }

        if (root.left != null) {
            process(root.left, nivel + 1);
        }

        if (root.right != null) {
            process(root.right, nivel + 1);
        }

    }

}