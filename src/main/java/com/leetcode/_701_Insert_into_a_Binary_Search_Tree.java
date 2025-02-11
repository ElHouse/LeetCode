package com.leetcode;

import com.leetcode.structure.TreeNode;

public class _701_Insert_into_a_Binary_Search_Tree {

//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
//	Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Insert into a Binary Search Tree.
	
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
    	printTree(root);
    	System.out.println("++++++++++++++++");
    	algo(root, val);
    	printTree(root);
    	
    	return root;
    }
    
    
    public TreeNode algo(TreeNode root, int val){
    	
    	
    	if(root.val < val) {

    		if(root.right == null) {

    			root.right = new TreeNode(val);
    		}else {

    			algo(root.right,val);
    		}
    		
    	}else {
    		
    		if(root.left == null) {
    			root.left = new TreeNode(val);
    		}else {
    			algo(root.left,val);
    		}
    	}
    	
    	return root;
    	
    }
    
    
    
	public static void printTree(TreeNode root) {
		
		boolean isLeaf = true;
		if(hasLeft(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.left);
		}
		if(hasRight(root)) {
			System.out.println(root.val);
			isLeaf = false;
			printTree(root.right);
		}
		
		if(isLeaf) {
			System.out.println(root.val);
			System.out.println("----------------");
		}
		
	}
	public static boolean hasRight(TreeNode root) {
		
		return root.right!=null;
	}
	public static boolean hasLeft(TreeNode root) {
		
		return root.left!=null;
	}

	

}



























