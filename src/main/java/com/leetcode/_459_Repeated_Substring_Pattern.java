package com.leetcode;


public class _459_Repeated_Substring_Pattern {

//	#KPM
	
	//mejor al 100%
	public boolean repeatedSubstringPattern(String s) {
		int prefixTable[] = new int[s.length()];
		int i = 0;
		int j = 1;
		while (j < s.length()) {
			if (s.charAt(i) == s.charAt(j)) {
				prefixTable[j++] = ++i;
			} else if (i > 0) {
				i = prefixTable[i - 1];
			} else if (i == 0) {
				j++;
			} else
				i = 0;
		}
		return prefixTable[s.length() - 1] > 0 && s.length() % (s.length() - prefixTable[s.length() - 1]) == 0;
	}
	
//	Runtime: 350 ms, faster than 7.64% of Java online submissions for Repeated Substring Pattern.
//	Memory Usage: 38.5 MB, less than 71.43% of Java online submissions for Repeated Substring Pattern.
	public boolean repeatedSubstringPattern2(String s) {

		if(s==null || s.isEmpty()) return false; 
		if(s.length() == 1) return false;
		
		int[] sufPre = getPrefixSufixRelationship(s);
		String maxPrefix = getMaxPrefix(s, sufPre);
		
		if(maxPrefix == null || maxPrefix.isEmpty()) return false;
	
		while( maxPrefix.length() > 0 ){
			 
			 String aux = repetString(s,maxPrefix);
			 if(aux.equals(s)) return true;
			 			
			 sufPre    = getPrefixSufixRelationship(maxPrefix);
			 maxPrefix = getMaxPrefix(s, sufPre);
		}
		
		return false;
	}
	
	
	
	
	public String getMaxPrefix(String s, int[] sufPre) {
		
		int max = 0;
		int aux = 0;
		
		for (int i = 0; i < sufPre.length; i++) {
			if(sufPre[i] > max ) {
				max = sufPre[i];
				aux = i;
			}
		}
		
		return  s.substring(aux-max+1, aux+1);

	}
	
	public String repetString(String s, String p) {
		
		int a =  s.length()/p.length();
		int i =0;		
		StringBuilder sb = new StringBuilder();
		
		while(i<a) {
			i++;
			sb.append(p);
		}
		
		return sb.toString();
	}
			
	public int[] getPrefixSufixRelationship(String s) {
				
		int i = 1;
		int j = 0;
		int[] sufPre = new int[s.length()];
		
		while(i < s.length()) {
			
			if(s.charAt(i) == s.charAt(j)) {
				sufPre[i++] = ++j;
			}else {
			
				if(j==0) {
					i++;
				}else {
					j = sufPre[j-1];
				}
			}
			
		}
		
		return sufPre;
	}
	


}
