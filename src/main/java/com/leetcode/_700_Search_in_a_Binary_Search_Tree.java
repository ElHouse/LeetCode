package com.leetcode;


import com.leetcode.structure.TreeNode;


public class _700_Search_in_a_Binary_Search_Tree {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
//	Memory Usage: 39.7 MB, less than 86.67% of Java online submissions for Search in a Binary Search Tree.
	public TreeNode searchBST(TreeNode root, int val) {

		if(root == null) return null;
		
		return search(root, val);
	}

	public TreeNode search(TreeNode root, int val) {
	
		TreeNode element = null;
		
		if(root.val == val) {
			return root;
		}
		
		if(root.left!= null) {
			element = search(root.left, val);
			if(element != null) return element;
		}
		
		if(root.right!= null) {
			element = search(root.right, val);
			if(element != null) return element;
		}
		
		return element;
	}


}
