package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _101_Symmetric_TreeTest {

    private final _101_Symmetric_Tree symmetricTree = new _101_Symmetric_Tree();

    @Test
    public void test01() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3, 5, 6, 7, 8, 8, 7, 6, 5, 10,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, 10));
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    public void test04() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 2, 3, 4, 4, 3, 5, 6, 7, 8, 8, 7, 6, 5, 10,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, 10, null));
        assertFalse(symmetricTree.isSymmetric(root));
    }



    @Test
    public void test05() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1));
        assertTrue(symmetricTree.isSymmetric(root));
    }

}