package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1196_How_Many_Apples_Can_You_Put_into_the_BasketTest {


    private final _1196_How_Many_Apples_Can_You_Put_into_the_Basket howManyApplesCanYouPutIntoTheBasket = new _1196_How_Many_Apples_Can_You_Put_into_the_Basket();

    @Test
    public void test01(){

        assertEquals(4, howManyApplesCanYouPutIntoTheBasket.maxNumberOfApples(new int[]{100,200,150,1000}));
        assertEquals(5, howManyApplesCanYouPutIntoTheBasket.maxNumberOfApples(new int[]{900,950,800,1000,700,800}));



        assertEquals(0, howManyApplesCanYouPutIntoTheBasket.maxNumberOfApples(new int[]{9900,9900,9900,9900,9900}));

        assertEquals(3, howManyApplesCanYouPutIntoTheBasket.maxNumberOfApples(new int[]{2500,2499,1}));
        assertEquals(2, howManyApplesCanYouPutIntoTheBasket.maxNumberOfApples(new int[]{2500,2500,1}));




    }

}