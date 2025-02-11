package com.leetcode;

public class _374_Guess_Number_Higher_or_Lower {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
//	Memory Usage: 33 MB, less than 100.00% of Java online submissions for Guess Number Higher or Lower.
	public int guessNumber(int n) throws InterruptedException {

		long x = 0;
		long y = n;
		
		while(true) {
			long mid = (y+x)/2 + (y+x)%2;
			System.out.println(">>>"+mid);
			long guess = guess((int) mid);
			if(guess==0) {
				return (int)mid;
			}else {
				if(guess == -1) {
					y = mid;
				}else if(guess == 1) {
					x = mid;
				}
			}
			
		}
	}

	int x = 0;
	private int guess(int mid) {
		int v = x;
		if(mid == v)return 0;
		else if(mid < v) return 1;
		else  return -1;
	}
	
}
