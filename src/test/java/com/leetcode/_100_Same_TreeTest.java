package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _100_Same_TreeTest {


    private final _100_Same_Tree sameTree = new _100_Same_Tree();


    @Test
    public void test01(){

        TreeNode p = TreeNode.buildTree(List.of(1,2,3));
        TreeNode q = TreeNode.buildTree(List.of(1,2,3));


        assertTrue(sameTree.isSameTree(p,q));
    }


    @Test
    public void test02(){

        TreeNode p = TreeNode.buildTree(List.of(1,2));
        TreeNode q = TreeNode.buildTree(Arrays.asList(1, null, 2));


        assertFalse(sameTree.isSameTree(p,q));
    }


    @Test
    public void test03(){

        TreeNode p = TreeNode.buildTree(List.of(1,2,1));
        TreeNode q = TreeNode.buildTree(List.of(1,1,2));


        assertFalse(sameTree.isSameTree(p,q));
    }


}