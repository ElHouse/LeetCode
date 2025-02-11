package com.leetcode;

import com.leetcode._543_Diameter_of_Binary_Tree;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _543_Diameter_of_Binary_TreeTest {


    private final _543_Diameter_of_Binary_Tree diameterOfBinaryTree = new _543_Diameter_of_Binary_Tree();


    @Test
    public void test1() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        TreeNode root = TreeNode.crearArbol(list);
        assertEquals(3, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }


    @Test
    public void test2() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(null);
        list.add(null);

        list.add(null);
        list.add(null);
        list.add(6);
        list.add(7);

        list.add(8);
        list.add(null);
        list.add(9);
        list.add(null);
        list.add(null);

        list.add(10);
        list.add(null);

        list.add(11);
        list.add(null);
        list.add(null);


        list.add(12);
        list.add(null);

        list.add(13);
        list.add(null);
        list.add(null);

        list.add(14);
        list.add(15);
        list.add(null);
        list.add(null);


        list.add(16);
        list.add(17);
        list.add(null);
        list.add(null);

        TreeNode root = TreeNode.crearArbol(list);

        assertEquals(12, diameterOfBinaryTree.diameterOfBinaryTree(root));
    }

}