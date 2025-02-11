package com.leetcode;

import com.leetcode._563_Binary_Tree_Tilt;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _563_Binary_Tree_TiltTest {


    private final _563_Binary_Tree_Tilt binaryTreeTilt = new _563_Binary_Tree_Tilt();

    @Test
    public void test1() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        TreeNode root = TreeNode.crearArbol(list);

        assertEquals(1, binaryTreeTilt.findTilt(root));
    }

    @Test
    public void test2() {

        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(3);
        list.add(null);
        list.add(7);

        TreeNode root = TreeNode.crearArbol(list);

        assertEquals(15, binaryTreeTilt.findTilt(root));
    }

    @Test
    public void test3() {

        List<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(7);
        list.add(14);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        TreeNode root = TreeNode.crearArbol(list);

        assertEquals(9, binaryTreeTilt.findTilt(root));
    }

}