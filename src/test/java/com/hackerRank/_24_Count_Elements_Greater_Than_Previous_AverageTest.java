package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _24_Count_Elements_Greater_Than_Previous_AverageTest {
    _24_Count_Elements_Greater_Than_Previous_Average countElementsGreaterThanPreviousAverage = new _24_Count_Elements_Greater_Than_Previous_Average();


    @Test
    public void test01() {


        assertEquals(4, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of(100,200,151,167,176)));
        assertEquals(4, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of(100,200,300,400,500)));

        assertEquals(2, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of(100, 200, 150, 300)));
        assertEquals(0, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of(100)));
        assertEquals(0, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of()));

        assertEquals(0, countElementsGreaterThanPreviousAverage.countResponseTimeRegressions(List.of(100,50,20,30,5)));

    }
}