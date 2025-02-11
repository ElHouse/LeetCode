package com.leetcode;




//Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
//Memory Usage: 34.2 MB, less than 98.70% of Java online submissions for To Lower Case.
public class _709_To_Lower_Case {

	public String toLowerCase(String str) {

		if(str == null ) return null;
		if(str.isEmpty()) return str;
		
		StringBuilder sb = new StringBuilder();
				
		for(int i=0; i<str.length(); i++) {
			
			char aux = str.charAt(i);
			
			if(aux>=65&& aux<=90) aux+=(char) +32;
			
			sb.append(aux);
			
		}
		
		return sb.toString();
	}
	

	
	
}
