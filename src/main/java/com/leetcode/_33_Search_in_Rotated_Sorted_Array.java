package com.leetcode;

public class _33_Search_in_Rotated_Sorted_Array {

	
//	Runtime: 1 ms, faster than 10.79% of Java online submissions for Search in Rotated Sorted Array.
//	Memory Usage: 39.8 MB, less than 15.10% of Java online submissions for Search in Rotated Sorted Array.
	public int search(int[] nums, int target) {


        if(nums==null || nums.length == 0) return -1;
       		
        if(nums.length == 1) {

        	if(nums[0]==target) return 0;
        	else                return -1;
        	
        }
        
		int pivote = findPivot(nums);
		
		System.out.println("pivote>"+pivote);
		
		if(pivote == -1) {
		
			return findNumber(nums, 0, nums.length-1, target);			
		}else {
			
			if(nums[pivote] == target) {
				return pivote;
			}else if(nums[0] <= target && target <= nums[pivote-1]) {
				return findNumber(nums, 0, pivote-1,target);
			}else if(nums[pivote] <= target && target <= nums[nums.length-1]) {
				return findNumber(nums, pivote, nums.length-1,target);
			}
			
		}
		
		
		return -1;
	}
	
	public int findNumber(int[] nums, int x, int y, int target) {

		System.out.println("---Find Number");
		
		System.out.println("x>"+x);
		System.out.println("y>"+y);

//    	int[] nums  = {4,5,6,7,0,1,2};
//    	//             0 1 2 3 4 5 6
		
		if(nums[x]==target) return x;
		if(nums[y]==target) return y;
		
		while(y>x) {
			System.out.println(".x>"+x);
			System.out.println(".y>"+y);
			int mid = (y+x)/2;
			System.out.println(">>>"+mid);
			System.out.println("nums[i]>"+nums[mid]);
			
			if(nums[mid]==target) {
				return mid;
			}else {
			
				if(nums[mid]<target) {
					x += 1;
				}else {
					y -= 1;
				}
				
			}

//			try {
//				Thread.sleep(0000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
		}
		return -1;
	}

    public int findPivot(int[] nums) {
    	
    	
    	int x = 0;
    	int y = nums.length-1;
    	
    	while(y>x) {
			
    		int mid = (y+x)/2 + (y+x)%2;

    		System.out.println("mid...>"+mid);
    		System.out.println("x...>"+x);
    		System.out.println("y...>"+y);
    	    if(mid == 0 ) return nums.length;
    	        		
			if( nums[mid-1] > nums[mid]  ) {
				return  mid;
			}else {
				if(nums[mid] > nums[x] ) {
					x = mid;
				}else {
					y = mid;
				}
			}
 			
		}
    	
    	return -1;
    }

    
    	  
}
