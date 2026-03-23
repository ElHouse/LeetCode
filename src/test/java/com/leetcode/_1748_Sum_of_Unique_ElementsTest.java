package com.leetcode;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;

class _1748_Sum_of_Unique_ElementsTest {


    private _1748_Sum_of_Unique_Elements sumOfUniqueElements = new _1748_Sum_of_Unique_Elements();

    @Test
    public void test01(){
        assertEquals(4, sumOfUniqueElements.sumOfUnique(new int[]{1,2,3,2}));
    }

    @Test
    public void test02(){
        assertEquals(0, sumOfUniqueElements.sumOfUnique(new int[]{1,1,1,1}));
    }

    @Test
    public void test03(){
        assertEquals(15, sumOfUniqueElements.sumOfUnique(new int[]{1,2,3,4,5}));
    }

}