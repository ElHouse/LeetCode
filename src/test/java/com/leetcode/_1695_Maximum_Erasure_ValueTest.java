package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1695_Maximum_Erasure_ValueTest {

    private final _1695_Maximum_Erasure_Value maximumErasureValue = new _1695_Maximum_Erasure_Value();

    @Test
    public void test01(){

        assertEquals(17, maximumErasureValue.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
    @Test
    public void test02(){

        assertEquals(8, maximumErasureValue.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }

}