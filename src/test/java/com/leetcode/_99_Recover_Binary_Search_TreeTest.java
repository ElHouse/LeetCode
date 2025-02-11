package com.leetcode;

import com.leetcode.pendientes._99_Recover_Binary_Search_Tree;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.structure.TreeNode.crearArbol;

class _99_Recover_Binary_Search_TreeTest {

    private final _99_Recover_Binary_Search_Tree recoverBinarySearchTree = new _99_Recover_Binary_Search_Tree();


    @Test
    public void test01() {


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(null);
        list.add(null);
        list.add(2);

        TreeNode root = crearArbol(list);

        recoverBinarySearchTree.recoverTree(root);

    }


    @Test
    public void test02() {
        List<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(20);
        list.add(70);
        list.add(18);
        list.add(38);
        list.add(60);
        list.add(80);
        list.add(15);
        list.add(19);
        list.add(null);
        list.add(null);
        list.add(55);
        list.add(62);
        list.add(79);
        list.add(90);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(30);
        list.add(null);
        list.add(61);

        TreeNode root = crearArbol(list);

        recoverBinarySearchTree.recoverTree(root);
    }


    @Test
    public void test03() {


        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(4);
        list.add(null);
        list.add(null);
        list.add(2);


        TreeNode root = crearArbol(list);

        recoverBinarySearchTree.recoverTree(root);

    }
}