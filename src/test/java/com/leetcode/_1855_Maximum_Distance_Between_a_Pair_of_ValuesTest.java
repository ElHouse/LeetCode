package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1855_Maximum_Distance_Between_a_Pair_of_ValuesTest {


    private final _1855_Maximum_Distance_Between_a_Pair_of_Values maximumDistanceBetweenAPairOfValues = new _1855_Maximum_Distance_Between_a_Pair_of_Values();


    @Test
    public void test01() {
        assertEquals(2, maximumDistanceBetweenAPairOfValues.maxDistance(new int[]{55,30,5,4,2},new int[]{100,20,10,10,5}));
    }
    @Test
    public void test02() {
        assertEquals(1, maximumDistanceBetweenAPairOfValues.maxDistance(new int[]{2,2,2},new int[]{10,10,1}));
    }
    @Test
    public void test03() {
        assertEquals(2, maximumDistanceBetweenAPairOfValues.maxDistance(new int[]{30,29,19,5},new int[]{25,25,25,25,25}));
    }

    @Test
    public void test04() {
        assertEquals(27, maximumDistanceBetweenAPairOfValues.maxDistance(
                 new int[]{30,29,19,5},
                 new int[]{25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25}));
    }

}