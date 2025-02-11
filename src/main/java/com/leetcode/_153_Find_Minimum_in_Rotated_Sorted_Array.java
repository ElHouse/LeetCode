package com.leetcode;


public class _153_Find_Minimum_in_Rotated_Sorted_Array {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
//	Memory Usage: 38 MB, less than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
	public int findMin(int[] nums) {

		if(nums== null || nums.length == 0 ) return -1;
		
		int n = findPivot(nums);
		
		return nums[n==-1?0:n];
	}

	public int findPivot(int[] nums) {

		int x = 0;
		int y = nums.length - 1;

		while (y > x) {

			int mid = (y + x) / 2 + (y + x) % 2;

			if (mid == 0)
				return nums.length;

			if (nums[mid - 1] > nums[mid]) {
				return mid;
			} else {
				if (nums[mid] > nums[x]) {
					x = mid;
				} else {
					y = mid;
				}
			}

		}

		return -1;
	}

	

}
