package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _437_Path_Sum_IIITest {

    private final _437_Path_Sum_III pathSumIii = new _437_Path_Sum_III();

    @Test
    public void test01() {
        TreeNode head = TreeNode.crearArbol(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1));
        assertEquals(3, pathSumIii.pathSum(head, 8));
    }

    @Test
    public void test02() {
        TreeNode head = TreeNode.crearArbol(Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));
        assertEquals(3, pathSumIii.pathSum(head, 22));
    }

    @Test
    public void test03() {
        TreeNode head = TreeNode.crearArbol(List.of(1));
        assertEquals(1, pathSumIii.pathSum(head, 1));
    }

    @Test
    public void test04() {
        TreeNode head = TreeNode.crearArbol(Arrays.asList(1_000_000_000, 1000000000, null, 294_967_296, null, 1000000000, null, 1000000000, null, 1000000000));
        assertEquals(0, pathSumIii.pathSum(head, 0));
    }


}