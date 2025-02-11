package com.leetcode;

import com.leetcode.structure.TreeNode;
import org.junit.jupiter.api.Test;

class _623_Add_One_Row_to_TreeTest {

    private _623_Add_One_Row_to_Tree a = new _623_Add_One_Row_to_Tree();


    @Test
    public void test() {


        TreeNode root = new TreeNode();
        root.val = 4;


        TreeNode n1 =new TreeNode();
        TreeNode n2 = new TreeNode();

        n1.val = 2;
        n2.val = 6;

        TreeNode n3 = new TreeNode();
        TreeNode n4 = new TreeNode();
        TreeNode n5 = new TreeNode();

        n3.val = 3;
        n4.val = 1;
        n5.val = 5;

        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;

        a.addOneRow(root, 1, 2);


    }

    @Test
    public void test2() {


        TreeNode root = new TreeNode();
        root.val = 4;


        TreeNode n1 = new TreeNode();

        n1.val = 2;

        TreeNode n3 = new TreeNode();
        TreeNode n4 = new TreeNode();

        n3.val = 3;
        n4.val = 1;


        root.left = n1;

        n1.left = n3;
        n1.right = n4;


        a.addOneRow(root, 1, 3);


    }

    @Test
    public void test3() {


        TreeNode root = new TreeNode();
        root.val = 1;


        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();

        n1.val = 2;
        n2.val = 3;

        TreeNode n3 = new TreeNode();

        n3.val = 4;

        root.left = n1;
        root.right = n2;


        n1.left = n3;


        a.addOneRow(root, 5, 4);


    }


    @Test
    public void test4() {


        TreeNode root = new TreeNode();
        root.val = 1;


        TreeNode n1 = new TreeNode();
        TreeNode n2 = new TreeNode();

        n1.val = 2;
        n2.val = 3;

        TreeNode n3 = new TreeNode();

        n3.val = 4;

        root.left = n1;
        root.right = n2;


        n1.left = n3;


        a.addOneRow(root, 59, 1);


    }

}