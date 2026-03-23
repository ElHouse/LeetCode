package com.leetcode;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class _2540_Minimum_Common_ValueTest {


    private final _2540_Minimum_Common_Value minimumCommonValue = new _2540_Minimum_Common_Value();


    @Test
    public void test01(){
        //assertEquals(2, minimumCommonValue.getCommon(new int[]{},new int[]{}));
        assertEquals(2, minimumCommonValue.getCommon(new int[]{1,2,3},new int[]{2,4}));
    }

    @Test
    public void test02(){
        assertEquals(2, minimumCommonValue.getCommon(new int[]{1,2,3,6},new int[]{2,3,4,5}));
    }


    @Test
    public void test03(){
        assertEquals(-1, minimumCommonValue.getCommon(new int[]{},new int[]{}));
    }

    @Test
    public void test04(){
        assertEquals(-1, minimumCommonValue.getCommon(new int[]{1},new int[]{3}));
    }


    @Test
    public void test05(){
        assertEquals(2, minimumCommonValue.getCommon(new int[]{1,1,2},new int[]{2,4}));
    }

    @Test
    public void test06(){
        assertEquals(8, minimumCommonValue.getCommon(new int[]{1,1,8},new int[]{2,8}));
    }

    @Test
    public void test7(){
        assertEquals(72, minimumCommonValue.getCommon(
                new int[]{5,15,16,20,22,39,43,44,44,55,61,62,62,64,72,73,81,88,90,95},
                new int[]{2,8,9,11,12,13,26,29,38,49,50,51,58,63,67,72,75,82,92,96}));
    }


    @Test
    public void test08(){
        assertEquals(-1, minimumCommonValue.getCommon(new int[]{3,5},new int[]{2}));
    }

}