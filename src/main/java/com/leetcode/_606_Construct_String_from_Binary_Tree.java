package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _606_Construct_String_from_Binary_Tree {

//	Runtime: 6 ms, faster than 75.94% of Java online submissions for Construct String from Binary Tree.
//	Memory Usage: 37.9 MB, less than 100.00% of Java online submissions for Construct String from Binary Tree.
	public String tree2str(TreeNode t) {

		String a = treeSerialization(t);
				
		return a.substring(1, a.length()-1);
	}

	public String treeSerialization(TreeNode root) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("(");
		
		sb.append(root.val);
		
		if(root.left != null && root.right != null) {
			sb.append( treeSerialization(root.left));
			sb.append( treeSerialization(root.right));
		}else if(root.left != null && root.right == null) {
			
			sb.append( treeSerialization(root.left));
		}else if(root.left == null && root.right != null) {
		
			sb.append("()");
			sb.append( treeSerialization(root.right));
		}
		
        sb.append(")");
		
		return sb.toString();
		
	}


}