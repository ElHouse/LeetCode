package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
 */
public class _1305_All_Elements_in_Two_Binary_Search_Trees {


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> numbers = new ArrayList<>();
        dfs(root1, numbers);
        dfs(root2, numbers);

        Collections.sort(numbers);

        return numbers;
    }


    private void dfs(TreeNode head, List<Integer> numbers) {

        if (head == null) return;

        if (head.left != null) dfs(head.left, numbers);

        numbers.add(head.val);

        if (head.right != null) dfs(head.right, numbers);
    }


}
