package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _735_Asteroid_CollisionTest {


    private final _735_Asteroid_Collision asteroidCollision = new _735_Asteroid_Collision();

    @Test
    public void test01() {
        assertArrayEquals(new int[]{5, 10}, asteroidCollision.asteroidCollision(new int[]{5, 10, -5}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[0], asteroidCollision.asteroidCollision(new int[]{5, -5}));
    }


    @Test
    public void test03() {
        assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, 2, -5}));
    }


    @Test
    public void test04() {
        assertArrayEquals(new int[]{-8, -8, -12}, asteroidCollision.asteroidCollision(new int[]{3, -8, -8, 9, 4, 7, 11, -1, 4, -12}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{-2, -1, 1, 2}, asteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[0], asteroidCollision.asteroidCollision(new int[]{2, 1, -1, -2}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[]{-2, -1, -1, -2}, asteroidCollision.asteroidCollision(new int[]{-2, -1, -1, -2}));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[]{-2, -1, -8}, asteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2, -8}));
    }
}