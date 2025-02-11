package com.leetcode;


public class _326_Power_of_Three {


	
//	Runtime: 11 ms, faster than 75.31% of Java online submissions for Power of Three.
//	Memory Usage: 35.8 MB, less than 6.25% of Java online submissions for Power of Three.
	public boolean isPowerOfThree(int n) {

		if(n<=0) return false;
		if(n==1) return true;
		
		
		int aux = 3;
		while (true) {
			
			if (aux == n)	  return true;
			else if (aux > n) return false;
			else if(aux <0 )  return false;
			aux *= 3;
		}

	}
	

}
