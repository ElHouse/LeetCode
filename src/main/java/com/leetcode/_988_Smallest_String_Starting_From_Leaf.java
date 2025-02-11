package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.leetcode.structure.TreeNode;

public class _988_Smallest_String_Starting_From_Leaf {


	List<String> list = new ArrayList<>();

//	Runtime: 5 ms, faster than 12.94% of Java online submissions for Smallest String Starting From Leaf.
//	Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Smallest String Starting From Leaf.
	public String smallestFromLeaf(TreeNode root) {

		if(root == null) return null;
		
		algo(root, new StringBuilder());

		Collections.sort(list);
		
		list.forEach(System.out::println);
		
		
		return list.get(0).toLowerCase();
	}
		
	public void algo(TreeNode root, StringBuilder path) {
		
		
		if(root.left == null && root.right == null) {
			path.append((char)(root.val +65));
			list.add(path.reverse().toString());
		
		}else {
			path.append((char)(root.val+65));
		}
		
		if(root.left != null) {
			algo(root.left, new StringBuilder(path));
		}
		
		if(root.right != null) {
			algo(root.right, new StringBuilder(path));
		}
		
		
	}


	


}