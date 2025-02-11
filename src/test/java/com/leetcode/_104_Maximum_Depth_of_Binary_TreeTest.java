package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _104_Maximum_Depth_of_Binary_TreeTest {


    private final _104_Maximum_Depth_of_Binary_Tree maximumDepthOfBinaryTree = new _104_Maximum_Depth_of_Binary_Tree();

    @Test
    public void test01() {
        List<Integer> lista = Arrays.asList(3, 9, 20, null, null, 15, 7);


        TreeNode head = TreeNode.crearArbol(lista);

        assertEquals(3, this.maximumDepthOfBinaryTree.maxDepth(head));
    }


    @Test
    public void test02() {
        List<Integer> lista = Arrays.asList(3, null, 7);


        TreeNode head = TreeNode.crearArbol(lista);

        assertEquals(2, this.maximumDepthOfBinaryTree.maxDepth(head));
    }


}