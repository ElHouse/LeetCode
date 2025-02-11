package com.leetcode;

import com.leetcode._108_Convert_Sorted_Array_to_Binary_Search_Tree;
import org.junit.jupiter.api.Test;

class _108_Convert_Sorted_Array_to_Binary_Search_TreeTest {

    private  final _108_Convert_Sorted_Array_to_Binary_Search_Tree convertSortedArrayToBinarySearchTree = new _108_Convert_Sorted_Array_to_Binary_Search_Tree();


    @Test
    public void test1(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }



    @Test
    public void test2(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{1,3});
    }


    @Test
    public void test3(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{1});
    }


    @Test
    public void test4(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{-10,-3,0,5,9, 10, 11,12,13,14,15,156});
    }

    @Test
    public void test5(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{0,1,2,3,4,5,6,7,8,9,10,11});
    }

    @Test
    public void test6(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{0,1,2,3,4,5,6,7,8,9,10});
    }

    @Test
    public void test7(){
        convertSortedArrayToBinarySearchTree.sortedArrayToBST(new int[]{0,1,2,3,4,5,6});
    }
}