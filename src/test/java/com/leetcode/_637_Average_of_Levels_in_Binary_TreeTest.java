package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _637_Average_of_Levels_in_Binary_TreeTest {

    private final _637_Average_of_Levels_in_Binary_Tree averageOfLevelsInBinaryTree = new _637_Average_of_Levels_in_Binary_Tree();

    @Test
    public void testo1(){

        TreeNode head = TreeNode.buildTree(Arrays.asList(3,9,20,null,null,15,7));

        assertEquals(List.of(3.00000,14.50000,11.00000), averageOfLevelsInBinaryTree.averageOfLevels(head));
    }

    @Test
    public void testo2(){

        TreeNode head = TreeNode.buildTree(Arrays.asList(3,9,20,15,7));

        assertEquals(List.of(3.00000,14.50000,11.00000), averageOfLevelsInBinaryTree.averageOfLevels(head));
    }

    @Test
    public void testo3(){

        TreeNode head = TreeNode.buildTree(Arrays.asList(3,9,20,null,null,15,7,3,9,20,null,null,15,7,3,9,20,null,null,15,7));

        assertEquals(List.of(3.00000,14.50000,11.00000, 10.666666666666666, 10.8, 11.0), averageOfLevelsInBinaryTree.averageOfLevels(head));
    }


}