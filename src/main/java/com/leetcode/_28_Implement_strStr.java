package com.leetcode;



public class _28_Implement_strStr {

	
//	Runtime: 552 ms, faster than 5.12% of Java online submissions for Implement strStr().
//	Memory Usage: 37 MB, less than 100.00% of Java online submissions for Implement strStr().
	public int strStr(String haystack, String needle) {

		int count = 0;

		if(needle   == null) return -1;
		if(haystack == null) return -1;
		if(needle   != null && needle.isEmpty())   return 0;
		if(haystack != null && haystack.isEmpty()) return -1;
		
		for( int i=0; i<haystack.length(); i++) {
			
			if(haystack.charAt(i) == needle.charAt(0) ) {
				count++;
				
				int a = i;
				for(int j=1; j<needle.length(); j++) {
					System.out.println(j+"<--->"+ needle.charAt(j));
					int aux = ++a;
					if(aux>=haystack.length()) break;
					if(haystack.charAt(aux) == needle.charAt(j)) count++;				
				}

				System.out.println("i-->"+i);
				System.out.println("count-->"+count);
				
				if(count == needle.length()) return a-(count-1);
						
				count = 0;
			}
			
		}
		
		return -1;
	}
	
	
	


}
