package com.leetcode;

import java.util.Arrays;


public class _88_Merge_Sorted_Array {

	_88_Merge_Sorted_Array mergeSortedArray = new _88_Merge_Sorted_Array();

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		if(nums1 == null || nums2 == null) return ;
		if(n==0          )                 return ;

		
		int r = m+n;
		r--;
		if(m!=0) m--;
		n--;
		while(r>-1   ) {
			
			System.out.println("-------------------");
			
			if( nums1[m] > nums2[n]) {
				System.out.println("case 1 >  "+ nums1[m] );
				nums1[r--] = nums1[m];
				
				nums1[m] = Integer.MIN_VALUE;
				m--;
				
				System.out.println(Arrays.toString(nums1));
				System.out.println(Arrays.toString(nums2));				
			}else if(nums1[m] <= nums2[n]) {

				System.out.println("case 2 >  "+ nums2[n]);
				nums1[r--] = nums2[n];
			    nums2[n] = Integer.MAX_VALUE;
			    n--;
				System.out.println(Arrays.toString(nums1));
				System.out.println(Arrays.toString(nums2));
			
			}
				
			System.out.println("R>"+r);
			System.out.println("M>"+m);
			System.out.println("N>"+n);
			
			if(n==-1) n=0;
			if(m==-1) m=0;
			
			
		}
	}

}
