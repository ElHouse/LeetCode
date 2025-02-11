package com.leetcode;

public class _771_Jewels_and_Stones {

	
//	Runtime: 1 ms, faster than 94.07% of Java online submissions for Jewels and Stones.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Jewels and Stones.
	public int numJewelsInStones(String J, String S) {

		if(J==null     || S== null)     return 0;
		if(J.isEmpty() || S.isEmpty() ) return 0;
		
		int count = 0 ;
		char[] jewels = J.toCharArray();
		char[] mine   = S.toCharArray();
		
		
		for (int i = 0; i < mine.length; i++) {
			
			for (int x = 0; x < jewels.length; x++) {
				if(jewels[x] == mine[i]) count++;
				
			}	
		}
		
		System.out.println(count);
		
		return count;
	}


	
}
