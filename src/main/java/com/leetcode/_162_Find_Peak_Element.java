package com.leetcode;

public class _162_Find_Peak_Element {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
//	Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Find Peak Element.
	public int findPeakElement(int[] nums) {

		if(nums == null || nums.length == 0) return -1;
		
		for (int i = 0; i < nums.length; i++) {
			double prev = getNumsValue(nums, i-1);
			double next = getNumsValue(nums, i+1);
			
			if(prev < nums[i] && nums[i] > next) {
				return i;
			}
			
		}
		
		return -1;
	}
	
	public double getNumsValue(int[] nums, int n) {

		if(n==-1)           return Double.NEGATIVE_INFINITY;
		if(n==nums.length) return  Double.NEGATIVE_INFINITY;
		
		return nums[n];
	}
	

	
}
