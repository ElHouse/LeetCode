package com.leetcode;


import java.util.Arrays;


public class _1046_Last_Stone_Weight {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Last Stone Weight.
//	Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Last Stone Weight.
	public int lastStoneWeight(int[] stones) {

		if(stones == null) return 0;
		
		Arrays.sort(stones);
		int n = stones.length-1;
		
		while(n>=0) {
			
			if(n>=1) {
				
				int y = stones[n--];
				int x = stones[n];

				stones[n+1]= Integer.MAX_VALUE;
				
				if(x==y) {
					stones[n--]= Integer.MAX_VALUE;
				}else {
					stones[n]= y-x;
				}
					

				Arrays.sort(stones);
				
			}else {
				return stones[0];
			}
			
		}
		
		
		return 0;
	}
	

	
	
}
