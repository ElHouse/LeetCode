package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _1026_Maximum_Difference_Between_Node_and_AncestorTest {


    private final _1026_Maximum_Difference_Between_Node_and_Ancestor maximumDifferenceBetweenNodeAndAncestor = new _1026_Maximum_Difference_Between_Node_and_Ancestor();

    @Test
    public void test01(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(8,3,10,1,6,null,14,null,null,4,7,13));
        assertEquals(7, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }


    @Test
    public void test02(){
        TreeNode root = TreeNode.buildTree(Arrays.asList(1,null,2,null,0,3));
        assertEquals(3, maximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root));
    }
}