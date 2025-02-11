package com.leetcode;

import com.leetcode._783_Minimum_Distance_Between_BST_Nodes;
import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _783_Minimum_Distance_Between_BST_NodesTest {

    _783_Minimum_Distance_Between_BST_Nodes minimumDistanceBetweenBstNodes = new _783_Minimum_Distance_Between_BST_Nodes();


    @Test
    void minDiffInBST() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(4,2,6,1,3));


        assertEquals(1, minimumDistanceBetweenBstNodes.minDiffInBST(head));
    }

    @Test
    void minDiffInBST2() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(1,0,48,null,null,12,49));


        assertEquals(1, minimumDistanceBetweenBstNodes.minDiffInBST(head));
    }

    @Test
    void minDiffInBST3() {


        TreeNode head = TreeNode.crearArbol(Arrays.asList(90,69,null,49,89,null,52));


        assertEquals(1, minimumDistanceBetweenBstNodes.minDiffInBST(head));
    }
}