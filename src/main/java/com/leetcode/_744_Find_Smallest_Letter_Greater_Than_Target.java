package com.leetcode;

public class _744_Find_Smallest_Letter_Greater_Than_Target {

	public char nextGreatestLetter(char[] letters, char target) {

		return ' ';
	}

	public boolean algo(char[] letters, char target, int l, int r) {

		

		
		int mid = l+(r-l)/2;
		
		boolean ele = false;
		if(letters[mid]==target) {
			return true;
		}else {
			if(letters[mid]>target) {
				ele = algo(letters, target, l, mid -1);
			}else {
				ele = algo(letters, target, mid+1, r);
			}
		}
		
		return ele;
	}
	
	


}
