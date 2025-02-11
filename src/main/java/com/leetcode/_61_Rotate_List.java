package com.leetcode;

import com.leetcode.structure.ListNode;

public class _61_Rotate_List {

	public static ListNode rotateRight(ListNode head, int k) {

		
		if(head==null) return null;
		if(k == 0) return head;
		
		int size = 0 ;
		ListNode phead = head;
		
		while(phead!=null) {
			size++;
			phead = phead.next;
		}
		
		if(size == 1) return head;
		
		while(k>size) {
			k-=size;
		}		
		
		k=size-k%size;
		
		if(k==size) return head;
		
 		ListNode newTailAux = head;
		
		for(int i=0; i<size-k-1; i++) {
			newTailAux = newTailAux.next;
		}
		
		ListNode newHead = newTailAux.next;
		ListNode newHeadAux = newTailAux.next;

		newTailAux.next = null;
		
		while(newHeadAux.next != null) {
			newHeadAux = newHeadAux.next;
		}
		
		newHeadAux.next = head;
		
		return newHead;
	}

}
