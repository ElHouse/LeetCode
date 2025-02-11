package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _538_Convert_BST_to_Greater_TreeTest {


    private final _538_Convert_BST_to_Greater_Tree convertBstToGreaterTree = new _538_Convert_BST_to_Greater_Tree();

    //TODO poner asserts

    @Test
    public void case3() {

        TreeNode r1 = convertBstToGreaterTree.deserialize("1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5");
        convertBstToGreaterTree.convertBST(r1);
    }

    @Test
    public void case4() {

        TreeNode r1 = convertBstToGreaterTree.deserialize("1,null,2,null,3");
        convertBstToGreaterTree.convertBST(r1);
    }

}