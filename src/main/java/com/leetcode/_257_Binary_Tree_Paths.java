package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class _257_Binary_Tree_Paths {

	List<String> list = new ArrayList<>();
	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
//	Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Binary Tree Paths.
	public List<String> binaryTreePaths(TreeNode root) {

		if(root == null) return list;
		algo(root, new StringBuilder());
		
		list.forEach(System.out::println);
		
		return list;
	}

	
	public void algo(TreeNode root, StringBuilder path) {
		
		
		if(root.left == null && root.right == null) {
			path.append(root.val);
			list.add(path.toString());
		}else {
			path.append(root.val);
			path.append("->");		
		}
		
		if(root.left != null) {
			algo(root.left, new StringBuilder(path));
		}
		
		if(root.right != null) {
			algo(root.right, new StringBuilder(path));
		}
		
		
	}
	

	
	

}
