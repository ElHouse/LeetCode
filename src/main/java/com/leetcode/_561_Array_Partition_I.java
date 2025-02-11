package com.leetcode;


import java.util.Arrays;


public class _561_Array_Partition_I {

	
	
//	Runtime: 14 ms, faster than 93.74% of Java online submissions for Array Partition I.
//	Memory Usage: 39 MB, less than 100.00% of Java online submissions for Array Partition I.
	public int arrayPairSum(int[] nums) {


		if(nums == null)     return 0;
		if(nums.length == 0) return 0;
 		if(nums.length == 2) {
 			return nums[0];
 		}
		
		Arrays.sort(nums);
		
		int suma = 0;
		for(int i=0;i<nums.length; i=i+2) {
			suma += nums[i];
		}
		
		return suma;
	}
	

	
}
