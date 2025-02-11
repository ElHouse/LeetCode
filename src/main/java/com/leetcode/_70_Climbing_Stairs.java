package com.leetcode;


import java.util.HashMap;
import java.util.Map;


public class _70_Climbing_Stairs {
//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
//	Memory Usage: 32.9 MB, less than 5.26% of Java online submissions for Climbing Stairs.
	Map<Integer, Integer> cache = new HashMap<>();
//#memorization
//#dp
//#recursion 
	
	public int climbStairs(int n) {

		if(n<0) return 0;
		
		cache.put(0, 0);
		cache.put(1, 1);
		cache.put(2, 2);
				
		return dp(n);
	}
	
	
	public int dp(int n) {
		
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		
		int  r = dp(n-2)+dp(n-1);
		
		cache.put(n,r);
		
		return r;
	}

}
