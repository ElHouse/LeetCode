package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1962_Remove_Stones_to_Minimize_the_TotalTest {


    private final _1962_Remove_Stones_to_Minimize_the_Total removeStonesToMinimizeTheTotal  = new _1962_Remove_Stones_to_Minimize_the_Total();


    @Test
    public void test01(){
        assertEquals(12,removeStonesToMinimizeTheTotal.minStoneSum(new int[]{5,4,9}, 2));
    }
    @Test
    public void test02(){
        assertEquals(12,removeStonesToMinimizeTheTotal.minStoneSum(new int[]{4,3,6,7}, 3));
    }

    @Test
    public void test023(){
        assertEquals(4,removeStonesToMinimizeTheTotal.minStoneSum(new int[]{4,3,6,7}, 31));
    }


}