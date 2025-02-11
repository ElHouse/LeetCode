package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _11_Container_With_Most_WaterTest {

    private final _11_Container_With_Most_Water containerWithMostWater = new _11_Container_With_Most_Water();

    @Test
    public void test01() {
        assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }


    @Test
    public void test02() {
        assertEquals(1, containerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    public void test03() {
        assertEquals(56, containerWithMostWater.maxArea(new int[]{7, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void test04() {
        assertEquals(70, containerWithMostWater.maxArea(new int[]{7, 8, 6, 70, 70, 4, 8, 3, 7}));
    }

    @Test
    public void test05() {
        assertEquals(56, containerWithMostWater.maxArea(new int[]{70, 7, 6, 7, 7, 4, 8, 3, 7}));
    }

    @Test
    public void test06() {
        assertEquals(56, containerWithMostWater.maxArea(new int[]{7, 7, 6, 7, 7, 4, 8, 3, 700}));
    }

}