package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1431_Kids_With_the_Greatest_Number_of_CandiesTest {


    private final _1431_Kids_With_the_Greatest_Number_of_Candies kidsWithTheGreatestNumberOfCandies = new _1431_Kids_With_the_Greatest_Number_of_Candies();

    @Test
    public void test01() {
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertEquals(expected, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }


    @Test
    public void test02() {
        List<Boolean> expected = List.of(true, false, false, false, false);
        assertEquals(expected, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }


    @Test
    public void test03() {
        List<Boolean> expected = List.of(true, false, true);
        assertEquals(expected, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }

    @Test
    public void test04() {
        List<Boolean> expected = List.of(true, false, true);
        assertEquals(expected, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{50, 0, 51}, 50));
    }


    @Test
    public void test05() {
        List<Boolean> expected = List.of(true, true, true);
        assertEquals(expected, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{50, 50, 50}, 0));
    }

}