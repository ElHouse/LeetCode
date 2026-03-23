package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _1305_All_Elements_in_Two_Binary_Search_TreesTest {


    _1305_All_Elements_in_Two_Binary_Search_Trees allElementsInTwoBinarySearchTrees = new _1305_All_Elements_in_Two_Binary_Search_Trees();

    @Test
    public void test01(){
        TreeNode head1 = TreeNode.buildTree(Arrays.asList(2,1,4));
        TreeNode head2 = TreeNode.buildTree(Arrays.asList(1,0,3));
        assertEquals(List.of(0,1,1,2,3,4), allElementsInTwoBinarySearchTrees.getAllElements(head1,head2));
    }

    @Test
    public void test02(){
        TreeNode head1 = TreeNode.buildTree(Arrays.asList(1,null,8));
        TreeNode head2 = TreeNode.buildTree(Arrays.asList(8,1));
        assertEquals(List.of(1,1,8,8), allElementsInTwoBinarySearchTrees.getAllElements(head1,head2));
    }

    @Test
    public void test03(){
        TreeNode head1 = TreeNode.buildTree(Arrays.asList(2,1,4,1,5,3,64,23));
        TreeNode head2 = TreeNode.buildTree(Arrays.asList(1,0,3));
        assertEquals(List.of(0, 1, 1, 1, 2, 3, 3, 4, 5, 23, 64), allElementsInTwoBinarySearchTrees.getAllElements(head1,head2));
    }

}