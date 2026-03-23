package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _270_Closest_Binary_Search_Tree_ValueTest {

    private final _270_Closest_Binary_Search_Tree_Value closestBinarySearchTreeValue = new _270_Closest_Binary_Search_Tree_Value();


    @Test
    public void test01() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(4, 2, 5, 1, 3));
        assertEquals(4, closestBinarySearchTreeValue.closestValue(head, 3.714286));
    }

    @Test
    public void test02() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1));
        assertEquals(1, closestBinarySearchTreeValue.closestValue(head, 3.714286));
    }

    @Test
    public void test03() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(2, 1, 3));
        assertEquals(1, closestBinarySearchTreeValue.closestValue(head, 0.142857));
    }

    @Test
    public void test04() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(4, 2, 5, 1, 3));
        assertEquals(3, closestBinarySearchTreeValue.closestValue(head, 3.5));
    }

    @Test
    public void test05() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, null, 2));
        assertEquals(2, closestBinarySearchTreeValue.closestValue(head, 3.428571));
    }


}