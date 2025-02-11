package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _652_Find_Duplicate_SubtreesTest {


    _652_Find_Duplicate_Subtrees find_duplicate_subtrees = new _652_Find_Duplicate_Subtrees();

    @Test
    public void case1() {

        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        TreeNode root22 = new TreeNode(2);
        TreeNode root44 = new TreeNode(4);
        TreeNode root444 = new TreeNode(4);

        root1.left = root2;
        root1.right = root3;

        root2.left = root4;

        root3.left = root22;
        root3.right = root44;

        root22.left = root444;

        find_duplicate_subtrees.findDuplicateSubtrees(root1);

    }

    //    @Test
    public void case2() {

        TreeNode root2 = new TreeNode(2);

        TreeNode root2l = new TreeNode(2);
        TreeNode root2r = new TreeNode(2);

        TreeNode root3 = new TreeNode(3);
        TreeNode root33 = new TreeNode(3);

        root2.left = root2l;
        root2.right = root2r;

        root2l.left = root3;
        root2r.left = root33;

        find_duplicate_subtrees.findDuplicateSubtrees(root2);

    }

    @Test
    public void case3() {

        TreeNode root2 = new TreeNode(0);

        TreeNode root2l = new TreeNode(0);
        TreeNode root2r = new TreeNode(0);

        TreeNode root3 = new TreeNode(0);
        TreeNode root33 = new TreeNode(0);
        TreeNode root333 = new TreeNode(0);

        root2.left = root2l;
        root2.right = root2r;

        root2l.left = root3;
        root2r.right = root33;
        root33.left = root333;

        find_duplicate_subtrees.findDuplicateSubtrees(root2);

    }
}