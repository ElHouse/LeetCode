package com.leetcode;

import java.util.ArrayList;
import java.util.List;


public class _784_Letter_Case_Permutation {

	List<String> answer = new ArrayList<>();
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Letter Case Permutation.
//	Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Letter Case Permutation.
	public List<String> letterCasePermutation(String s) {

		if (s == null || s.isEmpty())
			return answer;

		dfs(s.toCharArray(), 0);


		return answer;
	}

	public void dfs(char[] s, int position) {

		if (position == s.length) {
			answer.add(String.valueOf(s));
			return;
		}

		char ascii = s[position];

		if (Character.isLetter(ascii)) {

			char min = Character.toLowerCase(s[position]);
			char may = Character.toUpperCase(s[position]);
			
			s[position] = min;
			dfs(s, position + 1);
			s[position] = may;
			dfs(s, position + 1);
		}else {
			dfs(s, position + 1);
		}		

	}



}
