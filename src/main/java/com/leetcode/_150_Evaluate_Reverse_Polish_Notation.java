package com.leetcode;


import java.util.Stack;


public class _150_Evaluate_Reverse_Polish_Notation {

//	Runtime: 5 ms, faster than 91.00% of Java online submissions for Evaluate Reverse Polish Notation.
//	Memory Usage: 37.4 MB, less than 98.00% of Java online submissions for Evaluate Reverse Polish Notation.
	public int evalRPN(String[] tokens) {

		Stack<Integer> stack = new Stack<>();		
		
		for (int i = 0; i < tokens.length; i++) {
			
			String s = tokens[i];

			switch(s) {
				case "+":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b+a);
				}break;
				case "-":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b-a);
				}break;
				case "/":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b/a);
				}break;
				case "*":{
					int a = stack.pop();
					int b = stack.pop();
					stack.add(b*a);
				}break;
				default:{
					stack.add(Integer.parseInt(s));
				}
			}
			
			
		}
		
		return stack.pop();
	}
	

}
