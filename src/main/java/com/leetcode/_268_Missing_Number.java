package com.leetcode;


import java.util.Arrays;



public class _268_Missing_Number {

	
//	Runtime: 7 ms, faster than 21.39% of Java online submissions for Missing Number.
//	Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Missing Number.
	public int missingNumber(int[] nums) {

		if (nums == null )	    return 0;
		if (nums.length == 0)	return 0;

		Arrays.sort(nums);

		int j = 0;
		for (; j < nums.length; j++) {

			if (j != nums[j])  return j;
		}

		return j;
	}

}
