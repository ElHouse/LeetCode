package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _2476_Closest_Nodes_Queries_in_a_Binary_Search_TreeTest {


    private final _2476_Closest_Nodes_Queries_in_a_Binary_Search_Tree closestNodesQueriesInABinarySearchTree = new _2476_Closest_Nodes_Queries_in_a_Binary_Search_Tree();

    @Test
    public void test01() {

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(2, 2));
        expected.add(List.of(4, 6));
        expected.add(List.of(15, -1));

        TreeNode head = TreeNode.buildTree(Arrays.asList(6, 2, 13, 1, 4, 9, 15, null, null, null, null, null, null, 14));
        List<Integer> queries = List.of(2, 5, 16);

        assertEquals(expected, closestNodesQueriesInABinarySearchTree.closestNodes(head, queries));
    }
    @Test
    public void test02() {

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, 4));

        TreeNode head = TreeNode.buildTree(Arrays.asList(4,null,9));
        List<Integer> queries = List.of(3);

        assertEquals(expected, closestNodesQueriesInABinarySearchTree.closestNodes(head, queries));
    }

}