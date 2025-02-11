package com.leetcode;

import com.leetcode.structure.ListNode;

public class _83_Remove_Duplicates_from_Sorted_List {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
//	Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
    public ListNode deleteDuplicates(ListNode head) {
     
    	
    	ListNode preHead = new ListNode(Integer.MIN_VALUE);
    	preHead.next 	 = head;
    	
    	ListNode aux = head;
    	
    	while(aux!=null) {
    		
    		if(aux.val != preHead.val) {
    			aux = aux.next;
    			preHead = preHead.next;
    		}else {
    			if(aux.next != null) {
    				preHead.next = aux.next;
    				aux          = preHead.next;
    			}else {
    				preHead.next = null;
    				aux = null;
    			}
    		}
    		
    	}
    	
    	return head;
    }
	

    
}
