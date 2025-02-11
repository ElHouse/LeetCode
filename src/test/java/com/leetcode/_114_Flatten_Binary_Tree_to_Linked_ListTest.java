package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _114_Flatten_Binary_Tree_to_Linked_ListTest {

    private final _114_Flatten_Binary_Tree_to_Linked_List flattenBinaryTreeToLinkedList = new _114_Flatten_Binary_Tree_to_Linked_List();


    @Test
    public void case4() {
        TreeNode r1 = flattenBinaryTreeToLinkedList.deserialize("1,null,2,3");

        flattenBinaryTreeToLinkedList.flatten(r1);
        assertEquals("1,null,2,null,3,null,null,", flattenBinaryTreeToLinkedList.serialize(r1));
    }


    @Test
    public void case5() {

//		    1
//		   / \
//		  2   5
//		 / \   \
//		3   4   6

        TreeNode r1 = flattenBinaryTreeToLinkedList.deserialize("1,2,5,3,4,null,6");

        flattenBinaryTreeToLinkedList.flatten(r1);
        assertEquals("1,null,2,null,3,null,4,null,5,null,6,null,null,", flattenBinaryTreeToLinkedList.serialize(r1));
    }


    @Test
    public void case6() {

//		    1
//		   / \
//		  2   5
//		 / \   \
//		3   4   6
//		   /   /
//		  7   8
//		     /
//		    9
//
//		      10
//		     /
//		    11


        TreeNode r1 = flattenBinaryTreeToLinkedList.deserialize("1,2,5,3,4,null,6,null,null,7,null,8,null,null,null,null,null,null,null,null,9,null");


        flattenBinaryTreeToLinkedList. flatten(r1);
      //  assertEquals("1,null,2,null,3,null,4,null,7,null,5,null,6,null,8,null,9,null,", flattenBinaryTreeToLinkedList.serialize(r1));
    }
}