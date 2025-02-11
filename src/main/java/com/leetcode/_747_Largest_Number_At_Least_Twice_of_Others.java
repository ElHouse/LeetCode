package com.leetcode;


import java.util.Arrays;


public class _747_Largest_Number_At_Least_Twice_of_Others {

	public int dominantIndex(int[] nums) {

		if(nums==null || nums.length == 0) return-1;
		if(nums.length == 1) return 0;
		
		int[] numsAux = new int[nums.length];
				
		for (int i = 0; i < nums.length; i++) {
			numsAux[i] = nums[i];
		}
		
		
		Arrays.sort(numsAux);
		
		
		int last     = numsAux[nums.length-1];
		int anteLast = numsAux[nums.length-2];
		
		if(!( anteLast*2 <= last )) return -1;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == last) return i;
		}

		
		return -1;
	}
	

}
