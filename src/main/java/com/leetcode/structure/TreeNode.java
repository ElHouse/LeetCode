package com.leetcode.structure;

import java.util.*;

public class TreeNode {


    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }


    public static TreeNode crearArbol(List<Integer> list) {

        Queue<TreeNode> cola = new ArrayDeque<>();
        TreeNode root = new TreeNode(list.getFirst());
        cola.add(root);

        for (int i = 1; i < list.size() - 1; ) {

            TreeNode aux = cola.poll();

            Integer leftVal =  list.get(i++);
            Integer rightVal =  list.get(i++);

            if (leftVal != null) {
                TreeNode leftNode = new TreeNode(leftVal);
                cola.add(leftNode);
                aux.left = leftNode;
            }

            if (rightVal != null) {
                TreeNode rightNode = new TreeNode(rightVal);
                cola.add(rightNode);
                aux.right = rightNode;
            }
        }

        return root;
    }

    private static final HashMap<Integer, List<TreeNode>> mapaPorNivel = new HashMap<>();

    public static void imprimirPorNiveles(TreeNode root) {
        TreeNode.porNiveles(root, 1);
        mapaPorNivel.remove(mapaPorNivel.size());

        mapaPorNivel.forEach((k, v) -> {
            v.forEach(vv -> System.out.print(vv == null ? "*-" : vv + "-"));
            System.out.println("   ");
        });
    }

    private static void porNiveles(TreeNode root, int nivel) {

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
