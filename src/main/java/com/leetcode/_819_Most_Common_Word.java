package com.leetcode;

import java.util.HashMap;
import java.util.Map;


public class _819_Most_Common_Word {

	public boolean isBanned(String word, String[] banned) {
		
		for (int i = 0; i < banned.length; i++) {
			if(word.equals(banned[i])) {
				return true;
			}
		}
		return false;
	}
	
//	Runtime: 15 ms, faster than 62.07% of Java online submissions for Most Common Word.
//	Memory Usage: 36.8 MB, less than 87.88% of Java online submissions for Most Common Word.
	public String mostCommonWord(String paragraph, String[] banned) {

		System.out.println("---------------");
		if(paragraph == null) return null;
		
		System.out.println(paragraph);
		
		paragraph = paragraph.replaceAll("!","")
				.replaceAll("\\?","")
				.replaceAll("'","")
				.replaceAll(","," ")
				.replaceAll(";","")
				.replaceAll("\\.","").toLowerCase();
		
		paragraph.replace("  ", " ").trim();
		
		System.out.println("sin signos->"+paragraph );
		
		String[] spl = paragraph.split(" ");
		
		Map<String,Integer>  mapa = new HashMap<>();
		
		for (int i = 0; i < spl.length; i++) {
			
			if(!isBanned(spl[i], banned) && !spl[i].equals("")) {
				if(mapa.containsKey(spl[i])) {
					mapa.put(spl[i],mapa.get(spl[i])+1);
				}else {
					mapa.put(spl[i], 1);
				}
			}
			
		}
		
		int max = 0;
		String aux = "";
		for(String str: mapa.keySet()) {
		
			System.out.println("->"+str);
			
			if(max < mapa.get(str)) {
				max = mapa.get(str);
				aux = str;
			}
			
		}
		
		
		return aux;
	}


}
