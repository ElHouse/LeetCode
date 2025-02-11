package com.leetcode;


import com.leetcode.structure.TreeNode;

public class _450_Delete_Node_in_a_BST {

	public TreeNode deleteNode(TreeNode root, int key) {

		if(root == null) return null;
		
		
		if(root.val == key && root.left == null && root.right == null) {
			return null;
		}
		
//		if(root.val == key) {
//			TreeNode aux = searchLeftMost(root);
//			int min = aux.val;
//			System.out.println(">>>"+min);
//			algo(root, min);
//			root.val = min;
//		}else {
			TreeNode aux = new TreeNode(999);
			aux.left =root;
			algo(aux,key);
//		}
		return  root;
	}
	
	public void algo(TreeNode root, int val) {
		
		if(root == null) return ;
		System.out.println("....algo>"+root.val);
				
		if(root.val >= val) {
			if(root.left != null && root.left.val == val ) {
				
				TreeNode left  = root.left.left;
				TreeNode right = root.left.right;
				

				if(left == null && right == null) {//is a leaf
					System.out.println("is a leaf");
					root.left = null;
				}else if(left != null && right != null) {//two nodes
					System.out.println("two nodes");
					TreeNode auxT = searchLeftMost(root.left.right);
					int aux = auxT!=null?auxT.val:Integer.MAX_VALUE;
					System.out.println("aux R>"+aux);
					algo(root.left,aux);
					root.left.val =  aux;
				}else if(left != null && right == null) {//one node,  left
					System.out.println("solo left>"+left.val);
					int aux = left.val;
					algo(root.left,aux);
					root.left.val = aux;
				}else if(left == null && right != null) {//one node, right
					System.out.println("Solo right");
					int aux = right.val;
					algo(root.left,aux);
					root.left.val = aux;
				}
				
			}else {
				algo(root.left,val);
			}
		}else if(root.val <= val) {
			if(root.right != null && root.right.val == val ) {
				
				TreeNode left  = root.right.left;
				TreeNode right = root.right.right;
				
				if(left == null && right == null) {//is a leaf
					root.right = null;
				}else if(left != null && right != null) {//two nodes
					
					TreeNode auxT = searchLeftMost(root.right.right);
					int aux = auxT!=null?auxT.val:Integer.MAX_VALUE;
					System.out.println("aux R>"+aux);
					algo(root.right,aux);
					root.right.val =  aux;
				}else if(left != null && right == null) {//one node,  left
					
					System.out.println("Solo  left ");
					int aux = left.val;
					algo(root.right,aux);
					root.right.val = aux;
					
				}else if(left == null && right != null) {//one node, right
					
					System.out.println("Solo right");
					int aux = right.val;
					algo(root.right,aux);
					root.right.val = aux;
				}
				
			}else {
				algo(root.right,val);
			}
		}
		
	}
	

	public TreeNode searchLeftMost(TreeNode root) {
		
		System.out.println("searchLeftMost>"+root.val);

		TreeNode element  = root;
		
		while(element.left!=null) {
			element = element.left;
		}
				
		return element;
	}

	


}
