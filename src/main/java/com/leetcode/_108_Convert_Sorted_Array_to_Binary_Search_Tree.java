package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {


    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) return null;


        TreeNode head = process(nums, 0, nums.length - 1);

        TreeNode.imprimirPorNiveles(head);

        return head;
    }


    private TreeNode process(int[] nums, int minIndex, int maxIndex) {

        if (minIndex > maxIndex) return null;

        int mitad = minIndex + (maxIndex - minIndex) / 2;

        TreeNode node = new TreeNode(nums[mitad]);
        node.left = process(nums, minIndex, mitad - 1);
        node.right = process(nums, mitad + 1, maxIndex);

        return node;
    }


}
