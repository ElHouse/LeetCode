package com.leetcode;

import com.leetcode.structure.ListNode;

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
//Memory Usage: 37.1 MB, less than 99.98% of Java online submissions for Linked List Cycle.
public class _141_Linked_List_Cycle {

	
	public static boolean hasCycle(ListNode head) {
	     
		if(head==null) return false;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(slow.next!=null) {
		
			slow = slow.next;
			
			if( fast.next!=null && fast.next.next != null ) {
				fast = fast.next.next;				
			}else {
				return false;
			}

			if(slow.equals(fast)) return true;
			
		}
		
		return false;
    }



}
