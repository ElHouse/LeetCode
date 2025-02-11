package com.leetcode;

public class _231_Power_of_Two {

	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Two.
//	Memory Usage: 33.5 MB, less than 7.32% of Java online submissions for Power of Two.
	public boolean isPowerOfTwo(int n) {

		if (n <= 0)
			return false;
		if (n == 1)
			return true;

		int aux = 2;
		while (true) {

			if (aux == n)		return true;
			else if (aux > n)	return false;
			else if (aux <= 0)	return false;
			aux *= 2;
			
			
		}

	}


}
