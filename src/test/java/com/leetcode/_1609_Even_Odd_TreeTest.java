package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _1609_Even_Odd_TreeTest {


    private final _1609_Even_Odd_Tree  evenOddTree = new _1609_Even_Odd_Tree();


    @Test
    public void test01(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(1,10,4,3,null,7,9,12,8,6,null,null,2));
        assertTrue(evenOddTree.isEvenOddTree(root));
    }
    @Test
    public void test02(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(5,4,2,3,3,7));
        assertFalse(evenOddTree.isEvenOddTree(root));
    }
    @Test
    public void test03(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(5,9,1,3,5,7));
        assertFalse(evenOddTree.isEvenOddTree(root));
    }


}