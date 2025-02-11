package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _623_Add_One_Row_to_Tree {

    public final HashMap<Integer, List<TreeNode>> mapaPorNivel = new HashMap<>();


    public TreeNode addOneRow(TreeNode root, int val, int depth) {


        if(depth == 1){
            TreeNode aux = new TreeNode(val);
            aux.left = root;
            return aux;
        }

        porNiveles(root, 1);

        mapaPorNivel.forEach((k, v) -> {
            System.out.println("Nivel>" + k + " *****");
            v.forEach(vv -> System.out.print(vv + "-"));
            System.out.println("   ");
        });
        System.out.println("-------------------------------------------------------------------");


        List<TreeNode> nivel = mapaPorNivel.get(Math.max(depth - 1, 1));

        nivel.forEach(n -> {

            if (n != null) {
                TreeNode auxL = new TreeNode(val);
                TreeNode auxR = new TreeNode(val);

                TreeNode left = n.left;
                TreeNode right = n.right;

                if (left != null) {
                    auxL.left = left;
                }
                n.left = auxL;

                if (right != null) {
                    auxR.right = right;
                }
                n.right = auxR;
            }
        });
        System.out.println("-------------------------------------------------------------------");

        mapaPorNivel.clear();
        porNiveles(root, 1);

        mapaPorNivel.forEach((k, v) -> {
            System.out.println("Nivel>" + k);
            v.forEach(vv -> System.out.print(vv + "-"));
            System.out.println("   ");
        });


        return null;
    }


    private void porNiveles(TreeNode root, int nivel) {

        List<TreeNode> aux = mapaPorNivel.getOrDefault(nivel, new ArrayList<>());
        aux.add(root);
        mapaPorNivel.put(nivel, aux);

        if (root == null) {
            return;
        }

        porNiveles(root.left, nivel + 1);
        porNiveles(root.right, nivel + 1);

    }


}
