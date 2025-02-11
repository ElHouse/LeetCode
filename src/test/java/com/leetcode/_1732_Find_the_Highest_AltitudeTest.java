package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1732_Find_the_Highest_AltitudeTest {

    private final _1732_Find_the_Highest_Altitude findTheHighestAltitude = new _1732_Find_the_Highest_Altitude();

    @Test
    public void test1() {
        assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{-5,1,5,0,-7}));
    }
    @Test
    public void test2() {
        assertEquals(0, findTheHighestAltitude.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
    @Test
    public void test3() {
        assertEquals(4, findTheHighestAltitude.largestAltitude(new int[]{-5,1,5,0,-7, 10}));
    }
    @Test
    public void test4() {
        assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2,2}));
    }
    @Test
    public void test5() {
        assertEquals(1, findTheHighestAltitude.largestAltitude(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,1}));
    }

}