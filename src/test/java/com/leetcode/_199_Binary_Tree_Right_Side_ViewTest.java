package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _199_Binary_Tree_Right_Side_ViewTest {


    private final _199_Binary_Tree_Right_Side_View binaryTreeRightSideView = new _199_Binary_Tree_Right_Side_View();

    @Test
    public void case1() {

        String a = "1,2,3,null,5,null,4";

        TreeNode root = binaryTreeRightSideView.deserialize(a);

        assertEquals("[1, 3, 4]", binaryTreeRightSideView.rightSideView(root).toString());
    }

}