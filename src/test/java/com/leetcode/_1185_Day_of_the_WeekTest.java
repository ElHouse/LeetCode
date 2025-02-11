package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1185_Day_of_the_WeekTest {

    private final _1185_Day_of_the_Week day_of_the_week = new _1185_Day_of_the_Week();

    @Test
    public void case1() {
        assertEquals("Tuesday", day_of_the_week.dayOfTheWeek(31, 8, 2019));
    }

    @Test
    public void case2() {
        assertEquals("Wednesday", day_of_the_week.dayOfTheWeek(18, 7, 1999));
    }

    @Test
    public void case3() {
        assertEquals("Wednesday", day_of_the_week.dayOfTheWeek(15, 8, 1993));
    }
}