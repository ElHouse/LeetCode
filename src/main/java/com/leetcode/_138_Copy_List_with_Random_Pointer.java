package com.leetcode;


public class _138_Copy_List_with_Random_Pointer {

//	Runtime: 7 ms, faster than 73.96% of Java online submissions for Copy List with Random Pointer.
//	Memory Usage: 33.9 MB, less than 99.07% of Java online submissions for Copy List with Random Pointer.
    public Node copyRandomList(Node head) {
    

        if(head == null) return null;	
     
    	Node newHead = new Node(head.val, null, null);
    	
    	copyNextNodes(head.next, newHead);
    
    	System.out.println("-----------");
    	System.out.println(nodeToString(head));   	
    	System.out.println(nodeToString(newHead));
    	
    	copyRandomNodes(head, newHead);
    	
    	System.out.println("-++++++++++");
    	System.out.println(nodeToString(head));   	
    	System.out.println(nodeToString(newHead));
    	
    	setCorrectRandom(head, newHead);
    	
    	System.out.println("????????");
    	System.out.println(nodeToString(head));   	
    	System.out.println(nodeToString(newHead));
    	
    	return newHead;
    }
    
    
    public void setCorrectRandom(Node head, Node newHead) {
    	
    	Node auxHead     = head;
    	Node auxNewHead  = newHead;
    	
    	while( auxHead != null ) {
    		
//    		if(auxHead.random != null) {
    			algo(auxHead, newHead, auxNewHead);
    			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¿");
    			System.out.println(nodeToString(newHead));

    			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¿");
//    		}
    		auxHead    = auxHead.next;
    		auxNewHead = auxNewHead.next;
    	}
    	
    }
    
    public void algo(Node head, Node newHead, Node ele) {
    	
    	Node auxNewHead  = newHead;
    	
    	while( auxNewHead != null ) {
    		System.out.println("...algo");
    		System.out.println("head>"+head.val);
    		System.out.println("auxNewHeda"+auxNewHead.val);
    		
    		if(auxNewHead.random == head) {
    			System.out.println("yes");
    			auxNewHead.random = ele;
    		}
    		auxNewHead = auxNewHead.next;
    	}
    }
    
    public void copyRandomNodes(Node head, Node newHead) {
    	
    	Node auxHead     = head;
    	Node auxNewHead  = newHead;
    	
    	while( auxHead != null ) {
    		
    		auxNewHead.random = auxHead.random;
    		
    		auxHead = auxHead.next;
    		auxNewHead = auxNewHead.next;
    	}
    	
    }
    
    
    public void copyNextNodes(Node head, Node newHead) {
    	
    	Node auxHead     = head;
    	Node tailNewHead = newHead;
    	    	
    	while(auxHead != null) {
    		
    		tailNewHead.next = new Node(auxHead.val,null,null);
    		tailNewHead = tailNewHead.next;
    		
    		auxHead = auxHead.next;
    	}
    	    	
    }
    
    

    
    
    public String nodeToString(Node head) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	Node aux = head;
    	
    	while(aux != null) {

//    		sb.append( aux.val);
    		sb.append( aux.hashCode());
    		sb.append("[");
    		sb.append(aux.random!=null?aux.random.hashCode():"null");
//    		sb.append(aux.random!=null?aux.random.val:"null");
    		sb.append("]");
    		sb.append(",");
    		
    		aux = aux.next;
    	}
    	
    	sb.deleteCharAt(sb.length()-1);
    	
    	return sb.toString();
    }

    static class Node {
    
    	public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }
    
}
