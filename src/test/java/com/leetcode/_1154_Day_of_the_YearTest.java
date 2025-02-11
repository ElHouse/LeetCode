package com.leetcode;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _1154_Day_of_the_YearTest {

    private final _1154_Day_of_the_Year dayOfTheYear = new _1154_Day_of_the_Year();

    @Test
    public void test1() {

        assertEquals(LocalDate.of(2019,2,10).getDayOfYear(), dayOfTheYear.dayOfYear("2019-02-10"));
        assertEquals(LocalDate.of(2019,1,9).getDayOfYear(), dayOfTheYear.dayOfYear("2019-01-09"));
        assertEquals(LocalDate.of(2016,3,15).getDayOfYear(), dayOfTheYear.dayOfYear("2016-03-15"));
        assertEquals(LocalDate.of(2017,4,30).getDayOfYear(), dayOfTheYear.dayOfYear("2017-04-30"));
        assertEquals(LocalDate.of(2018,12,28).getDayOfYear(), dayOfTheYear.dayOfYear("2018-12-28"));
        assertEquals(LocalDate.of(2011,6,5).getDayOfYear(), dayOfTheYear.dayOfYear("2019-06-05"));
        assertEquals(LocalDate.of(2019,11,28).getDayOfYear(), dayOfTheYear.dayOfYear("2019-11-28"));

    }
}