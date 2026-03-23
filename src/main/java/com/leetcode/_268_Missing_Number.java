package com.leetcode;


import java.util.Arrays;


/*

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
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
