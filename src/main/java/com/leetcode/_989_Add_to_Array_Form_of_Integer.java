package com.leetcode;

import java.util.*;


public class _989_Add_to_Array_Form_of_Integer {

	boolean flag = false;
//	Runtime: 22 ms, faster than 30.30% of Java online submissions for Add to Array-Form of Integer.
//	Memory Usage: 41.2 MB, less than 100.00% of Java online submissions for Add to Array-Form of Integer.
	public List<Integer> addToArrayForm(int[] A, int K) {

		List<Integer> answer = new ArrayList<>();
		Queue<Integer> cola  = new LinkedList<>();
		Stack<Integer> pila  = new Stack<>();
		
		stackFromNumber(K, cola);
		
		int i = A!=null?A.length-1:-1;
		
		while(!cola.isEmpty() || i >=0) {
		
			int auxArray = getNext(A, i--);
			int auxQueue = cola.isEmpty()?0:cola.poll();

			
			int sum = auxArray + auxQueue + (flag?1:0);
			
			if(sum>=10) {
				sum-=10;
				flag = true;
			}else {
				flag = false;
			}
			
			
			pila.add(sum);
			
		}
		
		if(flag) pila.add(1);
		
		while(!pila.isEmpty()) {
			answer.add(pila.pop());
		}
		
		return answer;
	}

	
	public void stackFromNumber(int num, Queue<Integer> cola) {
		
		
		while(num>0) {
			
			int aux = num%10;
			cola.add(aux);
			num = num / 10;
			
		}
	}
	
	public int getNext(int[] A, int i) {
		
		if(i < 0) {
			return 0;
		}
		
		return A[i];
	}
	
	


}
