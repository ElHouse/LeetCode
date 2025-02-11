package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.*;


public class _652_Find_Duplicate_Subtrees {

    Map<String, TreeNode> map = new HashMap<>();
    Map<String, TreeNode> aux = new HashMap<>();
    List<TreeNode> answer = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        if (root == null) return answer;

        preOrder(root);

        aux.forEach((k, v) -> {
            answer.add(v);
        });

        System.out.println("+++++++++");
        answer.forEach(a -> {
            System.out.println("........");
            print(a);
        });

        return answer;
    }

    public void preOrder(TreeNode root) {


        StringBuilder sb = new StringBuilder();

        treeSerialization(root, sb);

        if (map.containsKey(sb.toString())) {
            aux.put(sb.toString(), root);
        } else {
            map.put(sb.toString(), root);
        }

        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);

    }


    public void treeSerialization(TreeNode root, StringBuilder sb) {

        int last = 0;
        int count = 0;
        List<String> auxL = new ArrayList<>();

        Queue<TreeNode> cola = new LinkedList<>();
        cola.add(root);


        while (!cola.isEmpty()) {

            List<TreeNode> hijos = new ArrayList<>();
            while (!cola.isEmpty()) {

                TreeNode aux = cola.poll();
                count++;
                if (aux != null) {
                    auxL.add(String.valueOf(aux.val));
                    hijos.add(aux.left);
                    hijos.add(aux.right);
                    last = count;
                } else {
                    auxL.add("null");
                }

            }

            cola.addAll(hijos);
        }

        for (int i = 0; i < last; i++) {

            sb.append(auxL.get(i));
            sb.append(",");
        }

        sb.deleteCharAt(sb.length() - 1);

    }

    public void print(TreeNode root) {


        System.out.println(root.val);

        if (root.left != null) print(root.left);
        if (root.right != null) print(root.right);

    }


}
