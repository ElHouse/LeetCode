package com.leetcode;

public class _342_Power_of_Four {

	
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Power of Four.
//	Memory Usage: 33.4 MB, less than 6.67% of Java online submissions for Power of Four.
	public boolean isPowerOfFour(int num) {
		if (num <= 0)
			return false;
		if (num == 1)
			return true;

		int aux = 4;
		while (true) {

			if (aux == num)		return true;
			else if (aux > num)	return false;
			else if (aux <= 0)	return false;
			aux *= 4;
			
			
		}

	}
}
