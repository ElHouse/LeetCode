package com.leetcode;

import com.leetcode.structure.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class _589_N_ary_Tree_Preorder_Traversal {

	
//	Runtime: 4 ms, faster than 17.60% of Java online submissions for N-ary Tree Preorder Traversal.
//	Memory Usage: 49.3 MB, less than 12.20% of Java online submissions for N-ary Tree Preorder Traversal.
	public List<Integer> preorder(Node root) {


		List<Integer> result = new ArrayList<>();
		if(root == null) return result;
		Stack<Node> pila  = new Stack<>();
		
		pila.add(root);
		
		while(!pila.isEmpty()) {
		
			Node aux = pila.pop();
		
			result.add(aux.val);
			
			if(aux.children != null) {
			
				for (int i = aux.children.size()-1; i >= 0; i--) {
					pila.add(aux.children.get(i));
				}
				
			}
			
		}

		
		
		result.forEach(n->{System.out.print(n+" "); });
		
		return result;
	}


}
