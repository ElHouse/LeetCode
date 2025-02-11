package com.leetcode;

import java.util.ArrayList;
 import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class _599_Minimum_Index_Sum_of_Two_Lists {

	
	int max = 0;
	
//	Runtime: 15 ms, faster than 21.90% of Java online submissions for Minimum Index Sum of Two Lists.
//	Memory Usage: 39.6 MB, less than 93.55% of Java online submissions for Minimum Index Sum of Two Lists.
    public String[] findRestaurant(String[] list1, String[] list2) {
     
    	int minPosition   = Integer.MAX_VALUE;
    	String[] answer = null;
    	Map<String, Entity> map = new HashMap<>();
        	
    	algo(list1, map);
    	algo(list2, map);    
    	
    	List<String> posibleAnswer = new ArrayList<>();
    	
    	for(String str: map.keySet()) {
    		
    		   Entity aux = map.get(str);
    		   if(aux.count == max ) {
    			   
    			   if(minPosition == Integer.MAX_VALUE) {
    				   minPosition = aux.position;
        			   posibleAnswer.add(str);
    			   }else {
    				   
    				   if(aux.position < minPosition) {
    					   posibleAnswer.clear();
    					   posibleAnswer.add(str);
    					   minPosition = aux.position;
    				   }else if(aux.position == minPosition)  {
    					   posibleAnswer.add(str);
    				   }
    				   
    			   }
    			   
    		   }
    		   
    	}
    	answer = posibleAnswer.toArray(new String[posibleAnswer.size()]);

    	return answer;
    }
    
    
    public void algo(String[] list1, Map<String,Entity> map) {
    
    	for (int i = 0; i < list1.length; i++) {
			
    		if(map.containsKey(list1[i])) {
    			
    			Entity aux = map.get(list1[i]);
    			
    			aux.count    += 1;
    			aux.position += i;
    			
    			max = Math.max(max, aux.count);
    			map.put(list1[i], aux);
    			
    		}else {
    			Entity aux = new Entity();
    			aux.count = 1;
    			aux.position = i;
    			
    			map.put(list1[i],aux);
    		}
    		
    			
		}
    }
    
    class Entity{
    	
    	int count;
    	int position;
    }
    

}
