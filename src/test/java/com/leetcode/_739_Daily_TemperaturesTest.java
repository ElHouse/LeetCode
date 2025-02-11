package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _739_Daily_TemperaturesTest {

    _739_Daily_Temperatures daily_temperatures = new _739_Daily_Temperatures();

    @Test
    public void case1() {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};

        assertEquals("[1, 1, 1, 1, 3, 1, 0, 0]" , Arrays.toString(daily_temperatures.dailyTemperatures(T)));
    }

}