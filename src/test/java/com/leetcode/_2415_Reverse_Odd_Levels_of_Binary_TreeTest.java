package com.leetcode;

import com.leetcode._2415_Reverse_Odd_Levels_of_Binary_Tree;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.leetcode.structure.TreeNode.crearArbol;

class _2415_Reverse_Odd_Levels_of_Binary_TreeTest {

    _2415_Reverse_Odd_Levels_of_Binary_Tree reverseOddLevelsOfBinaryTree = new _2415_Reverse_Odd_Levels_of_Binary_Tree();


    @Test
    public void test1() {


        List<Integer> list = List.of(0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2);

        TreeNode root = crearArbol(list);

        reverseOddLevelsOfBinaryTree.reverseOddLevels(root);
    }




}