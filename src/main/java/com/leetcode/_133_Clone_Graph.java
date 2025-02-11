package com.leetcode;

import java.util.*;

public class _133_Clone_Graph {

//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Clone Graph.
//	Memory Usage: 32.3 MB, less than 97.65% of Java online submissions for Clone Graph.
	public Node cloneGraph(Node node) {

		if(node == null) return null;
				
		return dfs(node,null);
	}
	
	
	private Map<Node,Node > map = new HashMap<>();

	private Node dfs(Node actual, Node prev) {
		
		Node node = new Node(actual.val, null);
		List<Node> neighbors = new ArrayList<>();
		map.put(actual,node);
		for(Node n: actual.neighbors) {
	
			if(map.containsKey(n)) {
				neighbors.add(map.get(n));
			}else {
				Node aux = dfs(n,actual);
				neighbors.add(aux);
			}			
			
		}
		
		node.neighbors = neighbors;
		
		return node;
	}

	
	static class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
		}

		public Node(int _val, List<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
		
		public String stringNode(Node node, Set<Node> path) {
			
			StringBuilder sb = new StringBuilder();
			sb.append(node.val);
			sb.append("{");
			path.add(node);
			
			for(Node n: node.neighbors) {
				
				if(!path.contains(n)) {
					path.add(n);
					
					sb.append(stringNode(n, path));	
				}else {
					sb.append(n.val);
				}
				sb.append(",");
			}
			
			sb.append("}");
			return sb.toString();
		}
		
		@Override
		public String toString() {
			
			Set<Node> path = new HashSet<>();
			
			
			
			return stringNode(this, path);
		}
	}
}
