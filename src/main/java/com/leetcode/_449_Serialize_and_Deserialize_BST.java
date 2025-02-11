package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _449_Serialize_and_Deserialize_BST {
	
//	Runtime: 10 ms, faster than 32.73% of Java online submissions for Serialize and Deserialize BST.
//	Memory Usage: 38.1 MB, less than 100.00% of Java online submissions for Serialize and Deserialize BST.
	
	public String serialize(TreeNode root) {

		if(root == null) return "";
		
		StringBuilder sb = new StringBuilder();
		Queue<TreeNode> cola = new LinkedList<>();

		cola.add(root);

		while(!cola.isEmpty()) {
			
			TreeNode node = cola.poll();
			if(node != null) {
				cola.add(node.left );
				cola.add(node.right);
				sb.append(node.val);
			}else {
				sb.append("null");
			}
			sb.append(",");
		}
		
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {

		if(data == null || data.isEmpty()) return null;
		
		//ever time a null is found in the nodes array, it is count to skip 2 positions 
		int nulls = 0;

		String[] array = data.split(",");
		  
		TreeNode[] nodes = new TreeNode[array.length];
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].trim().equals("null")) {
				nodes[i] = null;
			}else {
			
				int number = Integer.parseInt(array[i].trim());
				TreeNode aux = new TreeNode(number);
				nodes[i] = aux;
			}
		}
		
		int i = 0;
		while(i < array.length) {
			
			if(nodes[i] == null) {
				nulls++;
			}else {
				
				int l = ( (2*i)+1 )-(2*nulls);
				int r = ( (2*i)+2 )-(2*nulls);

				if(l<array.length) nodes[i].left  = nodes[l];
				if(r<array.length) nodes[i].right = nodes[r];	
			}

			i++;
		}
						
		return nodes[0];
	}
	


}
