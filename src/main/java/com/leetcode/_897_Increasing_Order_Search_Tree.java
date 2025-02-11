package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _897_Increasing_Order_Search_Tree {

	
	public TreeNode rootDumy= null;
	public TreeNode newRoot = null;
	public TreeNode leaf    = null;

//	Runtime: 2 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
//	Memory Usage: 44.4 MB, less than 40.63% of Java online submissions for Increasing Order Search Tree.
	public TreeNode increasingBST(TreeNode root) {

		createNewTree(root);

		return newRoot;
	}
	
	public void createNewTree(TreeNode root) {
		
		if(root.left != null) {
			createNewTree(root.left);
		}
		
		if(newRoot == null) {
			newRoot = root;
			leaf = newRoot;
		}else {
			root.left = rootDumy;

			leaf.right = root;
			leaf = leaf.right;
		}
		
		
		
		if(root.right != null) {
			createNewTree(root.right);
		}
		
		
		
	}


}
