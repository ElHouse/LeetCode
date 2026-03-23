package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _226_Invert_Binary_TreeTest {


    private final _226_Invert_Binary_Tree invertBinaryTree = new _226_Invert_Binary_Tree();


    @Test
    public void test01() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(4, 2, 7, 1, 3, 6, 9));

        TreeNode.imprimirPorNiveles(root);

        TreeNode result = invertBinaryTree.invertTree(root);
        TreeNode.imprimirPorNiveles(result);
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(2, 1, 3));

        TreeNode.imprimirPorNiveles(root);

        TreeNode result = invertBinaryTree.invertTree(root);
        TreeNode.imprimirPorNiveles(result);
    }


}