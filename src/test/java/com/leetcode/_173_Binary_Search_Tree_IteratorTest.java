package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _173_Binary_Search_Tree_IteratorTest {


    //todo: HACER LOS ASSERT
    @Test
    public void test1(){

        TreeNode root1 = new TreeNode(13);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(8);
        TreeNode root5 = new TreeNode(11);
        TreeNode root6 = new TreeNode(15);


        root1.left = root2;
        root1.right = root6;

        root2.left = root3;
        root2.right = root5;

        root3.right = root4;

        _173_Binary_Search_Tree_Iterator a = new _173_Binary_Search_Tree_Iterator(root1);
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());
        System.out.println(a.next());
        System.out.println(a.hasNext());


    }

}