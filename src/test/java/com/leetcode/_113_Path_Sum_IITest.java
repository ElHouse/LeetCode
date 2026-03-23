package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _113_Path_Sum_IITest {


    private final _113_Path_Sum_II pathSumIi = new _113_Path_Sum_II();

    @Test
    public void test01() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        List<List<Integer>> result = pathSumIi.pathSum(root, 22);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(5, 4, 11, 2));
        expected.add(List.of(5, 8, 4, 5));

        assertEquals(expected, result);
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2, 3));
        List<List<Integer>> result = pathSumIi.pathSum(root, 5);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.buildTree(Arrays.asList(1, 2));
        List<List<Integer>> result = pathSumIi.pathSum(root, 0);
        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, result);
    }


}