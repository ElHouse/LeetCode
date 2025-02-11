package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _39_Combination_Sum {

//	Runtime: 264 ms, faster than 5.06% of Java online submissions for Combination Sum.
//	Memory Usage: 46.7 MB, less than 5.19% of Java online submissions for Combination Sum.
	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		List<List<Integer>> answer = new ArrayList<>();

		if (candidates == null || candidates.length == 0)
			return answer;

		for (int i = 0; i < candidates.length; i++) {

			List<Integer> list = new ArrayList<>();
			dfs(i, candidates, target, candidates[i], list, answer);
		}

		return answer;
	}

	public void dfs(int x, int[] nums, int target, int sum, List<Integer> list, List<List<Integer>> answer) {

		list.add(nums[x]);

		Collections.sort(list);
		
		if (sum == target) {
			for (List<Integer> l : answer) {
				if (l.equals((list))) {
					return;
				}
			}
			answer.add(list);
		} else if (sum > target) {
			return;
		} else {

			for (int i = 0; i < nums.length; i++) {
				List<Integer> aux = new ArrayList<>();
				aux.addAll(list);
				dfs(i, nums, target, sum + nums[i], aux, answer);
			}
		}

	}

}
