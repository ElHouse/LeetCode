package com.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class _1170_Compare_Strings_by_Frequency_of_the_Smallest_Character {

	public int[] numSmallerByFrequency(String[] queries, String[] words) {


		int[] result = new int[queries.length];
		int[] A  = new int[queries.length];
		int[] B  = new int[words.length];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = process(queries[i]);
		}

		for (int i = 0; i < B.length; i++) {
			B[i] = process(words[i]);
		}
		
		Arrays.sort(B);
		
		System.out.println("A");
		System.out.println(Arrays.toString(A));
		

		System.out.println("B");
		System.out.println(Arrays.toString(B));
		
	
		
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < B.length; j++) {
				
				if(A[i] < B[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		
		return result;
	}
	
	private int process(String word) {
		
		int min = Integer.MAX_VALUE;
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i = 0; i < word.length(); i++) {
			
			if(map.containsKey(word.charAt(i)))
				map.compute(word.charAt(i), (k,v)-> v+=1 );
			else {
				map.put(word.charAt(i),1);
			}
		}
		
		for(Character c : map.keySet()) {
			min = Math.min(min, c);
		}
		
		return map.get((char) min);
	}
	

	
}
