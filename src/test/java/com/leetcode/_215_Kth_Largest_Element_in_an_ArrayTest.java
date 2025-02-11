package com.leetcode;

import com.leetcode._215_Kth_Largest_Element_in_an_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _215_Kth_Largest_Element_in_an_ArrayTest {


   private final _215_Kth_Largest_Element_in_an_Array kthLargestElementInAnArray = new _215_Kth_Largest_Element_in_an_Array();

    @Test
    void findKthLargest() {



        assertEquals(5, kthLargestElementInAnArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, kthLargestElementInAnArray.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }


}