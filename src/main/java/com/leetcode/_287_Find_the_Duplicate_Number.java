package com.leetcode;

import java.util.Arrays;



public class _287_Find_the_Duplicate_Number {

	public int findDuplicate(int[] nums) {

		if(nums == null) return -1;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		
		return -1;
	}

}