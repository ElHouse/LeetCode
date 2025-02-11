package com.leetcode;

import java.util.stream.IntStream;

import com.leetcode.structure.TreeNode;


public class _654_Maximum_Binary_Tree {


    //	Runtime: 52 ms, faster than 5.64% of Java online submissions for Maximum Binary Tree.
//	Memory Usage: 41.1 MB, less than 6.52% of Java online submissions for Maximum Binary Tree.
    public TreeNode constructMaximumBinaryTree(int[] nums) {


        if (nums == null || nums.length == 0) return null;

        int maxNumer = 0;
        int maxPosition = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > maxNumer) {
                maxNumer = nums[i];
                maxPosition = i;
            }
        }

        TreeNode root = new TreeNode(maxNumer);

        int[] subL = (maxPosition == 0) ? null : IntStream.range(0, maxPosition).map(i -> nums[i]).toArray();
        int[] subR = (maxPosition == nums.length - 1) ? null : IntStream.range(maxPosition + 1, nums.length).map(i -> nums[i]).toArray();

        root.left = constructMaximumBinaryTree(subL);
        root.right = constructMaximumBinaryTree(subR);

        return root;
    }

}
