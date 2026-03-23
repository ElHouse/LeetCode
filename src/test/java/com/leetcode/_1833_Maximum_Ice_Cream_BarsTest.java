package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1833_Maximum_Ice_Cream_BarsTest {

    private final _1833_Maximum_Ice_Cream_Bars maximumIceCreamBars = new _1833_Maximum_Ice_Cream_Bars();


    @Test
    public void test01(){
        assertEquals(4, maximumIceCreamBars.maxIceCream(new int[]{1,3,2,4,1}, 7));
        assertEquals(0, maximumIceCreamBars.maxIceCream(new int[]{10,6,8,7,7,8}, 5));
        assertEquals(6, maximumIceCreamBars.maxIceCream(new int[]{1,6,3,1,2,5}, 20));

    }

}