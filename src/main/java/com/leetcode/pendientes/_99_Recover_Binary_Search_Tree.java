package com.leetcode.pendientes;

import com.leetcode.structure.TreeNode;

public class _99_Recover_Binary_Search_Tree {

    private TreeNode previous2 = null;
    private boolean encontrado = false;


    public void recoverTree(TreeNode root) {
        previous2 = null;
        encontrado = false;

        process(root);
    }


    private void process(TreeNode root) {

        if (encontrado) {
            return;
        }

        if (!encontrado && root.left != null) {
            process(root.left);
        }

        System.out.println(root.val);

        if (previous2 == null) {
            previous2 = root;
        } else {
            if (! encontrado &&previous2.val > root.val) {
                System.out.println("Encontado" + root.val + "--" + previous2.val);
                int aux = previous2.val;
                previous2.val = root.val;
                root.val = aux;
                encontrado = true;
                return;
            } else {
                previous2 = root;
            }
        }


        if( !encontrado && root.right != null) {
            process(root.right);
        }
    }

}
