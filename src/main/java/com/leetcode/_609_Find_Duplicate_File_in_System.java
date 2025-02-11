package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class _609_Find_Duplicate_File_in_System {

	public List<List<String>> findDuplicate(String[] paths) {

		
		
		Map<String,List<String>> map = new HashMap<>();
		List<List<String>> answer = new ArrayList<>();
		
		if(paths == null) return answer;
		
		for(String path: paths) {
			
			String[] splited = path.split(" ");
			
			for (int i = 1; i < splited.length; i++) {
				
				StringBuilder sb = new StringBuilder();				
				
				String[] aux = splited[i].split("\\(");
				
				sb.append("(");
				sb.append(aux[1]);
				
				if(map.containsKey(sb.toString())) {
					map.get(sb.toString()).add(splited[0]+"/"+aux[0]);
				}else {
					List<String> list = new ArrayList<>();
					list.add(splited[0]+"/"+aux[0]);
					map.put(sb.toString(),list);
				}
			}
			
		}
		
		map.forEach((k,v)->{
		
			if(v.size() > 1) answer.add(v);
		}) ;
		
		
		return answer;
	}
	
	
	

	
	
}
