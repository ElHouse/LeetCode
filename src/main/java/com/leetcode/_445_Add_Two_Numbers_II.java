package com.leetcode;

import com.leetcode.structure.ListNode;

public class _445_Add_Two_Numbers_II {

	
//	Runtime: 2 ms, faster than 99.81% of Java online submissions for Add Two Numbers II.
//	Memory Usage: 44 MB, less than 73.53% of Java online submissions for Add Two Num
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	int sizeL1 = getListNodeSize(l1);
    	int sizeL2 = getListNodeSize(l2);
    	
    	int maxSize = Math.max(sizeL1, sizeL2)+1;
    	
    	ListNode headL1 =addXNodesToHead(l1, maxSize-sizeL1);   	
    	ListNode headL2 =addXNodesToHead(l2, maxSize-sizeL2);   	

    	
    	algo(headL1, headL2);   	

    	
    	
    	if(headL1.val == 0 ) {
    		headL1 = headL1.next;
    	}
    	
    	return headL1;
    }
    
    public int algo(ListNode l1, ListNode l2) {
    	
    	int extra = 0;
    	if( l1.next != null ) {
    		extra = algo(l1.next, l2.next);
    	}
    	
    	int sum = l1.val + l2.val + extra;
    	
    	if(sum>=10) {
    		l1.val = sum - 10;
    		return 1;
    	}else {
    		l1.val = sum;
    		return 0;
    	}
    }
    
    
    public ListNode addXNodesToHead(ListNode head, int n) {
    	
    	
    	ListNode newHead = new ListNode(0);
    	    
    	ListNode tail = newHead;
    	for (int i = 0; i < n-1; i++) {
    		ListNode aux = new ListNode(0);
    		tail.next = aux;
    		tail = tail.next;
		}
    	
    	tail.next = head;
    	
    	return newHead;
    }
    
    public int getListNodeSize(ListNode head) {
    	
    	int size = 0;
    	
    	ListNode aux = head;
    	while(aux!=null) {
    		size++;
    		aux = aux.next;
    	}
    	
    	return size;
    	
    }
    

    
}