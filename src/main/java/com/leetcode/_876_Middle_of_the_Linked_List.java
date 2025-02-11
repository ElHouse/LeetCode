package com.leetcode;

import com.leetcode.structure.ListNode;

public class _876_Middle_of_the_Linked_List {

	
//	Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
//	Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Middle of the Linked List.
    public ListNode middleNode(ListNode head) {
    	
    	if(head == null) return null;
        int size = 1;
        
        ListNode aux = head;
        while(aux.next != null) {
        	aux = aux.next;
        	size++;
        }
        
        if(size==0) return head;
        
        
        int target = ((int) Math.round(size/2)+1);
        
        aux = head;
        for (int i = 1; i < target; i++) {
        	aux = aux.next;
		}
  
        
		return aux;
        
    }


    

}