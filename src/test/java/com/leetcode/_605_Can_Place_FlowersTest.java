package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _605_Can_Place_FlowersTest {

    _605_Can_Place_Flowers can_place_flowers = new _605_Can_Place_Flowers();

    @Test
    public void case1() {

        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        assertTrue(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }


    @Test
    public void case2() {

        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        assertFalse(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }




    @Test
    public void case3() {

        int[] flowerbed = {0,0,0,0,0};
        int n = 3;
        assertTrue(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void case4() {

        int[] flowerbed = {1,0,0,0,0,1};
        int n = 2;
        assertFalse(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }


    @Test
    public void case5() {

        int[] flowerbed = {1,0,0,0,1,0,0};
        int n = 2;
        assertTrue(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void case6() {

        int[] flowerbed = {0,0,1,0,0};
        int n = 1;
        assertTrue(can_place_flowers.canPlaceFlowers(flowerbed, n));
    }

}