package com.leetcode;

import java.util.*;



public class _763_Partition_Labels {

	
//	Runtime: 6 ms, faster than 30.62% of Java online submissions for Partition Labels.
//	Memory Usage: 36.3 MB, less than 96.10% of Java online submissions for Partition Labels.
	public List<Integer> partitionLabels(String S) {

		List<Integer> answer = new ArrayList<>();

		if (S == null || S.isEmpty()) return answer;

		Map<Character, Integer> mapa = createMap(S);

		for (int i = 0; i < S.length(); ) {
			int aux = mapa.get(S.charAt(i));
			int max = algo(S, mapa, i, aux);

			System.out.println("aux>"+aux);
			System.out.println("max>"+max);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			answer.add(max-i+1);
			i = max+1;
		}
		
		answer.forEach(System.out::println);
		
		return answer;
	}

	
	public int algo(String S, Map<Character, Integer> mapa, int i, int j ) {
		
		System.out.println("algo");
		System.out.println("i>"+i);
		System.out.println("j>"+j);
		if(i == j) return i;

		Set<Character> seti = new HashSet<>();
		
		for (; i < j; i++) {
			
			j = Math.max(j, mapa.get(S.charAt(i)));
			seti.add(S.charAt(i));
		}
		
		return j;
	}
	
	public Map<Character, Integer> createMap(String s) {

		Map<Character, Integer> mapa = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			mapa.put(c, i);
		}

		return mapa;
	}

	
	
	

}
