package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class _77_Combinations {

	// #backtraking

//	Runtime: 69 ms, faster than 5.03% of Java online submissions for Combinations.
//	Memory Usage: 42.2 MB, less than 6.52% of Java online submissions for Combinations.
	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> answer = new ArrayList<>();
		if(n==0) return answer;
		
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = i+1;
		}
		
		for(int i=0; i<nums.length; i++) {
			List<Integer> list = new ArrayList<>();
			backTracking(i, nums, list, k, answer);
		}
		
		return answer;
	}

	public void backTracking(int x, int[] nums, List<Integer> list, int maxSize, List<List<Integer>> answer) {

//		list.add(nums[x]);
		if (list.size() == maxSize) {
			answer.add(list);
		} else {
			list.add(nums[x]);
			for (int i = x +1; i < nums.length; i++) {
				
			    list.add(nums[i]);
				backTracking(i, nums, list, maxSize, answer);
				list.remove(list.size()-1);
			}
		}

	}
	
	

	
	

}
