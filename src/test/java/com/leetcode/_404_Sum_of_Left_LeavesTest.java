package com.leetcode;

import com.leetcode._404_Sum_of_Left_Leaves;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _404_Sum_of_Left_LeavesTest {

    _404_Sum_of_Left_Leaves sum_of_left_leaves = new _404_Sum_of_Left_Leaves();

    @Test
    void sumOfLeftLeaves() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(3, 9, 20, null, null, 15, 7));

        assertEquals(24, sum_of_left_leaves.sumOfLeftLeaves(head));

    }

    @Test
    void sumOfLeftLeaves2() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(1));

        assertEquals(0, sum_of_left_leaves.sumOfLeftLeaves(head));

    }

    @Test
    void sumOfLeftLeaves3() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(0,2,4,1,null,3,-1,5,1,null,6,null,8));

        assertEquals(5, sum_of_left_leaves.sumOfLeftLeaves(head));

    }
}