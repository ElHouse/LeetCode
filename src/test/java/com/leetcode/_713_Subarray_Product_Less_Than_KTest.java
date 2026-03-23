package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _713_Subarray_Product_Less_Than_KTest {

    private final _713_Subarray_Product_Less_Than_K subarrayProductLessThanK = new _713_Subarray_Product_Less_Than_K();


    @Test
    public void test01(){
        assertEquals(8, this.subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }

}