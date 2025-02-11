package com.leetcode;

public class _430_Flatten_a_Multilevel_Doubly_Linked_List {

	/*
	public Node flatten(Node head) throws InterruptedException {

		if (head == null) return null;

		Node headNode = new Node(0,null,null,null) ;	
		Node node = headNode;
		

		while (head != null) {

			node.next = head;
			node = node.next;
	
			if(head.child!=null) {

				Node auxx = node.next;
				Node child = flatten(head.child);
				
				head.child = null;				
				child.prev = node;
				node.next = child;
				while(node.next!=null) {
					node = node.next;
				}
				head = auxx;
				
			}else {			
				head = head.next;
			}
		}
			
		return headNode.next;
    }*/
	
}
