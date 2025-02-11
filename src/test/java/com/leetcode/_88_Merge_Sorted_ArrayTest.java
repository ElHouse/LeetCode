package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _88_Merge_Sorted_ArrayTest {

    _88_Merge_Sorted_Array mergeSortedArray = new _88_Merge_Sorted_Array();


    _88_Merge_Sorted_ArrayTest mergeSortedArrayTest = new _88_Merge_Sorted_ArrayTest();

    /*
     * Base test
     */
  //  @Test
    public void case1() {

        int[] nums1 = {2, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 5, 6};
        int n = 3;

        int[] result = {1, 2, 2, 3, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        assertEquals(Arrays.toString(result), Arrays.toString(nums1));
    }

//	/**
//	 * nums2 null and empty
//	 */
//	@Test
//	public void case2() {
//
//		//nums1.
//
//		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = {  };
//		int n = 0;
//
//		int[] result = { 1, 2, 3, 0, 0, 0 };
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//	/**
//	 * uno y uno
//	 */
//	@Test
//	public void case3() {
//
//		//nums1.
//
//		int[] nums1 = { 1, 3, 5, 0, 0, 0 };
//		int m = 3;
//		int[] nums2 = { 2, 4, 6 };
//		int n = 3;
//
//		int[] result = { 1, 2, 3, 4, 5, 6 };
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//	/**
//	 * nums 1 con msa espacios
//	 */
//	@Test
//	public void case4() {
//
//		//nums1.
//
//		int[] nums1 = { 1, 3, 5, 0, 0, 0, 0 , 0 ,0  };
//		int m = 3;
//		int[] nums2 = { 2, 4, 6 };
//		int n = 3;
//
//		int[] result = { 1, 2, 3, 4, 5, 6, 0 , 0 ,0 };
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//	/**
//	 * todos son iguales
//	 */
//	@Test
//	public void case5() {
//
//		//nums1.
//
//		int[] nums1 = { 5, 5, 5, 0, 0, 0, 0 , 0 ,0  };
//		int m = 3;
//		int[] nums2 = { 5, 5, 5 };
//		int n = 3;
//
//		int[] result = {5,5,5,5,5,5,0,0,0};
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//
//
//	/**
//	 * nulos
//	 */
//	@Test
//	public void case6() {
//
//		//nums1.
//
//		int[] nums1 = null;
//		int m = 0;
//		int[] nums2 = null;
//		int n = 0;
//
//		int[] result = null;
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
//
//	/**
//	 * nums2 con valores y nums solo con espacios
//	 */
//	@Test
//	public void case7() {
//
//		//nums1.
//
//		int[] nums1 = {0,0,0};
//		int m = 0;
//		int[] nums2 = {1,2,3};
//		int n = 3;
//
//		int[] result = {1,2,3};
//
//		merge(nums1, m, nums2, n);
//
//		assertEquals(Arrays.toString(nums1), Arrays.toString(result));
//	}
}