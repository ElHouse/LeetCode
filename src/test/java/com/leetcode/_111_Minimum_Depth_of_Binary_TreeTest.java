package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _111_Minimum_Depth_of_Binary_TreeTest {


    private final _111_Minimum_Depth_of_Binary_Tree minimumDepthOfBinaryTree =  new _111_Minimum_Depth_of_Binary_Tree();

    @Test
    public void test01(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(3,9,20,null,null,15,7));
        assertEquals(2, minimumDepthOfBinaryTree.minDepth(root));
    }


    @Test
    public void test02(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(2,null,3,null,4,null,5,null,6));
        assertEquals(5, minimumDepthOfBinaryTree.minDepth(root));
    }

}