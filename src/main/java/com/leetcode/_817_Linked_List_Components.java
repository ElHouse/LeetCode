package com.leetcode;


import com.leetcode.structure.ListNode;

public class _817_Linked_List_Components {


//	la descripcion dle problema no me queda claro
	public int numComponents(ListNode head, int[] G) {

		int count = 0;
		
		while(head != null) {
			
			if(head.next != null) {
				
				if(finder(G, head.val, head.next.val)) {
					count++;
				}
			}
			
			head = head.next;
		}
	
		return count;
	}
		
	public boolean finder(int[] G, int a, int b) {

		System.out.println("Finder >"+a+"---"+b);
		
		int posA = Integer.MIN_VALUE;
		int posB = Integer.MIN_VALUE;
		
		for (int i = 0; i < G.length; i++) {
			
			if(G[i] == a) {
				posA = i;
			}else if(G[i] == b) {
				posB = i;
			}
		}
		
		if (posA == Integer.MIN_VALUE || posB == Integer.MIN_VALUE) {
			return false;
		}
		
		return posB>posA;
	}
	

	
	
}
