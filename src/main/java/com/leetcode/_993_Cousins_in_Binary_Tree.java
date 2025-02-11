package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _993_Cousins_in_Binary_Tree {

	int depthX = -1;
	int depthY = -2;
	TreeNode parentX = null;
	TreeNode parentY = null;
	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Cousins in Binary Tree.
//	Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Cousins in Binary Tree.
	public boolean isCousins(TreeNode root, int x, int y) {

//		System.out.println("-------------------");
		algo(root, x, y, 0, root);
//		System.out.println("X>"+depthX);
//		System.out.println("Y>"+depthY);
//		
//		System.out.println("X N>"+parentX.val);	
//		System.out.println("Y N>"+parentY.val);
//		
//		System.out.println(parentX != parentY);
		
		if(depthX==depthY) {
			if(parentX != parentY) {
				return true;
			}
		}

		
		
		return false;
	}

	
	public void algo(TreeNode root, int x, int y, int depth, TreeNode parent) {

		if(root.val == x) { 
			parentX = parent;
			depthX  = depth;
		}
		if(root.val == y) {
			parentY = parent;
			depthY  = depth;
		}
		
		if(root.left != null) {
			algo(root.left, x, y, depth+1,root);
		}
				
		if(root.right != null) {
			algo(root.right, x, y, depth+1,root);
		}
	}


	


}
