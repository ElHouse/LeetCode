package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1231_Divide_ChocolateTest {


    private final _1231_Divide_Chocolate divideChocolate = new _1231_Divide_Chocolate();


    @Test
    public void test01(){

        assertEquals(6, divideChocolate.maximizeSweetness(new int[]{1,2,3,4,5,6,7,8,9}, 5));

    }

    @Test
    public void test02(){

        assertEquals(1, divideChocolate.maximizeSweetness(new int[]{5,6,7,8,9,1,2,3,4}, 8));

    }

    @Test
    public void test03(){

        assertEquals(5, divideChocolate.maximizeSweetness(new int[]{1,2,2,1,2,2,1,2,2}, 2));

    }

    @Test
    public void test04(){

        assertEquals(52832, divideChocolate.maximizeSweetness(new int[]{52832,63820,96186,1623,88717}, 3));

    }


    @Test
    public void test05(){

        assertEquals(19294, divideChocolate.maximizeSweetness(new int[]{22256,47646,19294,31272,75367}, 4));

    }

    @Test
    public void test06(){

        assertEquals(55382, divideChocolate.maximizeSweetness(new int[]{90670,55382,95298,95795,73204,41464,18675,30104,47442,55307}, 6));

    }


    @Test
    public void test07(){

        assertEquals(225735, divideChocolate.maximizeSweetness(new int[]{87506,32090,9852,96263,52415,67669,10703,27,98672,48664}, 1));

    }

}