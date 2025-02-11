package com.leetcode;

import com.leetcode.structure.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class _429_N_ary_Tree_Level_Order_Traversal {

//	Runtime: 3 ms, faster than 77.58% of Java online submissions for N-ary Tree Level Order Traversal.
//	Memory Usage: 47.6 MB, less than 50.00% of Java online submissions for N-ary Tree Level Order Traversal.
	public List<List<Integer>> levelOrder(Node root) {

		if(root == null) return null;
		
		List<List<Integer>> retorno = new ArrayList<>();
		Queue<Node> cola = new LinkedList<>();
		
		findChildren(root, cola);
		List<Integer>  b  = new ArrayList<>();
		b.add(root.val);
		
		retorno.add(b);
		
		while(!cola.isEmpty()) {
			
			List<Integer> aux     = new ArrayList<>();
			List<Node>    auxNode = new ArrayList<>();
			while(!cola.isEmpty()) {
				Node n = cola.poll();
				aux.add(n.val);
				auxNode.add(n);
			}
			
			for(Node n: auxNode) {
				
				findChildren(n, cola);
			}
			
			retorno.add(aux);
		}
		
		System.out.println("size>"+retorno.size());
				
		for(List<Integer> i : retorno) {
			System.out.println(i.toString());
		}
		
		return retorno;
	}
	
	
	public void findChildren(Node node, Queue<Node> cola) {
		
		if(node.children != null) {
			
			for(Node n: node.children) {
				cola.add(n);
			}
			
		}
	}
}
