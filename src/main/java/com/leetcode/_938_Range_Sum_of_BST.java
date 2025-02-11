package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _938_Range_Sum_of_BST {

	int sum = 0;
	
//	Runtime: 1 ms, faster than 51.60% of Java online submissions for Range Sum of BST.
//	Memory Usage: 44.6 MB, less than 98.84% of Java online submissions for Range Sum of BST.
	
	public int rangeSumBST(TreeNode root, int L, int R) {

		if(root == null) return 0;
		
		if( L <=  root.val  && root.val <= R) 	sum+=root.val;
		
		rangeSumBST(root.left,  L, R);
		rangeSumBST(root.right, L, R);
				
		return sum;
	}


	
	

}
