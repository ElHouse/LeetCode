package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _669_Trim_a_Binary_Search_Tree {

	TreeNode newHead = new TreeNode(Integer.MAX_VALUE);
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Trim a Binary Search Tree.
//	Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Trim a Binary Search Tree.
	public TreeNode trimBST(TreeNode root, int L, int R) {
		
		
		if(root == null) return null;
		inOrder(root, L, R, newHead);
		
		return newHead.left;
	}
	
	public void inOrder(TreeNode root, int L, int R, TreeNode newHead) {
		
		if(root== null) return ;
		
		if( L <=  root.val  && root.val <= R) {
			addToTrimTree(newHead, root.val);
		}
		
		if( root.val > L ) inOrder(root.left,  L, R,newHead); 
		if( root.val < R ) inOrder(root.right, L, R,newHead); 
		
		
	}

	
	public void addToTrimTree(TreeNode root, int val) {
	
		if(root.val < val) {
			
			if(root.right == null) {
				root.right = new TreeNode(val);
			}else {
				addToTrimTree(root.right, val);
			}
		}else {
			
			if(root.left == null) {
				root.left = new TreeNode(val);
			}else {
				addToTrimTree(root.left, val);
			}
			
		}
			
	}



	

}