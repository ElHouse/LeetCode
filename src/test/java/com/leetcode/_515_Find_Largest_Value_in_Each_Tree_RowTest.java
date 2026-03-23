package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _515_Find_Largest_Value_in_Each_Tree_RowTest {


    private final _515_Find_Largest_Value_in_Each_Tree_Row findLargestValueInEachTreeRow = new _515_Find_Largest_Value_in_Each_Tree_Row();


    @Test
    public void test01() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, 3, 2, 5, 3, null, 9));
        assertEquals(List.of(1, 3, 9), findLargestValueInEachTreeRow.largestValues(head));
    }


    @Test
    public void test02() {
        TreeNode head = TreeNode.buildTree(Arrays.asList(1, 2, 3));
        assertEquals(List.of(1, 3), findLargestValueInEachTreeRow.largestValues(head));
    }

}