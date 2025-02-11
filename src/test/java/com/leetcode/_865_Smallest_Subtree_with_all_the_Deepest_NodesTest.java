package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.leetcode.structure.TreeNode.crearArbol;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _865_Smallest_Subtree_with_all_the_Deepest_NodesTest {


    _865_Smallest_Subtree_with_all_the_Deepest_Nodes smallestSubtreeWithAllTheDeepestNodes = new _865_Smallest_Subtree_with_all_the_Deepest_Nodes();


    @Test
    public void test() {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(0);
        list.add(8);
        list.add(null);
        list.add(null);
        list.add(7);
        list.add(4);


        TreeNode root = crearArbol(list);

        assertEquals(2,  smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root).val);
    }


    @Test
    public void test2() {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        TreeNode root = crearArbol(list);

        assertEquals(1,  smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root).val);
    }


    @Test
    public void test3() {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(null);
        list.add(2);

        TreeNode root = crearArbol(list);

        assertEquals(2,  smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root).val);
    }


    @Test
    public void test4() {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(0);
        list.add(8);
        list.add(null);
        list.add(85);
        list.add(7);
        list.add(4);

        TreeNode root = crearArbol(list);

        assertEquals(5,  smallestSubtreeWithAllTheDeepestNodes.subtreeWithAllDeepest(root).val);
    }


}