package com.leetcode.structure;

public class TreePrinter {
    public interface PrintableNode {
        PrintableNode getIzquierdo();
        PrintableNode getDerecho();
        String toString();
    }

    public static void print(PrintableNode root) {
        printNode(root, "", true);
    }

    private static void printNode(PrintableNode node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.toString());
        PrintableNode left = node.getIzquierdo();
        PrintableNode right = node.getDerecho();

        if (left != null || right != null) {
            if (right != null) {
                printNode(right, prefix + (isTail ? "    " : "│   "), false);
            }
            if (left != null) {
                printNode(left, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }
}
